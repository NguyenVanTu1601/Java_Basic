package Ke_thua;

public class Employee extends Person {
    private float sallary; // lương
    private String eID;
    private String role; // vi tri
    public Employee(){

    }

    public Employee(float sallary, String eID, String role) {
        this.sallary = sallary;
        this.eID = eID;
        this.role = role;
    }

    public Employee(String lastName, String ID, float sallary, String eID, String role) {
        super(lastName, ID);
        this.sallary = sallary;
        this.eID = eID;
        this.role = role;
    }

    public float getSallary() {
        return sallary;
    }

    public void setSallary(float sallary) {
        this.sallary = sallary;
    }

    public String geteID() {
        return eID;
    }

    public void seteID(String eID) {
        this.eID = eID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Sallary = " + sallary);
        System.out.println("ID  = " + eID);
        System.out.println("Role = " + role);
    }

    @Override
    public String toString() {
        return super.toString() + "\nSallary = " + sallary + "\neID = " + eID + "\nRole = " + role;
    }
}
