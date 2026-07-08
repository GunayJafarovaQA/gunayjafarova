package homework6;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Balı daxil edin: ");
        int bal = scanner.nextInt();

        String qiymet;

        if (bal >= 90) {
            qiymet = "Əla";
        } else if (bal >= 70) {
            qiymet = "Yaxşı";
        } else if (bal >= 50) {
            qiymet = "Kafi";
        } else {
            qiymet = "Qeyri-kafi";
        }

        System.out.println("Bal: " + bal + " → Qiymət: " + qiymet);

        scanner.close();
    }
}