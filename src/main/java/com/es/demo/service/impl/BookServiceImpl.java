package com.es.demo.service.impl;

import com.es.demo.entity.Book;
import com.es.demo.repository.BookRepository;
import com.es.demo.service.BookService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

/**
 * <p>@ProjectName:qmpo-bi</p>
 * <p>@Package:cn.qm.qmf.bs.service.impl</p>
 * <p>@ClassName:BookServiceImpl</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/1/16 15:42</p>
 * <p>@Version:1.0</p>
 */
@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    private ElasticsearchTemplate template;

    @Autowired
    private BookRepository repository;

    @Override
    public Book saveBook(Book book) {
        return repository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return repository.save(book);
    }

    @Override
    public void deleteBook(Book book) {
        repository.delete(book);
    }

    @Override
    public List<Book> findBook() {
        Iterable<Book> all = repository.findAll();
        List<Book> books = new ArrayList<>();
        all.forEach(a -> books.add(a));
        return books;
    }
}
