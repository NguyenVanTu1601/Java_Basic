package model;

public class Student {
    private String Name;
    private String ID;
    private String faculty;

    public Student(String name, String ID, String faculty) {
        Name = name;
        this.ID = ID;
        this.faculty = faculty;
    }

    public Student(){

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void doExemple(){

    }

}
