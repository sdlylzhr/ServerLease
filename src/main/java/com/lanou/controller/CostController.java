package com.lanou.controller;

import com.lanou.bean.Cost;
import com.lanou.service.impl.CostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lizhongren1 on 2017/9/22.
 */
@Controller
public class CostController {

    @Resource
    private CostService costService;

    @RequestMapping(value = "/fee/fee_list")
    public String costPage(){

        return "fee/fee_list";
    }

    @ResponseBody
    @RequestMapping(value = "/fee/allfee")
    public List<Cost> allCost(){

        List<Cost> costList = costService.listCostInfo();

        return costList;
    }

}
