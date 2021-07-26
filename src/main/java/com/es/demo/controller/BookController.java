package com.es.demo.controller;

import com.es.demo.entity.Book;
import com.es.demo.service.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>@ProjectName:qmpo-bi</p>
 * <p>@Package:cn.qm.qmf.bs</p>
 * <p>@ClassName:BookController</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/1/16 15:55</p>
 * <p>@Version:1.0</p>
 */
@RestController
@RequestMapping("es")
public class BookController {

    @Autowired
    private BookService bookService;

    @CrossOrigin
    @GetMapping("save")
    public Book save(){
        Book book = bookService.saveBook(new Book((int)(Math.random()*100), "西游记"+(int)Math.random()*100, "不知道"));
        return book;
    }

    @CrossOrigin
    @GetMapping("list")
    public List<Book> list(){
        List<Book> book = bookService.findBook();
        return book;
    }

    @CrossOrigin
    @GetMapping("delete")
    public void delete(){
        bookService.deleteBook(new Book(2,"西游记","不知道"));
    }

    @CrossOrigin
    @GetMapping("update")
    public Book update(){
        Book book = bookService.updateBook(new Book(88, "三国演义", "也不知道"));
        return book;
    }

}
