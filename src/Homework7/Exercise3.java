package Homework7;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int stok = 200;

        while (true) {

            System.out.print("Əməliyyatı daxil edin (0 çıxış): ");
            int emeliyyat = scanner.nextInt();

            if (emeliyyat == 0) {
                break;
            }

            stok += emeliyyat;

            System.out.println("Yeni stok: " + stok);
        }

        scanner.close();
    }
}