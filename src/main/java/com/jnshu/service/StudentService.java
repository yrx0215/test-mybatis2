package com.jnshu.service;

import com.jnshu.beans.Student;

import java.util.List;

public interface StudentService {
    void addStu(Student student);

    boolean delStuById(Integer id);

    boolean updateStuById(Integer id,String name,Integer qq,String type,String time,String school,
                            Integer onlineNumber,String link ,String wish,String teacher,String whereKonw,
                            Long createAt,Long updateAt);


    Student selectStuById(Integer id);

    List<Student> selectStuAll();

    Student selectStuByName(String name);

    Student selectStuByOnlineNumber(Integer onlineNumber);


}
