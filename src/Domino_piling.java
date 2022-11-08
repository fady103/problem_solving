import java.util.Scanner;

public class Domino_piling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        if ((N>=M&&N<=16)&&(M>=1 && M<=N)){
            int board_area = M * N;
            int dominoCount = board_area / 2;
            System.out.println(dominoCount);
        }
    }
}
