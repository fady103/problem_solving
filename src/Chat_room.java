import java.util.Scanner;

public class Chat_room {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] chars =s.toCharArray();
        int [] index = new int[5];
        boolean hIsInserted = false;
        if (s.length()>0&&s.length()<=100){
            for (int i = 0; i < chars.length; i++) {
                if (chars[i]=='h'&&index[0]==0&&!hIsInserted){
                    index[0] = i;
                    hIsInserted= true;
                }
                if ((chars[i]=='e'&&index[1]==0)||chars[i]=='e'&&index[1]<index[0]){
                    index[1] = i;
                }
                if (chars[i]=='l'&&index[2]==0||chars[i]=='l'&&index[2]<index[1]){
                    index[2] = i;
                }else
                if (chars[i]=='l'&&index[3]==0&&index[2]!=0||chars[i]=='l'&&index[3]<index[2]){ // the first 'L' index is set
                    index[3] = i;
                }
                if (chars[i]=='o'&&index[4]==0||chars[i]=='o'&&index[4]<index[3]){
                    index[4] = i;
                }
            }

            if (index[0]<index[1]&&index[1]<index[2]&&index[2]<index[3]&&index[3]<index[4]){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
            
        }
    }
}
