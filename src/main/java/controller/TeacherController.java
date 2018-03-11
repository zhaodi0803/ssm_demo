package controller;

import bean.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ITeacherService;
import java.util.*;
import javax.annotation.Resource;

@Controller
public class TeacherController {
    @Resource
    private ITeacherService teacherService;

    @RequestMapping(value = "/teacher",method = RequestMethod.POST)
    @ResponseBody
    public String addTeacher(@RequestBody Teacher teacher){
        System.out.println(teacher);
        Teacher teacher1 = new Teacher();
        teacher1.setTeacherId(teacher.getTeacherId());
        teacher1.setTeacherName(teacher.getTeacherName());
        teacher1.setCreateTime(new Date());

        int count = teacherService.addTeacher(teacher1);
        if(count >0 ){
            return "新增教师成功";
        }else{
            return "新增教师失败";
        }

    }
}
