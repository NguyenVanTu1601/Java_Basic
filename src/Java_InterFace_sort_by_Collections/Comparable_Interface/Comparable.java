package Java_InterFace_sort_by_Collections.Comparable_Interface;

import java.util.ArrayList;
import java.util.Collections;

/*
    Các tính năng trong Comparable
    - Sắp xếp các đối tượng theo 1 tiêu chí duy nhất
    - Ham sap xep o ben lop con
 */
public class Comparable {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Nguyen Tu","B17DCCN642",3.15f,2));
        list.add(new Student("Phung Tung","B17DCCN666",3.2f,2));
        list.add(new Student("Dinh Trung","B17DCCN630",3.17f,2));

        System.out.println("Danh sach sau sap xep :");
        Collections.sort(list);
        // Arrays.sort();
        System.out.println(list);
    }

}
