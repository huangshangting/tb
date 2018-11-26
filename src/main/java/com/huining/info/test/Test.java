package com.huining.info.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {

    @RequestMapping("/test")
    @ResponseBody
    public String firstHuiNingTest(){
        return "恭喜项目启动";
    }
}
