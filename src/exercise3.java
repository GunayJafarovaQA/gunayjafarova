// İmtahan balına uyğun qiymət müəyyən edir.

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bal daxil edin: ");
        int bal = sc.nextInt();

        if (bal < 0 || bal > 100) {
            System.out.println("Yanlış bal!");
        } else if (bal >= 90) {
            System.out.println("Əla (5)");
        } else if (bal >= 80) {
            System.out.println("Çox yaxşı (4)");
        } else if (bal >= 70) {
            System.out.println("Yaxşı (3)");
        } else if (bal >= 60) {
            System.out.println("Kafi (2)");
        } else {
            System.out.println("Qeyri-kafi (1)");
        }

        sc.close();
    }
}