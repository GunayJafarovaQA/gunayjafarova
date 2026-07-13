package homework7;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int enSuretli = 1;

        double enAzVaxt = 0;

        for (int i = 1; i <= 3; i++) {

            System.out.print(i + "-ci qaçışçının vaxtı: ");
            double vaxt = scanner.nextDouble();

            if (i == 1) {
                enAzVaxt = vaxt;
            } else if (vaxt < enAzVaxt) {
                enAzVaxt = vaxt;
                enSuretli = i;
            }
        }

        System.out.println("Ən sürətli qaçışçı: " + enSuretli);
        System.out.println("Vaxt: " + enAzVaxt);

        scanner.close();
    }
}