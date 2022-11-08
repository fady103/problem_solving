import java.util.Scanner;
//I try using int but it fails so I google it and converts int >> long then its works

public class Theatre_Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n,m,a ,x,y;
        n = scanner.nextLong();
        m = scanner.nextLong();
        a = scanner.nextLong();
        x = n/a;
        y = m/a;
        if (n % a != 0)
            ++x;

        if (m % a != 0)
            ++y;

        System.out.println(x*y);
    }
}
