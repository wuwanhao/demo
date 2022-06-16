package com.wwh.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 武万浩
 * @Date 2022/6/16 14:22
 * @Description
 */
@RestController
@RequestMapping("/hello")
public class DemoController {

    @RequestMapping("/demo")
    public String hello(){
        return "hello demo";
    }
}
