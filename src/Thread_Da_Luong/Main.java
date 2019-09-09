package Thread_Da_Luong;

public class Main {
    public static void main(String[] args) {
        My_Thread_Runnable my1 = new My_Thread_Runnable();
        Thread t = new Thread(my1);
        My_Thread my_thread = new My_Thread();
        t.start();
        my_thread.start();
    }


}
