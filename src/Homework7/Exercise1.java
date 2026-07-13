package homework7;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperaturu daxil edin: ");
        int temperatur = scanner.nextInt();

        if (temperatur > 25) {
            System.out.println("Temperatur: " + temperatur + "°C -> Status: İsti");
        } else if (temperatur >= 15) {
            System.out.println("Temperatur: " + temperatur + "°C -> Status: Mülayim");
        } else if (temperatur >= 0) {
            System.out.println("Temperatur: " + temperatur + "°C -> Status: Soyuq");
        } else {
            System.out.println("Temperatur: " + temperatur + "°C -> Status: Şaxta");
        }

        scanner.close();
    }
}