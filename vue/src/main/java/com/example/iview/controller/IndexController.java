package com.example.iview.controller;

import com.example.iview.entity.EaUser;
import com.example.iview.entity.Vo;
import com.example.iview.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by pc on 2018/12/3 14:48
 **/
@Controller
public class IndexController {

    @Resource
    private TestService testService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/findData")
    public List<EaUser>findData(){
        List<EaUser>list=testService.findData();
        return list;
    }

    @ResponseBody
    @RequestMapping("/findByName")


    public List<Vo>findByName(String name){
        return testService.findByName(name);
    }


}
