// Gün nömrəsinə uyğun həftənin gününü göstərir.

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1-7 arası gün nömrəsi: ");
        int gun = sc.nextInt();

        switch (gun) {
            case 1:
                System.out.println("Bazar ertəsi");
                break;
            case 2:
                System.out.println("Çərşənbə axşamı");
                break;
            case 3:
                System.out.println("Çərşənbə");
                break;
            case 4:
                System.out.println("Cümə axşamı");
                break;
            case 5:
                System.out.println("Cümə");
                break;
            case 6:
                System.out.println("Şənbə");
            case 7:
                if (gun == 7) {
                    System.out.println("Bazar");
                }
                System.out.println("Həftə sonu!");
                break;
            default:
                System.out.println("Yanlış gün nömrəsi");
        }

        sc.close();
    }
}