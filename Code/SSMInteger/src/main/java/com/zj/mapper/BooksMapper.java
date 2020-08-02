package com.zj.mapper;

import com.zj.pojo.Books;

import java.awt.print.Book;
import java.util.List;

public interface BooksMapper {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(int id);
    //更新一本书
    int updateBook(Books books);
    //根据Id查询，返回一本书
    Books queryBookById(int id);
    //查询全部书
    List<Books> queryBooks();
}
