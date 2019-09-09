package Input_Output;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Ghi_file_text {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException { // alt + enter đằng trc dấu ; bên dưới để chọn
        PrintWriter printWriter = new PrintWriter("E:\\Java_co_ban\\outputData.txt"/*"outPutDaTa.txt"*/,"UTF-8"); // file ở MoDau
        //printWriter.println("Hello Tu Nguyen");
        printWriter.append("Hello Java!\n"); // in vào cuối
        printWriter.append("Hello Tu!\n");
        printWriter.append("Chao mung ban toi voi java!");
        printWriter.close();
    }
}
