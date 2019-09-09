package Java_InterFace_sort_by_Collections.Comparator;

import Java_InterFace_sort_by_Collections.Comparable_Interface.Student;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        String name = o1.getName().substring(o1.getName().lastIndexOf(" "));
        String name2 = o2.getName().substring(o2.getName().lastIndexOf(" "));
        return name.compareTo(name2);
        // sx giam name2.copareto(name);
    }
}
