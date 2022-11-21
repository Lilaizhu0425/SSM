package com.lhz.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BooksDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public Integer getBookPriceId(Integer bookId) {
        String sql="SELECT price FROM book WHERE book_id=?";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class, bookId);
        return integer;

    }

    public void updateStock(Integer bookId) {
        String sql = "update book set stock = stock - 1 where book_id = ?";
        jdbcTemplate.update(sql, bookId);
    }

    public void updateBalance(Integer userId, Integer price) {
        String sql = "update t_user set balance = balance - ? where user_id = ?";
        jdbcTemplate.update(sql, price, userId);
    }
}
