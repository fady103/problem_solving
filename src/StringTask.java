import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next().toLowerCase();
        char[] chars = str.toCharArray();
        String lastStr = "";

        if (str.length()>0&&str.length()<=100){
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (c=='i'||c=='u'||c=='e'||c=='y'||c=='o'||c=='a'){

                }else {
                    lastStr +="."+c;
                }
            }
            System.out.println(lastStr);
        }
    }
}
