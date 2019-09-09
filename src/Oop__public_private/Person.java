package Oop__public_private;

public class Person {
    private String name;
    private String fullName;
    private String dateOfBirth;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private void slitpName(){
        String names[] = fullName.split(" ");
        name = "First name " + names[0] + "\n" + "Last name : " + names[1];
    }

    public String getName(){
        return name;
    }

    public void setName(/*String name*/){
        //this.fullName = name;
        slitpName();
    }


}

