package com.simpleRestApi.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller@RequestMapping("/rest/home") class HomeController {
    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String hello(){
        return "ответ с endpoint rest/home";
    }
}
