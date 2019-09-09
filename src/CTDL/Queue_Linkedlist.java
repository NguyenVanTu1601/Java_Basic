package CTDL;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Linkedlist {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Tu");
        queue.add("Tung");
        queue.add("Trung");
        queue.add("Viet");
        // Có thể xóa phần tử bất kì remove(value);
        while(!queue.isEmpty()){
            System.out.println(queue.peek()); // In ra dinh queue
            queue.remove(); // Xoa phan tu dau tien queue
        }
        /*
        queue.remove("Trung");
        Iterator<String> itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        */

    }
}
