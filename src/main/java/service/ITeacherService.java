package service;
import bean.*;
public interface ITeacherService {

    public Integer addTeacher(Teacher teacher);

    public Integer updateTeacher(Teacher teacher);

    Integer deleteTeacher(String id[]);
}
