import java.util.Scanner;

public class Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        long n = scanner.nextInt();
        int w = scanner.nextInt();
        long cost =0;
        for (int i = 1; i <= w; i++) {
            cost+=i*k;
        }
        if ((cost-n)<=0){
            System.out.println(0);
        }else {
            System.out.println(cost-n);
        }

    }
}
