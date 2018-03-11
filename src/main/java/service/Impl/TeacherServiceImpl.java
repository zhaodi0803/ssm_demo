package service.Impl;

import bean.Teacher;
import dao.TeacherDao;
import org.springframework.stereotype.Service;
import service.ITeacherService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherServiceImpl implements ITeacherService {
    @Resource
    private TeacherDao teacherDao;
    public Integer addTeacher(Teacher teacher){

        return teacherDao.addTeacher(teacher);
    }

    public Integer updateTeacher(Teacher teacher) {

        return teacherDao.updateTeacher(teacher);
    }

    public Integer deleteTeacher(String id[]) {
        return teacherDao.deleteTeacher(id);
    }

    public List<Teacher> listTeacher(Teacher teacher) {
        return teacherDao.listTeacher(teacher);
    }

    public List<Teacher> listTeacherAndClass(Teacher teacher) {
        return teacherDao.listTeacherAndClass(teacher);
    }

    public List<Teacher> listTeacherAndClass1N(Teacher teacher) {
        return null;
    }
}
