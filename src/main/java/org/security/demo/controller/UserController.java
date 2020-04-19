package org.security.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:wangyupeng
 * @Date:2020/3/26
 * @Time:8:46 下午
 * @desc:
 **/
@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "你好";
    }

    @GetMapping("admin/hello")
    public String helloAdmin(){
        return "你好Adnmin";
    }

    @GetMapping("user/hello")
    public String helloUser(){
        return "你好User";
    }
}
