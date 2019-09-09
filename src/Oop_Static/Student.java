package Oop_Static;

public class Student {
    private String name;
    private String address;
    private  int StudentID;

    public static int id = 1000;
    public void setStudentID(){
        StudentID = id;
        id ++;
    }
    public int getStudentID(){
        return StudentID;
    }
}
