package com.lhz.dao;

public interface BooksDao {
    Integer getBookPriceId(Integer bookId);

    void updateStock(Integer bookId);

    void updateBalance(Integer userId, Integer price);
}
