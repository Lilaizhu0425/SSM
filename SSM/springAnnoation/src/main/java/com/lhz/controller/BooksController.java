package com.lhz.controller;

import com.lhz.service.impl.BooksSerciece;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Data
@Controller
public class BooksController {

    @Autowired(required = true)
    @Qualifier(value = "booksServiceImpl")
    private     BooksSerciece booksSerciece;
    /*@Autowired
    public BooksController(BooksSerciece booksSerciece) {
        this.booksSerciece = booksSerciece;
    }*/




    public void savreUser(){
        booksSerciece.saveUser();
    }

}
