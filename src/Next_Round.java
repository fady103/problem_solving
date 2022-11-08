import java.util.Scanner;

public class Next_Round {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int k  = scanner.nextInt();
        int[] scores = new int[n];
        int count=0;

        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }
        int kCon = scores[k-1];  // 0 1 2 3 4 5 6 7 8   k-1 = index 4
        for (int i = 0; i < n; i++) {
            if (scores[i]>=kCon && scores[i]>0){  // if the current participant score > k score && >0
                count++;
            }
        }
        System.out.println(count);
    }
}
