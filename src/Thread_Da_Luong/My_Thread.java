package Thread_Da_Luong;

public class My_Thread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println("B" + i);
        }
    }
}
