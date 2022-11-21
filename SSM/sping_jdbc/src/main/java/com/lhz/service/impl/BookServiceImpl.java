package com.lhz.service.impl;

import com.lhz.dao.BooksDao;
import com.lhz.service.BookService;
import com.mysql.jdbc.TimeUtil;
import org.omg.CORBA.TIMEOUT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BooksDao booksDao;

    @Transactional(timeout = 3)
    public void buyBooks(Integer bookId, Integer userId) throws InterruptedException {
        TimeUnit.SECONDS.sleep(4);
        Integer price= booksDao.getBookPriceId(bookId);
        booksDao.updateStock(bookId);
        booksDao.updateBalance(userId, price);
    }
}
