package Task_2;

public class GoodNumber {
    public static void getSovershennoeChislo(int nVar){
        int sum = 0;
        for (int i = 1;i < nVar;i++){
            sum = 0;

            for (int n = 1;n < i;n++){
                if (i%n == 0){
                    sum = sum + n;
                }
            }
            if (i == sum){
                System.out.print(i + ":");

                System.out.println();
            }
        }
    }
}
