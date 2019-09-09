package Exception_Error;

import java.util.Scanner;

/*
    Các trường hợp có thể xảy ra với try-catch và try-catch-finally
        1.Ngoại lệ xảy ra trong khối Try và được xử lý trong khối catch
        2.Ngoại lệ xảy ra trong khối Try nhưng không được xử lý trong khối catch => chương trình kết thúc(ko có finally)
        3.Ngoại lệ không xảy ra trong khối Try
    Các trường hợp có thể gặp với Try-finally
        1.Ngoại lệ xảy ra trong khối Try
        2.Ngoại lệ không xảy ra trong khối Try
 */

/**
 * Chia 0 : ArithmeticException
 * String : NullPointerException
 * Mảng có số phần tử âm : NegativeArraySizeException
 * Liên quan file : FileNotFoundException
 *  : InterruptedException
 */
public class Try_catch_finally {
    /*
          Lỗi trong try sẽ được thông báo hoặc xử lý trong catch
          Đồng thời các lệnh sau lệnh lỗi trong try sẽ không được thực thi
     */

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        try{
            for(int i = 3; i >= 0; i--){
                System.out.println(10 / i);
            }

        } catch(ArithmeticException e){
            //catch(Exception e){
            System.out.println("Loi exception divide zero : " +e.getMessage());
        } finally {
            System.out.println("Vao khoi finally");
        }

        // Nếu exception trong catch không biết tên thì thay vào đó sẽ gọi Exception
        // Do exception là lớp cha của mọi lớp exception con

        // Khối finally luôn được thực hiện dù có exception và exception có được xử lý hay không


    }



}
