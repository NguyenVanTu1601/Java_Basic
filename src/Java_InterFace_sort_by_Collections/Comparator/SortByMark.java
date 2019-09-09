package Java_InterFace_sort_by_Collections.Comparator;

import Java_InterFace_sort_by_Collections.Comparable_Interface.Student;

import java.util.Comparator;

public class SortByMark implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        //Khong the sap xep truc tiep do kieu tra ve la int ma Mark co kieu float
        float res = o1.getAvgMark() - o2.getAvgMark();
        if(res > 0) return -1; // Khong  lam gi
        else if(res < 0) return 1; // sap xep
        return 0;

    }
}
