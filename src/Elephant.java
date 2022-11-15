import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x>=1&&x<=1000000){
            int remind = x%5;
            double steps = Math.floor(x/5);
            if (remind>0){
                steps++;
            }
            System.out.println((int)steps);

        }
    }
}
