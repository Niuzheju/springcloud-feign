package com.niuzj.springcloudfeign.controller;

import com.niuzj.springcloudfeign.model.User;
import com.niuzj.springcloudfeign.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    private IHelloService helloService;

    private String result = "success";

    @RequestMapping("/hello")
    public String hello() {
        Map<String, Object> map = new HashMap<>();
        String hello = helloService.hello("nzj", "zyq", map);
        System.out.println(hello);
        return result;
    }

    @RequestMapping("/uri")
    public String uri() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "nzj");
        User user = helloService.uri(map);
        System.out.println(user);
        return result;
    }

    @RequestMapping("/addUser")
    public String addUser() {
        String user = helloService.addUser(new User("牛哲举", 24));
        System.out.println(user);
        return result;
    }
}
