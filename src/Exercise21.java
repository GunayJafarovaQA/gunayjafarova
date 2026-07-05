// Hərfin sait və ya samit olduğunu müəyyən edir.
import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir hərf daxil edin: ");
        char herf = scanner.next().charAt(0);

        switch (herf) {

            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Sait");
                break;

            default:
                System.out.println("Samit");
        }
    }
}