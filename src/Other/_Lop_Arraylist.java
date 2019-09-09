package Other;

import java.util.ArrayList;

public class _Lop_Arraylist {
    public static void main(String[] args) {
        /*
        add() : Thêm vào
        get() : Xem
        remove() : Xóa
        indexOf(int ) : Tìm vị trí phần tử int
        add(int, ?) : thêm ? vào vị tri int
        set(int ,?) : thay đổi phần tử tại int thành ?
        clear() : xóa bỏ hết phần tử
        addAll() : thêm 1 araylist cùng kiểu
        clone() : coppy lại
        contains() : kiểm tra có ptu nào đó hay ko
        isEmpty() : kiểm tra rỗng
        toArray () : đổi sang mảng
        trimToSize() : 
         */

        /*
        ArrayList <Integer> list = new ArrayList<Integer>(10);
        Chỉ có nghĩa là nó có thể chứa tối đa 10 phần tử chứ hiện tại kích cỡ nó vẫn là 0 vì ko có ptu  nào cả
         */

        ArrayList <Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < 5; i++){
            list.add(i + 2);
        }

        list.remove(2);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println(list.indexOf(3));
    }

}

