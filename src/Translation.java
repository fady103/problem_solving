import java.util.Locale;
import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        String resultStr = "";
        if (s.length()>0&&s.length()<=100&&t.length()>0&&t.length()<=100&&s.length()==t.length()){
            char [] sChars = s.toLowerCase().toCharArray();
            char [] tChars = t.toLowerCase().toCharArray();
            for (int i = 0; i < sChars.length; i++) {
                if(sChars[i]==tChars[sChars.length-(i+1)]){
                    resultStr += sChars[i];
                }
            }
            if (resultStr.equalsIgnoreCase(s)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }else if(s.length()!=t.length()){
            System.out.println("NO");
        }
    }
}
