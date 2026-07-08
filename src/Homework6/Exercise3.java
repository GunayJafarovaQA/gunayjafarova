package homework6;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balans = 100;

        System.out.println("İlkin balans: " + balans);

        while (true) {

            System.out.print("Əməliyyat məbləği daxil edin (0 çıxış): ");
            double mebleg = scanner.nextDouble();

            if (mebleg == 0) {
                break;
            }

            balans += mebleg;

            System.out.println("Cari balans: " + balans);

            if (balans < 0) {
                System.out.println("Xəbərdarlıq: Balans mənfidir!");
            }
        }

        scanner.close();
    }
}