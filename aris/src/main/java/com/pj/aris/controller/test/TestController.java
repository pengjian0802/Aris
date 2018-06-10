package com.pj.aris.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pengjian on 2018/6/10.
 */
@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("test1")
    public String test1(){
        System.out.print("************************************************************");
        return "main";
    }
}
