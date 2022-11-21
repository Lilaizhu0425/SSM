package com.lhz.controller;

import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        buchongfu();

    }

    private static void eightOut() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String next = scanner.next();

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(next);
            int length = next.length();
            if(length%8!=0){

                int start=8-length%8;
                for (int i = 0; i < start; i++) {

                    stringBuilder.append("0");
                }

            }
            String string = stringBuilder.toString();

            while (string.length()!=0){

                System.out.println(string.substring(0,8));
                 string = string.substring(8);


            }


        }

    }
    private static void jinzhi(){

        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        next =next.substring(2);
        System.out.println(Long.parseLong(next,16));


    }
    private static void jinshi(){
        Scanner scanner = new Scanner(System.in);
        double v = scanner.nextDouble();
        BigDecimal bigDecimal = new BigDecimal(v);

        BigDecimal bigDecimal1 = bigDecimal.setScale(0, RoundingMode.UP);
        System.out.println(bigDecimal.intValue());

    }
    private  static  void hebing(){
        Scanner scanner = new Scanner(System.in);
        int leng = scanner.nextInt();

        Map<Integer,Integer> table=new HashMap<Integer, Integer>(leng);
        for (int i = 0; i < leng; i++) {
            Scanner scanner1 = new Scanner(System.in);
            int key = scanner1.nextInt();
            int value = scanner1.nextInt();
            if(table.containsKey(key)){
                table.put(key,table.get(key)+value);
            }else {

                table.put(key,value);
            }



        }

        for (Integer integer : table.keySet()) {

            System.out.println(integer+"  "+table.get(integer));

        }

    }
    private static void buchongfu(){
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        TreeSet<String> strings = new TreeSet<String>();

        for (int length = next.length()-1; length >= 0; length--) {
            char c = next.charAt(length);
            String s = String.valueOf(c);

            StringBuilder stringBuilder = new StringBuilder(c);


            strings.add(s);

        }
        System.out.println(strings.size());
    }

}
