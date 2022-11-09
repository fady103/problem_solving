import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {

        int [] matrix = new int[25];
        int index=0;
        int movingCount=0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 25; i++) {
            int inp = scanner.nextInt();
            matrix[i] = inp;
            if (inp==1){
                index =i;
            }
        }
        int row = index / 5;
        int column = index % 5;

        while(column>2){
            ++movingCount;
            --column;
        }
        while (column<2){
            ++movingCount;
            ++column;
        }
        while(row>2){
            ++movingCount;
            --row;
        }
        while (row<2){
            ++movingCount;
            ++row;
        }

        System.out.println(movingCount);

    }
}

/*
column == 2;
row == 2;
*/
