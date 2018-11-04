package com.jnshu.service.impl;

import com.jnshu.beans.Student;
import com.jnshu.mapper.StudentMapper;
import com.jnshu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public void addStu(Student student) {
        studentMapper.addStu(student);
    }

    @Override
    public boolean delStuById(Integer id) {

        return studentMapper.delStuById(id);

    }

    @Override
    public boolean updateStuById(Integer id,String name, Integer qq, String type,
                               String time, String school, Integer onlineNumber,
                               String link, String wish, String teacher,
                               String whereKonw, Long createAt, Long updateAt) {
        return studentMapper.updateStuById(id,name, qq,type,time, school, onlineNumber,
                link,wish,teacher,whereKonw,createAt,updateAt);

    }

    @Override
    public Student selectStuById(Integer id) {
        Student student = studentMapper.selectStuById(id);
        return student;
    }

    @Override
    public List<Student> selectStuAll() {
        List<Student> list = studentMapper.selectStuAll();
        return list;
    }

    @Override
    public Student selectStuByName(String name) {
        Student student = studentMapper.selectStuByName(name);
        return student;
    }

    @Override
    public Student selectStuByOnlineNumber(Integer onlineNumber) {
        Student student = studentMapper.selectStuByOnlineNumber(onlineNumber);
        return student;
    }


}
