package com.ypf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by geely on 2015/11/22.
 */
@Controller
public class TestController {

    @RequestMapping(value = "index.do")
    @ResponseBody
    public String hello(){
        return "hello world";
    }

}
