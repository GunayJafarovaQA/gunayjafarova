import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

                System.out.print("eded daxil edin: ");
        String strEded = sc.nextLine();


        // String → int
        int eded = Integer.parseInt(strEded);

        System.out.println("Int formatı: " + eded);

        // riyazi əməliyyat
        int yeniEded = eded + 10;
        System.out.println("10 əlavə olunmuş hal: " + yeniEded);

        // int → String
        String yeniString = String.valueOf(yeniEded);

        System.out.println("String formatı: " + yeniString);

        // length tapmaq
        int uzunluq = yeniString.length();

        System.out.println("Uzunluq: " + uzunluq);

        sc.close();
    }
}
