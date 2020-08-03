package com.zj.dao;

import com.zj.pojo.Book;

import java.util.List;

public interface BookMapper {
    int addBook(Book book);
    int delBook(int id);
    int updateBook(Book book);
    Book queryBookById(int id);
    List<Book> queryBook();
}
