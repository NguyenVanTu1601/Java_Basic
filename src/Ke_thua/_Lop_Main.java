package Ke_thua;

public class _Lop_Main {
    public static void main(String[] args) {
        Student student = new Student("Nguyen Van Tu","0365882920","B17DCCN642","PTIT",3.21f);
        Employee employee = new Employee("Nguyen Van Tu","0365882920",20.6f,"Junio_Viettel","Developer");
        Person person = new Person("Tu Nguyen","0365882920");
        //student.getLastName();
        /////////////////////////////////////////////////////////////////////////////////////

        // @Override : Chế tạo lại / Định nghĩa lại hàm đã có ở lớp cha theo mục đích ở lớp con
        System.out.println("\nThong tin person : ");
        person.showInfo();
        System.out.println("\nThong tin student : ");
        student.showInfo();
        System.out.println("\nThong tin employee");
        employee.showInfo();

        ///////////////////////////////////////////////////////////////////
        // Đa hình : Một biến của lớp cha có thể tham chiếu đến đối tượng lớp con (public/protected)
        //VD gọi showinfo của student

        /*System.out.println("\nGọi qua person : ");
        person = student;
        person.showInfo(); */

        System.out.println("\n Goi theo mang : ");
        Person[] people = new Person[3];
        people[0] = person;
        people[1] = student;
        people[2] = employee;
        for (Person p : people) {
            System.out.println("\nThong tin : ");
            p.showInfo();
        }

    }
}
