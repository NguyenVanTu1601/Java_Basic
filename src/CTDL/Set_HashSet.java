package CTDL;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.lang.Integer;
public class Set_HashSet {
    /*
     + Các phần tử trong set không bị trùng lặp
     + Trong set các phần tử đã sắp xếp và không đảm bảo thứ tự như ban đầu
    */
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(5);
        set.add(1);
        set.add(3);
        set.add(4);
        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
