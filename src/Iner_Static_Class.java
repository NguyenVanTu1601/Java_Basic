public class Iner_Static_Class {
    // iner static class
    /*
    class inner giống mọi class bình thường
     */
    public  static  class Kid{
        public void Hello(){
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        // Khai báo biến
        Iner_Static_Class.Kid kid = new Iner_Static_Class.Kid();
        kid.Hello();
    }
}
