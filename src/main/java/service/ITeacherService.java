package service;
import bean.*;

import java.util.List;

public interface ITeacherService {

    public Integer addTeacher(Teacher teacher);

    public Integer updateTeacher(Teacher teacher);

    Integer deleteTeacher(String id[]);

    List<Teacher> listTeacher(Teacher teacher);
    // 一对一
    List<Teacher> listTeacherAndClass(Teacher teacher);
    // 一对多
    List<Teacher> listTeacherAndClass1N(Teacher teacher);
}
