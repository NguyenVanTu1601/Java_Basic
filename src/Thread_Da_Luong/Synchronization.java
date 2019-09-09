package Thread_Da_Luong;

public class Synchronization extends Thread{
    public  int tong;
    public Synchronization(){
        this.tong = 1000;
    }

    public synchronized void rut(){
        if(tong > 0){
            tong = tong - 1000;
            System.out.println(tong);
        }
        else System.out.println("Khong rut duoc tien");

    }
    @Override
    public void run() {
        rut();
    }

    public static void main(String[] args) {
        Synchronization s1 = new Synchronization();
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s1);
        t1.start();
//        try{
//            t1.join(1000);
//        }catch(InterruptedException e){
//            e.printStackTrace();
//        }
        t2.start();
    }
}
