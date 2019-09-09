package Thread_Da_Luong;

public class My_Thread_Runnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("A" + i);
        }
    }
}
