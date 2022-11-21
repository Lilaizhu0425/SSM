package com.lhz.controller;

import com.lhz.service.impl.BooksSerciece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller()

public class BooksController {

    @Autowired
     @Qualifier("booksSaaerviceImpl ")
    BooksSerciece booksSerciece;
    /*@Autowired
    public BooksController(BooksSerciece booksSerciece) {
        this.booksSerciece = booksSerciece;
    }*/




    public void savreUser(){
        booksSerciece.saveUser();
    }

}
