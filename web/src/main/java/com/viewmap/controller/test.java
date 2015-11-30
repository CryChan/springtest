package com.viewmap.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * Created by Administrator on 2015/11/25.
 */
@Controller
@RequestMapping(value="test")
public class test {

    @RequestMapping(value = "/hello")
    public String hello(Model model){
        return "/test";
    }
}
