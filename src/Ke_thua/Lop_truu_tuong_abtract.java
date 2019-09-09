package Ke_thua;

public class Lop_truu_tuong_abtract {
    public static void main(String[] args) {
        /*
        -Để tạo lớp trừu tượng _ abstract ta thêm keyword abstract trước trên class hoặc trên phương thức
        -Các phương thức trong lớp abstract không được có chức năng
        VD : Chỉ khai báo :  public String getID(){}; Mục đích để phương thức chỉ khai báo ra là có nhưng ko cần thực hiện công việc gì
        Không khai bao : public String getID() {
                            return ID;
                        }
                        Việc thực hiện return .. vân vân sẽ khai báo trong các lớp con
         - Nếu person là lớp abstract thì không có khởi tạo
        VD : Person person = new Person(); là không hợp lệ
        Mà chỉ có Person person = new Student() _ lớp con của lớp abstract

        -Nếu lớp con có phương thức không cần thực thi thì bắt buộc lớp con cũng phải abstract , ngược lại thì không cần abstract.

         */
    }
}
