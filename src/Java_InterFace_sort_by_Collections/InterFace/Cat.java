package Java_InterFace_sort_by_Collections.InterFace;

// Để tạo ra các override nhanh
// Đưa chuột về cuối animal , all + enter
public class Cat implements Animal {
    @Override
    public void move() {
        System.out.println("Cat running by four leg");
    }

    @Override
    public void eat() {
        System.out.println("Cat like eating fish and mouse");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleep about six hour, any where it like");
    }
}
