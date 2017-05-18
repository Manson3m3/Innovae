package com.innovae.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/16.
 */
@RestController
@EnableAutoConfiguration
public class test {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index()
    {
        return "Hello World!";
    }
}
