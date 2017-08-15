package com.angular_springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.angular_springmvc.beans.Info;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping
    public String getIndexPage() {
        return "index";
    }
    @RequestMapping(value = "/saveInfo", method = RequestMethod.POST)
    public @ResponseBody void saveTrain(@RequestBody Info info) {
       System.out.println(info);
    }
}
