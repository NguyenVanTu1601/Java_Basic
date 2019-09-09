package Ke_thua;

public class Cam_ke_thua {
    // Cấm kế thừa, override bằng cách sử dụng keyword final
    public static /*final*/class Member{
        // Khi them final vao đây thì lớp Hoc_Sinh khong hoạt động do không thể kế thừa
        private String name;
        private String ID;

        public Member(){

        }

        public Member(String name, String ID) {
            this.name = name;
            this.ID = ID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }
        public /*final*/ void show(){
            //Nếu final tại đây thì hàm show trong lớp học sinh sẽ ko thể override
            System.out.println("Name = " + name +"\nID = " + ID);
        }
    }
    public static class Hoc_Sinh extends Member{
        public String phoneNumber;

        public Hoc_Sinh(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public Hoc_Sinh(String name, String ID, String phoneNumber) {
            super(name, ID);
            this.phoneNumber = phoneNumber;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        @Override
        public void show() {
            super.show();
            System.out.println("Phone = "+ phoneNumber);
        }
    }

    public static void main(String[] args) {

        Hoc_Sinh hoc_sinh = new Hoc_Sinh("Nguyen Van Tu", "B17DCCN642","0365882920");
        hoc_sinh.show();
    }

}

