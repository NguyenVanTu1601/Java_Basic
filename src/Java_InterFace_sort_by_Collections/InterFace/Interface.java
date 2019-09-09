package Java_InterFace_sort_by_Collections.InterFace;

/*
      Mục đich sử dung:
      - Đạt tính trừu tượng hoàn toàn hơn abtract
      - Cac lớp con phải override hết các hành dộng trong lớp cha nếu ko lớp con phải abtract : public abtract class....
      - Có thể sử dụng đa kế thừa
      - Một lớp con có thể implement nhiều lớp

 */
public class Interface {
    // Tinh trừu tượng trong java 1 phần giống abtract
    public static void main(String[] args) {
        // Không thể tạo được đối tượng của interface
        /*
        VD Animal animal = new Animal -> Đây là sai
         */
        Animal animal = new Cat();
        animal.eat();
    }

}
