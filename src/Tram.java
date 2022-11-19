import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();

        int[] outPassengers =new int[n];
        int[] interPassengers  =new int[n];

        int currentTramPassengers = 0;
        int maxPassengersCount= 0;
        boolean noOut = false;
        if (n>=2&&n<=1000){
            for (int i = 0; i < n; i++) {
                int ai =scanner.nextInt();
                int bi =scanner.nextInt();
                outPassengers[i] =ai ;
                interPassengers[i] =bi;
                if (!(ai>=0||bi>=0&&ai<=1000||bi<=1000)){
                    noOut = true;
                }
            }
            for (int i = 0; i <n; i++) {
             currentTramPassengers += interPassengers[i];
             currentTramPassengers -= outPassengers[i];
             if (maxPassengersCount<currentTramPassengers){
                 maxPassengersCount = currentTramPassengers;
             }
            }
            if (currentTramPassengers!=0){
                noOut = true;
            }
            if (!noOut){
                System.out.println(maxPassengersCount);

            }

        }


    }
}
