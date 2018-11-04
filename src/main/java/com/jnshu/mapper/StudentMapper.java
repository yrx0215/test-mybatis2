package com.jnshu.mapper;

import com.jnshu.beans.Student;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface StudentMapper {

    void addStu(Student student);

    boolean updateStuById(@Param("id")Integer id,@Param("name")String name,
                          @Param("qq")Integer qq,@Param("type")String type,@Param("time")String time,@Param("school")String school,
                          @Param("onlineNumber")Integer onlineNumber,@Param("link")String link ,@Param("wish")String wish,@Param("teacher")String teacher,
                          @Param("whereKonw")String whereKonw,@Param("createAt")Long createAt,@Param("updateAt")Long updateAt);

    Student selectStuById(Integer id);

    boolean delStuById(Integer id);

    List<Student> selectStuAll();

    Student selectStuByName(String name);

    Student selectStuByOnlineNumber(Integer onlineNumber);

}
