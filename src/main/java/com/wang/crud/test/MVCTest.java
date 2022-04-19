/*
package com.wang.crud.test;

import com.github.pagehelper.PageInfo;
import com.wang.crud.bean.Employee;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml",
        "file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml"})
public class MVCTest {

    // 传入Spring MV的ioc
    @Autowired
    WebApplicationContext context;

    // 虚拟 mvc 请求，获取到处理结果
    MockMvc mockMvc;

    @Before
    public void initMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testPage() throws Exception {
        // 模拟请求拿到返回值
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/emps")
                .param("pn", "5")).andReturn();

        // 请求成功以后，请求域中会有 pageInfo
        MockHttpServletRequest request = result.getRequest();
        PageInfo page = (PageInfo) request.getAttribute("pageInfo");
        System.out.println("当前页码：" + page.getPageNum());
        System.out.println("总页码：" + page.getPages());
        System.out.println("总记录数：" + page.getTotal());
        System.out.println("在页面需要连续显示的页码");
        int[] nums = page.getNavigatepageNums();
        for (int num : nums)
            System.out.print(" " + num);
        System.out.println();

        List<Employee> emps = page.getList();
        for (Employee emp : emps)
            System.out.println("ID：" + emp.getEmpId() + "==>Name：" + emp.getEmpName());
    }
}
*/
