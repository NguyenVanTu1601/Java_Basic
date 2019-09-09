package Java_InterFace_sort_by_Collections.InterFace;

import java.io.Serializable;

public class Dog implements Animal, Serializable,Comparable<Cat> {
    @Override
    public void move() {
        System.out.println("Its run very fast with four leg");
    }

    @Override
    public void eat() {
        System.out.println("Dogs eat rice and bone");
    }

    @Override
    public void sleep() {
        System.out.println("Dogs sleep in daylight");
    }

    @Override
    public int compareTo(Cat o) {
        return 0;
    }
}
