import java.util.Objects;
import java.util.Scanner;

public class Anton_and_Danik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int AntonCount = 0;
        int DankCount = 0;

        if (n>=1&&n<=100000&&s.length()==n){
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)=='A'){
                    AntonCount++;
                }else if (s.charAt(i)=='D'){
                    DankCount++;
                }
            }
            if (AntonCount>DankCount){
                System.out.println("Anton");
            }else if (DankCount>AntonCount){
                System.out.println("Danik");
            }else {
                System.out.println("Friendship");
            }
        }


    }
}
