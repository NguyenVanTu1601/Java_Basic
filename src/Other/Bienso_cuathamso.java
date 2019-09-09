package Other;

public class Bienso_cuathamso {
    // Khởi tạo biến số kiểm int...args <=> mang int co ten args
    public static int maxValue(int a[]) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    public static int findMaxFromArray(int... args) { //
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < args.length; i++) {
            if (args[i] > max) max = args[i];
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.printf("%s = %d\n", "String", 120);
        // <=> System.out.printf("%s = %f" ,new Object[]{"String",120.42f} );
        int[] arr = {1, 3, 5, 4, 2, 3, 6, 8};
        int max = findMaxFromArray(arr);
        System.out.println(max);
        int max2 = findMaxFromArray(1, 2, 45, 5, 6);
        System.out.println(max2);
        System.out.println(maxValue(arr));

    }
}
