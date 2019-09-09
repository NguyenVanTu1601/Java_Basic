package CTDL;

public class Person {
    private int Id;

    public Person(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Person) ? (((Person)obj).getId() == this.Id) : false;
    }

    @Override
    public int hashCode() {
        return this.Id;
    }
}
