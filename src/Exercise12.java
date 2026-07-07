// Yaşa görə bilet qiymətini hesablayır.
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yaşı daxil edin: ");
        int yas = scanner.nextInt();

        if (yas < 0) {
            System.out.println("Yanlış yaş");
        } else if (yas <= 5) {
            System.out.println("Pulsuz");
        } else if (yas <= 17) {
            System.out.println("5 AZN");
        } else if (yas <= 64) {
            System.out.println("10 AZN");
        } else {
            System.out.println("3 AZN");
        }
    }
}