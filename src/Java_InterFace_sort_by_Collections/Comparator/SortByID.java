package Java_InterFace_sort_by_Collections.Comparator;

import Java_InterFace_sort_by_Collections.Comparable_Interface.Student;

import java.util.Comparator;

public class SortByID implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getNumberID().compareTo(o2.getNumberID());
    }
}
