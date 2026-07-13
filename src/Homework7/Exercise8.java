package Homework7;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yaş daxil edin: ");
        int yas = scanner.nextInt();

        int qiymet;

        if (yas <= 6) {
            qiymet = 0;
        }
        else if (yas <= 17) {
            qiymet = 2;
        }
        else if (yas <= 60) {
            qiymet = 5;
        }
        else {
            qiymet = 3;
        }

        System.out.println("Bir bilet qiyməti: " + qiymet + " AZN");

        System.out.print("Neçə bilet alırsınız: ");
        int say = scanner.nextInt();

        int umumi = qiymet * say;

        System.out.println("Ümumi məbləğ: " + umumi + " AZN");

        scanner.close();
    }
}