import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        if (word.length()>0&&word.length()<1000){
            String firstChar = String.valueOf(word.charAt(0)).toUpperCase();
            System.out.println(firstChar+word.substring(1));
        }
    }
}
