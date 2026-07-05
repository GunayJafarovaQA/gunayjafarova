// Üç tərəfə görə üçbucağın mövcudluğunu və növünü müəyyən edir.

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        double a = sc.nextDouble();

        System.out.print("b: ");
        double b = sc.nextDouble();

        System.out.print("c: ");
        double c = sc.nextDouble();

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Belə üçbucaq mövcud deyil.");
        } else if (a == b && b == c) {
            System.out.println("Bərabərtərəfli");
        } else if (a == b || a == c || b == c) {
            System.out.println("Bərabəryanlı");
        } else {
            System.out.println("Müxtəliftərəfli");
        }

        sc.close();
    }
}