package com.jnshu;

import com.jnshu.beans.Student;
import com.jnshu.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestStudent {
    @Autowired
    StudentServiceImpl studentService;

//    @Test
//    public void testadd() {
//
//    }

    @Test
    public void testSelectAll() {
        List list= studentService.selectStuAll();
        System.out.println("list : " + list);
    }

    @Test
    public void testSelectStuById() {
        Student student = studentService.selectStuById(1);
        System.out.println("student : " + student);
    }

    @Test
    public void testSelectByName() {
        Student student = studentService.selectStuByName("yangruoxi");
        System.out.println(student);
    }

    @Test
    public void testSelectByOnlineNumber() {
        Student student = studentService.selectStuByOnlineNumber(51460);
        System.out.println(student);
    }
    @Test
    public void  testAdd() {

        Student student = new Student();
        student.setName("teststu");
        student.setQq(111111);
        student.setOnlineNumber(7777);
        student.setLink("www.baidu.com");
        student.setSchool("ncut");
        student.setTeacher("zjz");
        student.setTime("123321");
        student.setType("java");
        student.setWhereKonw("bihu");
        student.setWish("upup");

        studentService.addStu(student);


    }



    @Test
    public void testdelStu() {
        boolean i = studentService.delStuById(999);
        System.out.println("是否删除成功: " + i);
    }

    @Test
    public void testUpdate() {
        boolean i =  studentService.updateStuById(3,"updateTest",123456,"web",
                "20181111","ncut",543221,
                "baidu","upup","zjz",
                "逼乎",null,null);
        System.out.println("是否更新成功 : " + i);
    }
}
