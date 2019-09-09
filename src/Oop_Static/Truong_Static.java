package Oop_Static;
/*
     -Bien , thuoc tinh ma co static goi la truong static
     - Dùng chung
     -Tac dung : VD tăng mã SV -> xem class Student
     - Để liên lạc vào main(static) thì các thành phần phải là static

 */
public class Truong_Static {
    public static void main(String[] args) {
        // 2 Student nay dung chung id (id = 1000);
        // Sau do moi lan tao 1 doi tuong thi id++;
        Student student1 = new Student();
        student1.setStudentID();
        Student student2 = new Student();
        student2.setStudentID();

        System.out.println(student1.getStudentID());
        System.out.println(student2.getStudentID());

        // Cach goi thanh phan static
        System.out.println("Static ID = " + Student.id);

    }
}
