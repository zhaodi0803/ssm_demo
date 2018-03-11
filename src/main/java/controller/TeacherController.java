package controller;

import bean.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.ITeacherService;
import sun.misc.Request;

import java.util.*;
import javax.annotation.Resource;

@Controller
public class TeacherController {
    @Resource
    private ITeacherService teacherService;

    /**
     * 新增教师
     * @param teacher
     * @return
     */
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

    /**
     * 修改教师
     * @param teacher
     * @return
     */
    @RequestMapping(value = "/teacher",method = RequestMethod.PUT)
    @ResponseBody
    public String updateTeacherByID(@RequestBody Teacher teacher){

       int count =  teacherService.updateTeacher(teacher);
        if(count >0 ){
            return "修改教师成功";
        }else{
            return "修改教师失败";
        }
    }

    /**
     * 删除教师
     * @param ids 删除的主键集合数组
     * @return
     */
    @RequestMapping(value = "/teacher",method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteTeacher(@RequestParam("ids") String ids){
     String id[] =   ids.split(",");
        int count = teacherService.deleteTeacher(id);
        if(count >0 ){
            return "删除教师成功";
        }else{
            return "删除教师失败";
        }
    }
    @RequestMapping(value = "/teacher",method = RequestMethod.GET)
    @ResponseBody
    public List<Teacher> listTeacher(Teacher teacher){
        return teacherService.listTeacher(teacher);
    }

    /**
     * 一对一
     * @param teacher
     * @return
     */
    @RequestMapping(value = "/teacher_class",method = RequestMethod.GET)
    @ResponseBody
    public List<Teacher> listTeacherAndClass(Teacher teacher){
        return teacherService.listTeacherAndClass(teacher);
    }

    /**
     * 一对多
     * @param teacher
     * @return
     */
    @RequestMapping(value = "/teacher_class_1",method = RequestMethod.GET)
    @ResponseBody
    public List<Teacher> listTeacherAndClass1N(Teacher teacher){
        return teacherService.listTeacherAndClass1N(teacher);
    }
}
