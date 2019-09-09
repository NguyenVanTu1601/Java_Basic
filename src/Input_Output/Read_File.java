package Input_Output;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Read_File {
        public Object Read (String name){
            Object o = new Object();
            try(FileInputStream fos = new FileInputStream(new File(name))){ // lUỒNG HỖ TRỢ ĐỂ GHI
                ObjectInputStream oos = new ObjectInputStream(fos);
                o = oos.readObject();
            }
            catch(Exception e){
                System.out.println("Read error!");
            }
            return o;
        }

    public static void main(String[] args) {
        Read_File read_file = new Read_File();
        String data = (String) read_file.Read("Hello.txt"); // Nhớ ép kiểu
        System.out.println(data);
    }
}
