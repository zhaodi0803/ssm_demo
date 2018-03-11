package dao;

import bean.Teacher;

public interface TeacherDao {
    public Integer addTeacher(Teacher teacher);

    public Integer updateTeacher(Teacher teacher);

    public Integer deleteTeacher(String id[]);


}
