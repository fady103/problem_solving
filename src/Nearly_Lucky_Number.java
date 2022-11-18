import java.util.Scanner;

public class Nearly_Lucky_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        String a = "" + n;
        int count = 0;
        if (n>=1 ){
            for (int i = 0; i < a.length(); i++) {
                int currentNum = Integer.parseInt(a.substring(i,i+1));
                if (currentNum==4||currentNum==7){
                    count++;
                }

            }
        }
        if (count==4||count==7){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
