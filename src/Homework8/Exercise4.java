package Homework8;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        do {
            System.out.print("Ədəd daxil edin: ");
            number = scanner.nextInt();

            if (number != 0) {
                sum += number;
            }

        } while (number != 0);

        System.out.println("Cəm: " + sum);

        scanner.close();
    }
}