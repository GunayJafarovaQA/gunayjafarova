// Kredit  şərtlərini yoxlayır.

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Yaş: ");
        int yas = sc.nextInt();

        System.out.print("Aylıq gəlir: ");
        double gelir = sc.nextDouble();


        System.out.print("Kredit məbləği: ");
        double mebleg = sc.nextDouble();

        if (yas < 21 || yas > 65) {
            System.out.println("Rədd edildi: yaş uyğun deyil.");
        } else if (gelir <= 800) {
            System.out.println("Rədd edildi: gəlir uyğun deyil.");
        } else if (mebleg < 300 || mebleg > 50000) {
            System.out.println("Rədd edildi: məbləğ uyğun deyil.");
        } else {
            System.out.println("TƏSDİQ EDİLDİ!");
        }

        sc.close();
    }
}