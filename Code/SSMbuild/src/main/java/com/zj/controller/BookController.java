package com.zj.controller;

import com.zj.pojo.Books;
import com.zj.service.BookService;
import com.zj.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller层 调 service层
    @Autowired
    @Qualifier("bookServiceImpl")
    public BookServiceImpl bookServiceImpl;

    //查询全部的数据，并且返回一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model){

        List<Books> books = bookServiceImpl.queryBooks();
        model.addAttribute("books",books);

        return "allBook";
    }
}
