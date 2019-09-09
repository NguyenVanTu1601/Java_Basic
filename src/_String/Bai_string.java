package _String;

public class Bai_string {
    public static void main(String[] args) {
        //String :
        String myName = "Nguyen Van Tu";
        System.out.println("myName is " + myName);
        //String name = new String("Nguyen Van Tu");
        //System.out.println("Name is " + name);

        // Chuoi con :
        int lengt = myName.length();
        System.out.println("Do dai ten : " +lengt);
        String firstName = myName.substring(11);
        System.out.println("Ten : " + firstName);

        // Noi chuoi
        String lastName = "Nguyen ";
        String Name = lastName + firstName;
        System.out.println("Ho ten : "+ Name);

        //String bất biến
        /*
        String str = "abcdef";
        sau do gán str[0] = "A" => str = Abcdef đây là trong C++
        còn trong java khi đã gán str = abcdef thì không thể thay đổi được
         */
        String Ten = "Tu Nguyen";
        for(int i = 0; i < Ten.length();i++){
            System.out.printf(" " +Ten.charAt(i));
        }
        System.out.println("\n");
        //Ten.charAt(0) = 'A'; // lỗi vì tính bất biến trong string

        //Hai chuỗi tương đương
        // string a . equals(string b) dùng để so sánh 2 string
        String firstString = "Nguyen Van Tu";
        String secondString = "nguyen van Tu";
        String thirtString = "Tu Nguyen";
        if(firstString.equals(secondString) == true) System.out.println("Hai string = nhau");
        else System.out.println("Hai string khac nhau");
        if(secondString == thirtString) System.out.println("Hai chuoi string nhu nhau");
        else System.out.println("Hai chuoi string khong nhu nhau");
        // string a . equalsIgnoreCase(string b) // so sanh khong phan biet chu hoa chu thuong
        if(firstString.equalsIgnoreCase(secondString)) System.out.println("Hai string co ki tu tuong tu nhau");
        else System.out.println("Ki tu khong tuong tu nhau");

        //Chuỗi rỗng, chuỗi null
        String empty = ""; // Chuỗi rỗng đem thao tác như bên C++
        String emp = null ;// Chuỗi null không thể đem đi thao tác được nói chung không làm gì được
        /*
        Kiểm tra null trước khi thao tác 1 đối tượng trong java --- bài rẽ nhánh sẽ nói
         */
    }
}
