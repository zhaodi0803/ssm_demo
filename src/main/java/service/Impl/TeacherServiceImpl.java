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
        System.out.println("-----------teacher_service:"+teacher.toString());
        return teacherDao.addTeacher(teacher);
    }
}
