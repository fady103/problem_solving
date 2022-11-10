import java.util.Locale;
import java.util.Scanner;

public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int value = a.toLowerCase(Locale.ROOT).compareTo(b.toLowerCase());
        if (value>0){
            System.out.println("1");
        }else
        if (value<0){
            System.out.println("-1");
        }else {
            System.out.println("0");
        }

    }
}
