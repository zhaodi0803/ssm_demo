package dao;

import bean.Teacher;

import java.util.List;

public interface TeacherDao {
    public Integer addTeacher(Teacher teacher);

    public Integer updateTeacher(Teacher teacher);

    public Integer deleteTeacher(String id[]);

    public List<Teacher> listTeacher(Teacher teacher);

    // 一对1
    public List<Teacher> listTeacherAndClass(Teacher teacher);

    public List<Teacher> listTeacherANdClass1N(Teacher teacher);
}
