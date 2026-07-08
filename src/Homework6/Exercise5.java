package homework6;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("İlkin məbləğ: ");
        double pul = scanner.nextDouble();

        double ilkin = pul;

        System.out.print("İllik faiz (%): ");
        double faiz = scanner.nextDouble();

        int il = 0;

        while (pul < ilkin * 2) {

            il++;

            pul += pul * faiz / 100;

            System.out.println(il + "-ci il: " + pul);
        }

        System.out.println("İki qat olması üçün il sayı: " + il);

        scanner.close();
    }
}