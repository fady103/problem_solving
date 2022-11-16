import java.util.Scanner;

public class Young_Physicist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean outOfRange = false;
        if ( n>=1 && n<=100 ){
            int[][]vectors = new int[n][3];
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                int z = scanner.nextInt();
                if (x>=-100&&x<=100&&x>=-100&&x<=100&&x>=-100&&x<=100){
                    vectors[i][0] = x;
                    vectors[i][1] = y;
                    vectors[i][2] = z;
                }else {
                    outOfRange = true;
                }
            }
            int sumVectorX = 0;
            int sumVectorY = 0;
            int sumVectorZ = 0;
            for (int i = 0; i < n; i++) {
                sumVectorX+=vectors[i][0];
                sumVectorY+=vectors[i][1];
                sumVectorZ+=vectors[i][2];
            }
         if (!outOfRange){
             if (sumVectorX==0&&sumVectorY==0&&sumVectorZ==0){
                 System.out.println("YES");
             }else {
                 System.out.println("NO");
             }
         }

        }
    }
}
