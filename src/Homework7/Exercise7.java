package Homework7;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int gizliKod = 275;
        int cehd = 0;

        while (true) {

            System.out.print("Kod daxil edin: ");
            int kod = scanner.nextInt();

            cehd++;

            if (kod > gizliKod) {
                System.out.println("Böyükdür");
            }
            else if (kod < gizliKod) {
                System.out.println("Kiçikdir");
            }
            else {
                System.out.println("Seyf açıldı!");
                break;
            }
        }

        System.out.println("Cəhd sayı: " + cehd);

        scanner.close();
    }
}