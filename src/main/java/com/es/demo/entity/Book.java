package com.es.demo.entity;

import java.io.Serializable;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * <p>@ProjectName:demo</p>
 * <p>@Package:com.es.demo.entity</p>
 * <p>@ClassName:Book</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/1/18 12:49</p>
 * <p>@Version:1.0</p>
 */
@Document(indexName = "stady")
public class Book implements Serializable
{
    private static final long serialVersionUID = 3092521946367732618L;

    private Integer id;

    private String bookName;

    private String anthor;

    public Book() {
    }

    public Book(Integer id, String bookName, String anthor) {
        this.id = id;
        this.bookName = bookName;
        this.anthor = anthor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAnthor() {
        return anthor;
    }

    public void setAnthor(String anthor) {
        this.anthor = anthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Book book = (Book) o;

        if (id != null ? !id.equals(book.id) : book.id != null)
            return false;
        if (bookName != null ? !bookName.equals(book.bookName) : book.bookName != null)
            return false;
        return anthor != null ? anthor.equals(book.anthor) : book.anthor == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bookName != null ? bookName.hashCode() : 0);
        result = 31 * result + (anthor != null ? anthor.hashCode() : 0);
        return result;
    }
}
