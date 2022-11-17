import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int length = s.length();
        int lowerCount = 0;
        if (length<=100){
            for (int i = 0; i < length; i++) {
              if (Character.isLowerCase(s.charAt(i))){
                  lowerCount+=1;
              }

            }
            if (length%2!=0){
                length++;
            }
            if (lowerCount>=(length/2)){
                System.out.println(s.toLowerCase());
            }else {
                System.out.println(s.toUpperCase());
            }
        }
    }
}
