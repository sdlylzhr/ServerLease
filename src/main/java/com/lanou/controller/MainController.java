package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lizhongren1 on 2017/8/18.
 */

@Controller
public class MainController {

    // 首页方法
    @RequestMapping(value = "/")
    public String frontPage(){

        return "index";
    }


    // 首页方法
    @RequestMapping(value = "/index")
    public String indexPage(){

        return "index";
    }


    // 资费页面方法


}
