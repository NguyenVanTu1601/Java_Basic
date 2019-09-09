package Ke_thua;

public class Override_equal {
    public static void main(String[] args) {
        // Đã override trong lớp person
        Person person = new Person("Nguyen Tu","B17DCCN642");
        Person person1 = new Person("Nguyen Tu","B17DCCN642");
        Person person2 = new Person("Tu Nguyen","B17DCCN666");
        System.out.println(person.equals(null));
        System.out.println(person.equals(person1));
        System.out.println(person.equals(person2));
        Student student = new Student("Nguyen Van Tu","0365882920","B17DCCN642","PTIT",3.21f);
        Person person3 = new Student("Nguyen Van Tu","0365882920","B17DCCN642","PTIT",3.21f);
        Person person4 = new Student("Nguyen Tu","0365882920","B17DCCN642","PTIT",3.21f);
        Employee employee = new Employee("Nguyen Van Tu","0365882920",20.6f,"Junio_Viettel","Developer");
        System.out.println(person4.equals(student));
        System.out.println(student.equals(person3));
        System.out.println(person3.equals(student));
        System.out.println(student.equals(employee));
    }
}
