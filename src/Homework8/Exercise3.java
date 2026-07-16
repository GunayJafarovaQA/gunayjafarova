package Homework8;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.print("Ədəd daxil edin: ");
            number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Yenidən daxil edin:");
            }

        } while (number <= 0);

        System.out.println("Qəbul edildi: " + number);

        scanner.close();
    }
}