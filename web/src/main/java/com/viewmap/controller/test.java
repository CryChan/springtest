package com.viewmap.controller;


import com.alibaba.fastjson.JSONArray;
import model.fruit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by Administrator on 2015/11/25.
 */
@Controller
@RequestMapping(value="test")
public class test {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(Model model){
        return "/test";
    }

    @ResponseBody
    @RequestMapping(value = "/returnjson", method = RequestMethod.GET)
    public Object returnJson(){
        JSONArray jsonArray = new JSONArray();
        fruit apple = new fruit.buildfruit().name("apple").price("12").country("China").dobuild();
        fruit banana = new fruit.buildfruit().name("banana").price("14").country("Afrian").dobuild();
        fruit watermelon = new fruit.buildfruit().name("watermelon").price("16").country("Japan").dobuild();
        jsonArray.add(apple);
        jsonArray.add(banana);
        jsonArray.add(watermelon);
        return  jsonArray;
    }
}
