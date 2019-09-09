package CTDL;

import java.util.ArrayList;
import java.util.List;

public class List_Arraylist {
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        ar.add(5);
        ar.add(6);
        ar.add(7);
        arr.addAll(ar);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        for (int p : arr) {
            System.out.println(p);
        }

        /*
        add(value) : them
        remove(index) : xoa
        Tốt nhất cho việc sắp xếp và truy suất dữ liệu còn thêm và xóa ko tốt lắm
         */
    }
}
