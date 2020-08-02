package com.zj.service;

import com.zj.pojo.Books;

import java.util.List;


//BookService:底下需要去实现,调用mapper层

public interface BookService {
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
