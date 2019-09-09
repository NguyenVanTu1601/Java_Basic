package Input_Output;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Doc_file_text {
    public static void main(String[] args) throws IOException {
        Scanner scanner;
        scanner = new Scanner(Paths.get("E:\\Java_co_ban\\inputData.txt"),"UTF-8"); // file nam ơ MO dAU
        while (scanner.hasNextInt()){
            int x = scanner.nextInt();
            System.out.println("Gia tri = " +x);
        }
        String ss = scanner.nextLine();
        String Line = scanner.nextLine();
        System.out.println("Line = "  + Line);
        scanner.close();
    }
}
