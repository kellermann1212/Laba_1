package Task_3;

public class Piramida {
    public static void Triangle(int kol) {
        int el = 0;

        int kol2 = 0;
        while(kol2 < kol) {
            kol2++;
            while(el < kol2 - (kol2 - kol2 % 2) % 2 - 1) {
                System.out.print(el + 1);
                el++;
            }
            while(el >= 0) {
                System.out.print(el + 1);
                el--;
            }
            System.out.println();
        }


    }
}
