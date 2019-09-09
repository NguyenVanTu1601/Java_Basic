package Thread_Da_Luong;

public class Test_Thread extends Thread{
    private String Name;

    public Test_Thread(String name) {
        Name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i <= 5; i++){
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println(Name+ " " + i);
        }
    }

    public static void main(String[] args) {
        Test_Thread thread1 = new Test_Thread("a");
        Test_Thread thread2 = new Test_Thread("b");
        thread1.start();
        thread2.start();
    }
}
