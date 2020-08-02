package swjtu.springbootjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/jdbc")
public class JdbcController {
    @Autowired
    JdbcTemplate jdbcTemplate;

//    查询Employee表中的所有数据
    @RequestMapping("/list")
    public List userList(){
        String sql = "select * from employee";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;
    }

//    插入一个用户
    @RequestMapping("/add")
    public String addUser(){
        /**
         * 疑问1：为什么new Date写法不同
         */
        String sql = "insert into employee(last_name,email,gender,department,birth) " +
                "values ('张杰','keyubukeqiu1997@163.com',1,101,'"+new Date().toLocaleString()+"')";
        jdbcTemplate.update(sql);
        return "插入成功";
    }

//    修改用户信息

    @RequestMapping("/update/{id}")
    public String updateuser(@PathVariable("id") int id){
        /**
         * 疑问2:为什么不能用list进行呢？
         */
//      @PathVariable的作用就是把网址里面的参数传进来
        String sql = "update employee set last_name=? , email=? where id="+id;
//        List<Object> list = new ArrayList<Object>();
//        list.add("小杰");
//        list.add("dafsadfa@1997.com");
        Object[] objects = new Object[2];
        objects[0] = "张杰";
        objects[1] = "keyubuke@daf.com";
        jdbcTemplate.update(sql,objects);
        return "修改完成";

    }

//    删除用户信息
    @RequestMapping("/del/{id}")
    public String delUser(@PathVariable("id") int id){
        String sql = "delete from employee where id="+id;
        jdbcTemplate.update(sql);
        return "删除成功";
    }

}
