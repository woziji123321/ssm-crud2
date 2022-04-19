package com.wang.crud.serivice;

import com.wang.crud.bean.Department;
import com.wang.crud.bean.Msg;
import com.wang.crud.dao.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: DepartmentService
 * @Description
 * @Author:我自己
 * @Date: 2022/3/21  10:47
 * @Version 1.0
 */
@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    public List<Department> getDepts() {
        //查询所有部门信息
        List<Department> list = departmentMapper.selectByExample(null);
        return list;
    }
}
