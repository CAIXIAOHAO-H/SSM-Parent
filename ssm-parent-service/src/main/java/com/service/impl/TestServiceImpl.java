package com.service.impl;

import com.api.bean.Students;
import com.api.bean.StudentsExample;
import com.api.dao.StudentsMapper;
import com.service.inter.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("TestService")
public class TestServiceImpl implements TestService {

    @Resource
    private StudentsMapper studentsMapper;

    public String sayHello() {
        return "this is testService";
    }

    public String getAllStudents() {
        StudentsExample studentsExample = new StudentsExample();
        List<Students> students = studentsMapper.selectByExample(studentsExample);
        return students.toString();
    }
}
