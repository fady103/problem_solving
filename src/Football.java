import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner. next();
        int zeroCount = 0;
        int oneCount = 0;
        int last = 0;
        if(s.length()>=2&&s.length()<=100) {

            for (int i = 0; i < s.length(); i++) {
                if(Integer.parseInt(s.substring(i,i+1))==0){
                    zeroCount++;

                    if (last==1){
                        oneCount=0;
                    }
                    last = 0;
                }else if(Integer.parseInt(s.substring(i,i+1))==1){
                    oneCount++;

                    if (last==0){
                        zeroCount=0;
                    }
                    last = 1;
                }

                if (zeroCount>=7||oneCount>=7){
                    System.out.println("YES");
                    break;
                }else if((zeroCount<7||oneCount<7)&&i==(s.length()-1)){
                    System.out.println("NO");
                    break;
                }
            }

        }

    }
}
