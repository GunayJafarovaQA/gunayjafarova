package Homework7;

import java.util.Scanner;

public class Exercise9 {

 public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);

        int secim;

        do {

            System.out.println("1) Metr → Fut");
            System.out.println("2) Kiloqram → Funt");
            System.out.println("3) Selsi → Fahrenheit");
            System.out.println("0) Çıxış");

            System.out.print("Seçim edin: ");
            secim = scanner.nextInt();

            if (secim != 0) {
                System.out.print("Dəyər daxil edin: ");
                double deyer = scanner.nextDouble();

                double netice;

                switch (secim) {

                    case 1:
                        netice = deyer * 3.28084;
                        System.out.println("Nəticə: " + netice);
                        break;

                    case 2:
                        netice = deyer * 2.20462;
                        System.out.println("Nəticə: " + netice);
                        break;

                    case 3:
                        netice = (deyer * 9 / 5) + 32;
                        System.out.println("Nəticə: " + netice);
                        break;

                    default:
                        System.out.println("Yanlış seçim");
          }
        }

        } while (secim != 0);

        System.out.println("Çıxış edildi");

        scanner.close();
  }
}