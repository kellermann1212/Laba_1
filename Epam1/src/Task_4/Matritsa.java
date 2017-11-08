package Task_4;

import java.util.Random;

public class Matritsa {
    public static void Turn(int n) {
        Random rnd = new Random();
        int[][]matr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matr[i][j] = rnd.nextInt(100);
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Trans:");
        for(int k = n - 1; k >= 0; k--) {
            for(int l = 0; l < n; l++) {
                System.out.print(matr[l][k] + " ");
            }
            System.out.println();
        }
    }
}
