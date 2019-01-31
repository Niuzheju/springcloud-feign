package com.niuzj.springcloudfeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient("provider")
public interface IHelloService {

    @RequestMapping(value = "/hello")
    String hello(@RequestParam(name = "name") String name, @RequestHeader("airen") String airen, @RequestBody Map<String, Object> map);

    @RequestMapping("/uri")
    String uri(@RequestBody Map<String, Object> map);

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    String put(@PathVariable("id") Integer id);

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    String delete(@PathVariable("id") Integer id);









}
