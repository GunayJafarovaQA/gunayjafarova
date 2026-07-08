package homework6;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxQol = -1;
        int oyunçu = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print(i + "-ci oyunçunun qol sayı: ");
            int qol = scanner.nextInt();

            if (qol > maxQol) {
                maxQol = qol;
                oyunçu = i;
            }
        }

        System.out.println("Ən çox qol vuran oyunçu: " + oyunçu);
        System.out.println("Qol sayı: " + maxQol);

        scanner.close();
    }
}
