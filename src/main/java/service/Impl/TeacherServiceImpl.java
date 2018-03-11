package service.Impl;

import bean.Teacher;
import dao.TeacherDao;
import org.springframework.stereotype.Service;
import service.ITeacherService;

import javax.annotation.Resource;

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
}
