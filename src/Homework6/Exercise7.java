package homework6;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int gizli = 42;
        int cehd = 0;

        while (true) {

            System.out.print("Ədədi tap: ");
            int texmin = scanner.nextInt();

            cehd++;

            if (texmin > gizli) {
                System.out.println("Böyükdür");
            } else if (texmin < gizli) {
                System.out.println("Kiçikdir");
            } else {
                System.out.println("Tapdın!");
                break;
            }
        }

        System.out.println("Cəhd sayı: " + cehd);

        scanner.close();
    }
}