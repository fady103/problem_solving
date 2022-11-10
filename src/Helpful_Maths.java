import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if (!s.contains(" ")&&s.length()<=100){
            String [] chars = s.split("[+]");
            String printed1 ="";
            String printed2 ="";
            String printed3 ="";

            for (int i = 0; i < chars.length; i++) {
                int num = Integer.parseInt(chars[i]);
                if (num ==1){
                    printed1+="1";
                }
                if (num ==2){
                    printed2+="2";
                }
                if (num ==3){
                    printed3+="3";
                }
            }
            String output = printed1+printed2+printed3;
            char[] chars1 = output.toCharArray();
            for (int i = 0; i < chars1.length; i++) {
                if (i!=0){
                    System.out.print("+");
                }
                System.out.print(chars1[i]);
            }


        }
    }
}
