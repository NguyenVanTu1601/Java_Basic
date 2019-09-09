package Ke_thua;

import java.util.Objects;

public class  Person {
    private String fullName;
    private String ID;

    public Person(){
    }

    public Person(String fullName, String ID) {
        this.fullName = fullName;
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void showInfo(){
        String info = "Name : " + fullName + "\nID : " + ID;
        System.out.println(info);
    }

    @Override
    public boolean equals(Object otherObject) {
        // Nếu 2 đối tượng trùng nhau return true
        if(this == otherObject) {
            return true;
        }

        // Nếu đối tương kia = null return false do đối tượng ban đầu khác null
        if(otherObject == null) {
            return false;
        }

        // Nếu 2 đối tượng khác kiểu class return false
        if(this.getClass() != otherObject.getClass()) {
            // getClass() là kiểu của class
            return false;
        }
        /* Neu lớp con ko được override do có final thì :
            if(!(otherObject instanceof Person){
               return false;
            }
         */

        // Kiểm tra từng thành phần của đối tượng trong 2 class
        Person other = (Person) otherObject;
        return Objects.equals(ID,other.getID())
                && Objects.equals(fullName,other.getFullName());
            //.......... vân vân nếu có nhiều đối tượng

        /*
            Nếu lớp con tái định nghĩa lại phương thức equals (override ) của lớp cha thì
            phải gọi super.equals(otherObject) trước
            kiểm tra nếu false thì return false
            ngược lại thì thành phần cha đã đúng ta sẽ kiểm tra các thành phần khác
            VD
            Student student = (Student) otherObject
            return avgMark == student.avgMark && Objects.equals(studentID, student.studentID) ......
         */
    }

    @Override
    public String toString() {
        // Tên package.tên class + các thành phần :
        return getClass().getName() + ("\nFullname = " + fullName + "\nID = " + ID);
    }
}
