package com.es.demo.service;

import com.es.demo.entity.Book;
import java.util.List;

/**
 * <p>@ProjectName:qmpo-bi</p>
 * <p>@Package:cn.qm.qmf.bs.service</p>
 * <p>@ClassName:BookService</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/1/16 15:42</p>
 * <p>@Version:1.0</p>
 */
public interface BookService {

    Book saveBook(Book book);

    Book updateBook(Book book);

    void deleteBook(Book book);

    List<Book> findBook();
}
