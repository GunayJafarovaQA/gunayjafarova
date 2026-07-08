package homework6;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cem = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "-ci tələbənin balı: ");
            int bal = scanner.nextInt();

            cem += bal;
        }

        double orta = cem / 10.0;

        System.out.println("Cəm: " + cem);
        System.out.println("Orta bal: " + orta);

        if (orta > 70) {
            System.out.println("Sinif uğurludur");
        } else {
            System.out.println("Əlavə işə ehtiyac var");
        }

        scanner.close();
    }
}
