package Java_InterFace_sort_by_Collections.Comparable_Interface;

public class Student implements java.lang.Comparable<Student> {
    private String Name;
    private String numberID;
    private float avgMark;
    private int studentYears;
    public Student(){

    }

    public Student(String numberID) {
        this.numberID = numberID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNumberID() {
        return numberID;
    }

    public void setNumberID(String numberID) {
        this.numberID = numberID;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    public int getStudentYears() {
        return studentYears;
    }

    public void setStudentYears(int studentYears) {
        this.studentYears = studentYears;
    }

    public Student(String name, String numberID, float avgMark, int studentYears) {
        Name = name;
        this.numberID = numberID;
        this.avgMark = avgMark;
        this.studentYears = studentYears;
    }

    @Override
    public int compareTo(Student o) {
        String name1 = Name.substring(Name.lastIndexOf(" "));
        String name2 = o.Name.substring(o.Name.lastIndexOf(" "));
        return name1.compareTo(name2); // > thi sap xep
    }

    @Override
    public String toString() {
        return "\nName = " + Name + "\nID = " + numberID + "\nMark = " + avgMark + "\nYear = " + studentYears;
    }
}
