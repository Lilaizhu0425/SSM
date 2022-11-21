package com.lhz.controller;

import com.lhz.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    public void buyBooks(Integer bookId, Integer userId) throws InterruptedException {
        bookService.buyBooks(bookId,userId);
    }
}
