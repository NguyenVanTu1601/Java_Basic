package Ke_thua;

import java.util.Objects;

public class Student extends Person{
    private String studentID; // ma sinh vien
    private String univerName; // ten truong
    private float avgMark; // điểm tb

    public Student(){

    }
    public Student(String studentID, String univerName, float avgMark) {
        this.studentID = studentID;
        this.univerName = univerName;
        this.avgMark = avgMark;
    }

    public Student(String fullName, String ID, String studentID, String univerName, float avgMark) {
        super(fullName, ID);
        this.studentID = studentID;
        this.univerName = univerName;
        this.avgMark = avgMark;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getUniverName() {
        return univerName;
    }

    public void setUniverName(String univerName) {
        this.univerName = univerName;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("StudentID = " + studentID);
        System.out.println("University Name = " + univerName);
        System.out.println("Avg Mark = " + avgMark);
    }

    @Override
    public boolean equals(Object otherObject) {
        if(!super.equals(otherObject)) return false;
        /* Có thể thay dòng bên trên bằng instanceof */
       // if(! (otherObject instanceof Student)) return false; _ hoi sai ti
        Student student = (Student) otherObject;
        return avgMark == student.avgMark
                && Objects.equals(studentID,student.studentID)
                && Objects.equals(univerName,student.univerName);
    }

    @Override
    public String toString() {
        return super.toString() + "\nStudentID = " + studentID + "\nUniversity Name = " + univerName + "\nAVG Mark = " + avgMark ;
    }
}
