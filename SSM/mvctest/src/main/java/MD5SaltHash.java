import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class MD5SaltHash {

    private static final int SALT_LENGTH = 16; // 盐值长度为16个字节

    /**
     * 生成随机盐值
     */
    public static byte[] generateSalt() {
        byte[] salt = new byte[SALT_LENGTH];
        SecureRandom random = new SecureRandom();
        random.nextBytes(salt);
        return salt;
    }

    /**
     * 使用MD5哈希和盐值加密密码
     */
    public static byte[] hashPassword(String password, byte[] salt) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(salt);
        byte[] hashedPassword = md.digest(password.getBytes());
        return hashedPassword;
    }

    /**
     * 检查密码是否匹配
     */
    public static boolean checkPassword(String password, byte[] salt, byte[] expectedHash) throws NoSuchAlgorithmException {
        byte[] actualHash = hashPassword(password, salt);
        if (actualHash.length != expectedHash.length) {
            return false;
        }
        for (int i = 0; i < actualHash.length; i++) {
            if (actualHash[i] != expectedHash[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        // 生成随机盐值
        byte[] salt = generateSalt();
        // 使用密码和盐值进行哈希
        byte[] hashedPassword = hashPassword("myPassword123", salt);
        // 检查密码是否匹配
        boolean passwordMatch = checkPassword("myPassword123", salt, hashedPassword);
        System.out.println("Password matches: " + passwordMatch);
    }
}