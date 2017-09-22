package com.lanou.service.impl;

import com.lanou.bean.Cost;
import com.lanou.mapper.CostMapper;
import com.lanou.service.ICostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lizhongren1 on 2017/9/22.
 */
@Service
public class ICostServiceImpl implements ICostService {

    @Resource
    private CostMapper costMapper;

    public List<Cost> listCostInfo() {




        return null;
    }
}
