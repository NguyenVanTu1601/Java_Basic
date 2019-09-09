package CTDL;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_LinkedHashSet {
    public static void main(String[] args) {
        Set<Person> set = new LinkedHashSet<>();
        set.add(new Person(1));
        set.add(new Person(5));
        set.add(new Person(2));
        set.add(new Person(1));
        set.add(new Person(3));

        // Cần phải override lại các hàm hascode và equal do linkedhashset dùng nó để so sánh và loại bỏ các phần tử giống nhau
        // Đồng thời việc override hàm hascode giúp so sánh 2 đối tượng để xóa nó đi

        Iterator<Person> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().getId());
        }
        System.out.println("Sau khi xoa : ");
        set.remove(new Person(1));
        for (Person s : set) {
            System.out.println(s.getId());
        }
    }
}
