package homework6;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1) Cəm");
            System.out.println("2) Fərq");
            System.out.println("3) Hasil");
            System.out.println("4) Bölmə");
            System.out.println("0) Çıxış");

            System.out.print("Seçim: ");
            int secim = scanner.nextInt();

            if (secim == 0) {
                System.out.println("Proqram bitdi");
                break;
            }

            System.out.print("Birinci ədəd: ");
            double a = scanner.nextDouble();

            System.out.print("İkinci ədəd: ");
            double b = scanner.nextDouble();


            switch (secim) {

                case 1:
                    System.out.println("Nəticə: " + (a + b));
                    break;

                case 2:
                    System.out.println("Nəticə: " + (a - b));
                    break;

                case 3:
                    System.out.println("Nəticə: " + (a * b));
                    break;

                case 4:
                    if (b != 0) {
                        System.out.println("Nəticə: " + (a / b));
                    } else {
                        System.out.println("Sıfıra bölmək olmaz");
                    }
                    break;

                default:
                    System.out.println("Yanlış seçim");
            }
        }

        scanner.close();
    }
}