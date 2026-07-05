// Bank menyusunda seçilən əməliyyatı göstərir.
import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Balans yoxla");
        System.out.println("2 - Pul yatır");
        System.out.println("3 - Pul çıxar");
        System.out.println("4 - Çıxış");

        System.out.print("Seçiminizi daxil edin: ");
        int secim = scanner.nextInt();

        switch (secim) {

            case 1:
                System.out.println("Balansınız: 5000 AZN");
                break;

            case 2:
                System.out.println("Pul yatırma əməliyyatı seçildi.");
                break;

            case 3:
                System.out.println("Pul çıxarma əməliyyatı seçildi.");
                break;

            case 4:
                System.out.println("Sistemdən çıxılır");
                break;

            default:
                System.out.println("Yanlış seçim");
        }
    }
}
