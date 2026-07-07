// Parolun uzunluğuna görə gücünü müəyyən edir.
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Parolu daxil edin: ");
        String parol = scanner.nextLine();

        int uzunluq = parol.length();

        if (uzunluq == 0) {
            System.out.println("Parol boş ola bilməz.");
        } else if (uzunluq < 6) {
            System.out.println("Zəif parol");
        } else if (uzunluq >= 6 && uzunluq <= 9) {
            System.out.println("Orta parol");
        } else if (uzunluq == 10 || uzunluq > 10) {
                System.out.println("Güclü parol");
            }


    }
}