package homework6;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yaş daxil edin: ");
        int yas = scanner.nextInt();

        int qiymet;

        if (yas <= 7) {
            qiymet = 0;
        } else if (yas <= 17) {
            qiymet = 3;
        } else if (yas <= 64) {
            qiymet = 7;
        } else {
            qiymet = 4;
        }

        System.out.println("1 bilet qiyməti: " + qiymet + " AZN");

        System.out.print("Neçə bilet istəyirsiniz: ");
        int say = scanner.nextInt();

        int umumi = qiymet * say;

        System.out.println("Ümumi məbləğ: " + umumi + " AZN");

        scanner.close();
    }
}