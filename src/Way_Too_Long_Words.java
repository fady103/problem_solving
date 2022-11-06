import java.util.Scanner;

public class Way_Too_Long_Words {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            String str = scanner.next();
            int length = str.length();
            if (length>10)
            {
                str = ""+str.charAt(0)+(length-2)+str.charAt(length-1);
            }
            System.out.println(str);
        }

    }

}

