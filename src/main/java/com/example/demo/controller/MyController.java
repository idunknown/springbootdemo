package com.example.demo.controller;

import com.example.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author wuhy on 2018/5/29.
 */
@Controller
@RequestMapping(("/myPage"))
public class MyController {
    @Autowired
    private MyService myService;

    @GetMapping("/getUser")
    @ResponseBody
    public String getUser(){

        return  myService.getUser().toString();
    }
    @GetMapping("/saveUser")
    @ResponseBody
    public String saveUser(@RequestParam Map<String,String> map) throws  Exception{
        myService.saveUser(map);
      return "success";
    }
}
