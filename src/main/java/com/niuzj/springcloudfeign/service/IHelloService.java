package com.niuzj.springcloudfeign.service;

import com.niuzj.springcloudfeign.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * spring cloud feign 把要调用的http服务接口和java接口绑定在一起,方便调用
 * 接口绑定使用springMVC注解
 */
@FeignClient("provider")
public interface IHelloService {

    @RequestMapping(value = "/hello")
    String hello(@RequestParam(name = "name") String name, @RequestHeader("airen") String airen, @RequestBody Map<String, Object> map);

    @RequestMapping("/uri")
    User uri(@RequestBody Map<String, Object> map);

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    String put(@PathVariable("id") Integer id);

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    String delete(@PathVariable("id") Integer id);

    @RequestMapping("/addUser")
    String addUser(@RequestBody User user);









}
