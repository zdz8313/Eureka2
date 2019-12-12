package com.oracle.hrb.firstekprovider.web;

import com.oracle.hrb.firstekprovider.bean.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public  Object getUser(HttpServletRequest request) throws InterruptedException {
        User user = new User();
        user.setName("张三");
        user.setPassword("123456");
        System.out.println("执行了getUser**********************");
        System.out.println(request.getRequestURL());
        //url显示路径
        user.setMsg(request.getRequestURL().toString());
        return  user;
    }
    @PostMapping
    public String addUser(@RequestBody User user){
        System.out.println("添加了用户"+ user );
        return "添加用户成功";
    }
}
