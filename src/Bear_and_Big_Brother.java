import java.util.Scanner;

public class Bear_and_Big_Brother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int years = 0;
        if (a>=1&&a<=b&&b<=10){
            while (a<=b){
                a*=3;
                b*=2;
                years++;
            }
            System.out.println(years);

        }
    }
}
