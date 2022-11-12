import java.util.Scanner;

public class Boy_or_Girl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str =  scanner.nextLine();
        char[] chars = str.toCharArray();
        String characters = "";
        int count = 0;
        if (chars.length>0&chars.length<=100)
        {
            for (int i = 0; i < chars.length; i++) {

                if (characters.contains(String.valueOf(chars[i]))){

                }else {
                    count+=1;
                    characters+=chars[i];
                }
            }

        }
            if (count%2==0){
                System.out.println("CHAT WITH HER!");
            }else {
                System.out.println("IGNORE HIM!");
            }
        }

    }

