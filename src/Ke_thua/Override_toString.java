package Ke_thua;

import java.util.logging.Logger;

public class Override_toString {
    public static void main(String[] args) {
        Person person = new Person("Tu Nguyen","B17DCCN642");
        Student student = new Student("Nguyen Van Tu","0365882920","B17DCCN642","PTIT",3.21f);
        Employee employee = new Employee("Nguyen Van Tu","0365882920",20.6f,"Junio_Viettel","Developer");
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        // In ra khá hay :D
        Logger.getGlobal().info(student.toString());
    }
}
