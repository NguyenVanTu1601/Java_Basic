package Oop__public_private;

public class Public_Private {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFullName("Tu Nguyen");
        person.setName();
        //person.setName("Tu Nguyen");
        System.out.println(person.getName());
        // Oop_Static.Student student = new Oop_Static.Student() -> gọi các package khác
    }
}
