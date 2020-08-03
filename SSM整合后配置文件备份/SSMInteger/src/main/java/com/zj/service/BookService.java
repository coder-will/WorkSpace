package com.zj.service;

import com.zj.pojo.Book;

import java.util.List;

public interface BookService {
    int addBook(Book book);
    int delBook(int id);
    int updateBook(Book book);
    Book queryBookById(int id);
    List<Book> queryBook();
}
