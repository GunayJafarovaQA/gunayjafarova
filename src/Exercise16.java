
import java.util.Scanner;
public class Exercise16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci ədəd: ");
        double birinci = sc.nextDouble();

        System.out.print("İkinci ədəd: ");
        double ikinci = sc.nextDouble();

        System.out.print("Əməliyyat (+,-,*,/): ");
        String emeliyyat = sc.next();

        switch (emeliyyat) {
            case "+":
                System.out.println("Nəticə: " + (birinci + ikinci));
                break;
            case "-":
                System.out.println("Nəticə: " + (birinci - ikinci));
                break;
            case "*":
                System.out.println("Nəticə: " + (birinci * ikinci));
                break;
            case "/":
                if (ikinci == 0) {
                    System.out.println("0-a bölmək olmaz!");
                } else {
                    System.out.println("Nəticə: " + (birinci / ikinci));
                }
                break;
            default:
                System.out.println("Naməlum əməliyyat!");
        }

        sc.close();
    }
}

