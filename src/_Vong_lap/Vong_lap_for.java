package _Vong_lap;

public class Vong_lap_for {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
        // Vòng lặp lồng nhau
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(i * j == 6){
                    System.out.println("i = " +i + " " + "j = " +j);
                    //System.out.printf(" ");
                    //System.out.println("j = " +j);
                }
            }
        }
        // Vòng for each
        // Xem ben mang 1 chieu va 2 chieu
    }
}
