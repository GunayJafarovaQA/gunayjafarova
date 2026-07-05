// Verilən tam ədədin cüt/tək və müsbət/mənfi/sıfır olduğunu müəyyən edir.
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ədəd daxil edin");
        int eded = sc.nextInt();

        if (eded % 2 == 0) {
            System.out.println("cutdur");
        } else {
            System.out.println("tekdir");
        }
        if (eded > 0) {
            System.out.println("musbetdir");
        } else if (eded < 0) {
            System.out.println("menfidir");
        } else {
            System.out.println("Sıfırdır");
        }
        sc.close();
    }
}