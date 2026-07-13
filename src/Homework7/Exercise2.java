package Homework7;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double cem = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print(i + "-ci günün satışı: ");
            double satis = scanner.nextDouble();

            cem += satis;
        }

        double orta = cem / 3;

        System.out.println("Ümumi satış: " + cem);
        System.out.println("Orta satış: " + orta);

        if (orta > 500) {
            System.out.println("Həftə uğurludur");
        } else {
            System.out.println("Satışı artırmaq lazımdır");
        }

        scanner.close();
    }
}

