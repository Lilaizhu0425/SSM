package com.lhz.service;

public interface BookService {
    void buyBooks(Integer bookId, Integer userId) throws InterruptedException;
}
