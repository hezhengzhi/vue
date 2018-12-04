package com.example.iview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pc on 2018/12/3 14:48
 **/
@Controller
public class IndexController {
    @RequestMapping("/index")


    public String index(){
        return "index";
    }
}
