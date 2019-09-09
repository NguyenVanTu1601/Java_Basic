package Input_Output;
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class Write_File {
    public void Write(Object o, String name){
        // Gi 1 đối tượng , nếu ghi nhiều thì thay object o = list nào đó
        try(FileOutputStream fos = new FileOutputStream(new File(name))){ // lUỒNG HỖ TRỢ ĐỂ GHI
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(o);
        }
        catch(Exception e){
            System.out.println("Write error!");
        }
    }

    public static void main(String[] args) {
        String io = "Hello Tu! Co gang len nhe.";
        Write_File write_file = new Write_File();
        write_file.Write(io,"Hello.txt");
    }
}
