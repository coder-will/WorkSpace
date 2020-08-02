package com.zj.service;

import com.zj.dao.BookMapper;
import com.zj.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookMapper booksMapper;

    public void setBooksMapper(BookMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    public int addBook(Books books) {

        return booksMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return booksMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return booksMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return booksMapper.queryBookById(id);
    }

    public List<Books> queryBooks() {
        return booksMapper.queryBooks();
    }
}
