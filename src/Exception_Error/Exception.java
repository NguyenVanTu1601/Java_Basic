package Exception_Error;

import java.util.Scanner;

public class Exception {
    //Exception là những vấn đề xảy ra nhưng chương trình vẫn sửa được
    // Exception là những lối không mong muốn xảy ra
    // Khi xảy ra exception các lệnh phía sau ko thực hiện làm văng , ngắt quãng luồng chạy
    // => Phải xử lý các sự kiện của exception để ko ảnh hưởng tới các thành phần khác trong chương trình

    //Error là những nỗi quá nghiêm trọng và không sửa được
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // System.out.println(10/0);  Đây là 1 exception

        /*
        int[]arr = new int[5];
        int x = arr[6];
        -> Đây là exception về mảng , tràn mảng
         */
        int x = scanner.nextInt();
        System.out.println(x);
        int y = Integer.parseInt("123");
        System.out.println("Hello");


    }
}
