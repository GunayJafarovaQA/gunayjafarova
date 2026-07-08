package homework6;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kod daxil edin: ");
        int kod = scanner.nextInt();

        switch (kod) {

            case 50:
            case 51:
            case 10:
                System.out.println("Azercell");
                break;

            case 55:
            case 99:
                System.out.println("Bakcell");
                break;

            case 70:
            case 77:
                System.out.println("Nar");
                break;

            default:
                System.out.println("Naməlum operator");
        }

        scanner.close();
    }
}