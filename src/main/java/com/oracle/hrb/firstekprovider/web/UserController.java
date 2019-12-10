package com.oracle.hrb.firstekprovider.web;

import com.oracle.hrb.firstekprovider.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public  Object getUser(HttpServletRequest request) {
        User user = new User();
        user.setName("张三");
        user.setPassword("123456");
        System.out.println("执行了getUser**********************");
        System.out.println(request.getRequestURL());
        //url显示路径
        user.setMsg(request.getRequestURL().toString());
        return  user;
    }
}
