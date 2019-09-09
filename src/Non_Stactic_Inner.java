public class Non_Stactic_Inner {
    public class KID{
        public void Hi(){
            System.out.println("Hi Tu");
        }
    }
    public class Young extends KID{

    }
    public static void main(String[] args) {
        // Tao doi tuong
        Non_Stactic_Inner non = new Non_Stactic_Inner();
        Non_Stactic_Inner.KID ki = non.new KID();
        ki.Hi();
    }
}
