package Exception_Error;
/*
      - throw dùng trong thân phương thức , chỉ 1 ngoại lệ xác định thường sử dụng vs exception tự định nghĩa
        trực tiếp văng ngoại lệ , sử dụng khi đã biết exception và biết cách sửa chữa
      - throws dùng bên ngoài phương thức , chỉ ra các ngoại lệ có thể có
 */
public class Throw_and_throws {
    // check exception
    public static double divZero(int a, int b){
        if(b == 0) throw new ArithmeticException("Divide with by 0");
        return 1.0 *a / b;
    }

    public static void CoutTime(int n) throws InterruptedException /*,... ds các exception*/ {
        // uncheck exception
        for(int i = 0; i < n; i++){
            Thread.sleep(1000);
            System.out.println(i);
        }
    }

    public static  void main(String[] args) throws InterruptedException {
        CoutTime(5);
        try{
            double res = divZero(3,0);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}
