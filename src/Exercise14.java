// Ay nömrəsinə görə maliyyə rübünü müəyyən edir.
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ay nömrəsini daxil edin (1-12): ");
        int ay = scanner.nextInt();

        switch (ay) {

            case 1:
            case 2:
            case 3:
                System.out.println("I rüb");
                break;

            case 4:
            case 5:
            case 6:
                System.out.println("II rüb");
                break;

            case 7:
            case 8:
            case 9:
                System.out.println("III rüb");
                break;

            case 10:
            case 11:
            case 12:
                System.out.println("IV rüb");
                break;

            default:
                System.out.println("Yanlış ay nömrəsi");
        }
    }
}