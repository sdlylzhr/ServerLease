package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by lizhongren1 on 2017/9/22.
 */
@Controller
public class CostController {

    @RequestMapping(value = "/fee/fee_list")
    public String costPage(){

        return "fee/fee_list";
    }

    @RequestMapping(value = "/fee/allfee")
    public List<Object> allCost(){




        return null;
    }

}
