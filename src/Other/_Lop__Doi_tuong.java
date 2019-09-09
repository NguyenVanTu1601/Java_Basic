package Other;

import java.util.Scanner;

public class _Lop__Doi_tuong {

     static class Person{ // static class do chi các static mới gọi dk nhau ma
        private  String name; // main lai la static
        private String ID;
        private String Add;
        private float Mark;
        // Alt + insert => tạo get / set toàn bộ
        public void setName(String names){
            name = names;
        }
        public String getName(){
            return name;
        }
        public void NhapID(Scanner scanner){
            System.out.println("Nhap so ID : ");
            ID = scanner.nextLine();
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person;
        person = new Person();
        person.setName("Tu");
        System.out.println(person.getName());

    }
}
