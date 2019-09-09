package Java_InterFace_sort_by_Collections.Comparator;

import Java_InterFace_sort_by_Collections.Comparable_Interface.Student;

import java.util.ArrayList;
import java.util.Collections;

/*
     Sắp xếp theo nhiều tiêu chí khác nhau

 */
public class Comparator {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Nguyen Tu","B17DCCN642",3.15f,2));
        list.add(new Student("Phung Tung","B17DCCN666",3.2f,2));
        list.add(new Student("Dinh Trung","B17DCCN630",3.17f,2));
        System.out.println("Danh sach sau sap xep : ");
        Collections.sort(list, new SortByMark());
        System.out.println(list);

    }

}
