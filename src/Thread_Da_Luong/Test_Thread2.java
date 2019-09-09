package Thread_Da_Luong;
/* Đat tem cho Thread*/
/*
Join() dùng để bắt các thread khác đợi 1 thread nào đó hoàn thành hoặc dùng hết số time để trong join()
 */
public class Test_Thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            try{
                Thread.sleep(200);
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println(this.getName() + i);
        }
    }

    public static void main(String[] args) {
        Test_Thread2 ts1 = new Test_Thread2();
        ts1.setName("Tu");
        Test_Thread2 ts2 = new Test_Thread2();
        ts2.setName("Tung");
        ts1.start();
        try{
            ts1.join(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        ts2.start();

    }
}
