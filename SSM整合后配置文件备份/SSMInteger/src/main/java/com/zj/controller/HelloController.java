package com.zj.controller;

import com.zj.pojo.Book;
import com.zj.service.BookService;
import com.zj.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class HelloController {
    @Autowired
    private BookServiceImpl bookServiceImpl;

    @RequestMapping("/list")
    public String list(Model model){
        List<Book> books = bookServiceImpl.queryBook();
        model.addAttribute("books",books);
        return "list";
    }


}
