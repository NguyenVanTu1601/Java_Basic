package Java_InterFace_sort_by_Collections.InterFace;
// chuột phải -> class -> tên + interface

public interface Animal {
    public abstract void move(); // ko cần public abtract cũng được vì mọi phương thức trong interface đều vậy
    void eat();
    void sleep();

}
/*
Chú ý :
 + 1 class có thể vừa extend vừa inplement : class A extend B implement C,D;
 + interface có thể extend interface nhưng không thể implement interface khác;

 */