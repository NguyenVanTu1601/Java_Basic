package model;

/**
 * Thủ thuật thiết kế trong java
 * Dữ liệu luôn để ở private
 * Luôn khởi tạo giá trị cho dữ liệu
 * Không dùng quá nhiều kiểu dữ liệu nguyên thủy trong 1 lớp
 * Không phải mọi trường hợp đều có get/set
 * Chia nhỏ các lớp có nhiều nhiệm vụ
 * Đặt tên lớp, tên phương thức đúng nhiệm vụ và mục địch của nó
 * Uư tiên các lớp bất biến nếu có thể
 */
public class Thanh_phan_class {
    public static void main(String[] args) {
        Student studentA = new Student("Nguyen Van Tu", "B17DCCN642", "CNTT");
        //studentA.setName("Nguyen Van Tu");
        System.out.println("Thong tin sinh vien : ");
        System.out.println("Name = " + studentA.getName());
        System.out.println("ID = " + studentA.getID());
        System.out.println("faculty = " + studentA.getFaculty());
        studentA.doExemple();
    }
}
