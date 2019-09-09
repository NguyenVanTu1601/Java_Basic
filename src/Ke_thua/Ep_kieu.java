package Ke_thua;

public class Ep_kieu {
    public static void main(String[] args) {
        // Ep kieu : student = person
        Student student = new Student("Nguyen Van Tu","0365882920","B17DCCN642","PTIT",3.21f);
        Employee employee = new Employee("Nguyen Van Tu","0365882920",20.6f,"Junio_Viettel","Developer");
        Person person = new Person("Tu Nguyen","0365882920");
        Student s1 = null;
        Employee e1 = null;
        Person[] people = new Person[3];
        people[0] = person;
        people[1] = student;
        people[2] = employee;
        for (Person p : people) {
            if(p instanceof Student){
                // neu p la 1 student
                s1 = (Student) p;
            }
        }
        if(s1 != null){
            s1.setFullName("Nguyen Tu");
            s1.setAvgMark(3.20f);
        }
        s1.showInfo();
        /*
        person = student;
        ((Student) person).showInfo(); _ ép kiểu
         */
    }
}
