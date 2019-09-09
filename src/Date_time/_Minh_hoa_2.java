package Date_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _Minh_hoa_2 {

//////////////////////////////////////////////////////////
    public static void Xem_ngay(Scanner scanner){
        String input;
        while(true){
            String regex = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
            System.out.println("Nhap ngay can xem : ");
            String o = scanner.nextLine();
            input = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher ;
            matcher= pattern.matcher(input);
            if(!matcher.find()) System.out.println("Vui long kiem tra lai !");
            else break;
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date now = new Date();
            Date inPut;
            inPut = simpleDateFormat.parse(input);

            long startTime = inPut.getTime();
            long endTime = now.getTime();
            long subTime = (startTime - endTime);

            Date ngay = new Date(endTime +subTime);
            System.out.println(ngay );
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
/////////////////////////////////////////////////////////////////////////////////

    public static void Lich_thang(Scanner scanner,int thang, int nam){

       // LocalDate now = LocalDate.now();
        LocalDate Date = LocalDate.of(/*now.getYear()*/nam, thang,01);
        //System.out.println(Date.getDayOfWeek());

        System.out.printf("MONDAY\t TUESDAY\t WEDNESDAY\t THURSDAY\t FRIDAY\t    SATURDAY\t  SUNDAY\n");
        if(Date.getDayOfWeek().toString().equals("MONDAY")== true) {
            System.out.printf("1\t\t\t");
            Date = Date.plusDays(1);
        }
        else if(Date.getDayOfWeek().toString().equals("TUESDAY")== true) {
            System.out.printf("\t\t\t1\t\t\t");
            Date = Date.plusDays(1);
        }
        else if(Date.getDayOfWeek().toString().equals("WEDNESDAY")== true) {
            System.out.printf("\t\t\t\t\t\t1\t\t\t");
            Date = Date.plusDays(1);
        }
        else if(Date.getDayOfWeek().toString().equals("THURSDAY")== true) {
            System.out.printf("\t\t\t\t\t\t\t\t\t1\t\t\t");
            Date = Date.plusDays(1);
        }
        else if(Date.getDayOfWeek().toString().equals("FRIDAY")== true) {
            System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t1\t\t\t");
            Date = Date.plusDays(1);
        }
        else if(Date.getDayOfWeek().toString().equals("SATURDAY")== true) {
            System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t\t\t");
            Date = Date.plusDays(1);
        }

        else if(Date.getDayOfWeek().toString().equals("SUNDAY")== true) {
            System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\n");
            Date = Date.plusDays(1);
        }
        if(thang == 1||thang == 3||thang == 5||thang == 7
           ||thang == 8 ||thang == 10 || thang ==12) {
            for (int i = 2; i <= 31; i++) {
                if (Date.getDayOfWeek().toString().equals("SUNDAY") == true) {
                    System.out.printf("%d\n", Date.getDayOfMonth());
                    Date = Date.plusDays(1);
                } else {
                    System.out.printf("%d\t\t\t", Date.getDayOfMonth());
                    Date = Date.plusDays(1);
                }
            }
        }
        if(thang == 4||thang == 6||thang == 9||thang == 11) {
            for (int i = 2; i <= 30; i++) {
                if (Date.getDayOfWeek().toString().equals("SUNDAY") == true) {
                    System.out.printf("%d\n", Date.getDayOfMonth());
                    Date = Date.plusDays(1);
                } else {
                    System.out.printf("%d\t\t\t", Date.getDayOfMonth());
                    Date = Date.plusDays(1);
                }
            }
        }
        if(thang == 2 && Date.isLeapYear() == true) {
            for (int i = 2; i <= 29; i++) {
                if (Date.getDayOfWeek().toString().equals("SUNDAY") == true) {
                    System.out.printf("%d\n", Date.getDayOfMonth());
                    Date = Date.plusDays(1);
                } else {
                    System.out.printf("%d\t\t\t", Date.getDayOfMonth());
                    Date = Date.plusDays(1);
                }
            }
        }
        if(thang == 2 && Date.isLeapYear() == false) {
            for (int i = 2; i <= 28; i++) {
                if (Date.getDayOfWeek().toString().equals("SUNDAY") == true) {
                    System.out.printf("%d\n", Date.getDayOfMonth());
                    Date = Date.plusDays(1);
                } else {
                    System.out.printf("%d\t\t\t", Date.getDayOfMonth());
                    Date = Date.plusDays(1);
                }
            }
        }
        System.out.println();

    }

///////////////////////////////////////////////////////////////////////////////
    public static void Lich_nam(Scanner scanner,int nam){

        LocalDate Date = LocalDate.of(nam,01,01);
        for(int i = 1; i <= 12; i++){
            System.out.println(" \n\t\t\tLich thang " + i);
            Lich_thang(scanner,i,nam);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Cac chuc nang : ");
            System.out.println("1.Xem thong tin ngay ");
            System.out.println("2.Xem lich cua thang ");
            System.out.println("3.Xem lich ca nam ");
            System.out.println("0.Thoat ");
            System.out.println("Moi ban nhap : ");
            int x = scanner.nextInt();
            if(x == 0){
                System.out.println("Thank you for using the program !");
                break;
            }
            switch(x) {
                case 0:{
                    break;
                }
                case 1:{
                    Xem_ngay(scanner);
                    break;
                }
                case 2:{
                    System.out.println("Nhap thang muon xem lich : ");
                    int thang = scanner.nextInt();
                    System.out.println("Nhap nam co thang can xem : ");
                    int nam = scanner.nextInt();
                    Lich_thang(scanner,thang,nam);
                    break;
                }
                case 3:{
                    System.out.println("Nhap nam muon xem lich");
                    int nam = scanner.nextInt();
                    Lich_nam(scanner,nam);
                    break;
                }
                default:{
                    System.out.println("Vui long nhap lai ");
                    break;
                }
            }
        }


    }
}
