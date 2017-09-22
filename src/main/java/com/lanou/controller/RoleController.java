package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lizhongren1 on 2017/9/22.
 */
@Controller
@RequestMapping(value = "/role")
public class RoleController {

    @RequestMapping(value = "/role_list")
    public String roleList(){
        return "role/role_list";
    }

}
