package bean;

import java.util.Date;

public class Teacher {

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

    private String teacherId;
    private String teacherName;
    private Date createTime;

    public String toString(){
        return this.teacherId + " " + this.teacherName + " " + this.createTime;
    }
}
