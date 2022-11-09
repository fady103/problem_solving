import java.util.Scanner;

public class Bit_plus_plus {
    public static void main(String[] args) {
        int result = 0;
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n<1||n>150){return;}
        for (int i = 0; i < n; i++) {
            String x = scanner.next();
            if (x.contains("++")){
                ++result;
            }else {
                --result;
            }

        }
        System.out.println(result);
    }
}
