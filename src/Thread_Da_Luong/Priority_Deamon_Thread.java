package Thread_Da_Luong;

public class Priority_Deamon_Thread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5 ; i++) {
            try{
                Thread.sleep(2000);
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println(this.getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        Priority_Deamon_Thread ps1 = new Priority_Deamon_Thread();
        Priority_Deamon_Thread ps2 = new Priority_Deamon_Thread();
        Priority_Deamon_Thread ps3 = new Priority_Deamon_Thread();
        Priority_Deamon_Thread ps4 = new Priority_Deamon_Thread();
        //Thread s1 = new Thread(ps1);
        ps1.setName("A");
        ps2.setName("B");
        ps3.setName("C");
        ps4.setName("Deamon");
        ps1.setPriority(1);
        /* Priority phân chia các cấp độ ưu tiên , thấp nhất là 1 và cao nhất là 10;
         */
        ps2.setPriority(10);
        ps3.setPriority(5);
        ps1.start();
        ps2.start();
        ps3.start();
        //s1.start();
        ps4.setDaemon(true);
        System.out.println(ps4.isDaemon());
    }
}
