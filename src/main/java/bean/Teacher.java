package bean;

import java.util.Date;
import java.util.List;

public class Teacher {

    private String teacherId;
    private String teacherName;
    private Date createTime;
    private Clazz clazz;// 1:1

    private List<Clazz> clazzList;// 1:N



    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }




    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public List<Clazz> getClazzList() {
        return clazzList;
    }

    public void setClazzList(List<Clazz> clazzList) {
        this.clazzList = clazzList;
    }


    public String toString(){
        return this.teacherId + " " + this.teacherName + " " + this.createTime;
    }
}
