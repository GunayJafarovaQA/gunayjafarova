import java.util.Scanner;

public class exercise2 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Kredit məbləğini daxil edin: ");
            double mebleg = sc.nextDouble();

            System.out.print("İllik faiz dərəcəsini daxil edin (%): ");
            double faiz = sc.nextDouble();

            System.out.print("Müddəti daxil edin (ay): ");
            int muddet = sc.nextInt();

            double umumiFaiz = mebleg * (faiz / 100);
            double umumiOdenis = mebleg + umumiFaiz;
            double ayliqOdenis = umumiOdenis / muddet;

            System.out.println("\n Kreditin mebelgi ");
            System.out.println("Ümumi faiz: " + umumiFaiz);
            System.out.println("Ümumi ödəniş: " + umumiOdenis);
            System.out.println("Aylıq ödəniş: " + ayliqOdenis);

            sc.close();
        }
    }


