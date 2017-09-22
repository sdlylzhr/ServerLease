package com.lanou.controller;

import com.lanou.bean.Student;
import com.lanou.mapper.StudentMapper;
import com.lanou.service.StudentService;
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

    @Resource
    private StudentService service;

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


    @RequestMapping(value = "/getall")
    @ResponseBody
    public List<Student> jsonReq(){

        List<Student> studentList = service.findAll();

        System.out.println(studentList);

        return studentList;
    }


    @RequestMapping(value = "/addnew")
    @ResponseBody
    public Student insertNew(Student student){

        Student student1 = service.addNew(student);

        return student1;
    }

}
