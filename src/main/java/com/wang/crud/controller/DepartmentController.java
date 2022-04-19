package com.wang.crud.controller;

import com.wang.crud.bean.Department;
import com.wang.crud.bean.Msg;
import com.wang.crud.serivice.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName: DepartmentController
 * @Description:处理部门有关的请求
 * @Author:我自己
 * @Date: 2022/3/21  10:44
 * @Version 1.0
 */
@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    /**
     * 返回所有部门信息
     */
    @RequestMapping("/depts")
    @ResponseBody
    public Msg getDepts() {
        List<Department> list = departmentService.getDepts();
        return Msg.success().add("depts", list);
    }
}
