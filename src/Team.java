import java.util.Scanner;

public class Team {

    public static void main(String[] args)
    {
        int sureProblems =0;

       Scanner scanner = new Scanner(System.in);

        int  lines = scanner.nextInt();

        for (int i = 0; i < lines; i++) {
            int score = 0;
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if(a==1)score+=1;
            if(b==1)score+=1;
            if(c==1)score+=1;
            if (score>1){
                sureProblems+=1;
            }
        }
        System.out.println(sureProblems);
    }

}
