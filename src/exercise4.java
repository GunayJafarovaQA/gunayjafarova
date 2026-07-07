// Daxil edilən ilin uyğun (leap year) olub-olmadığını yoxlayır.

import java.util.Scanner;

public class Exercise4 {
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("İli daxil edin: ");
    int il = sc.nextInt();

    boolean sert = (il % 400 == 0) || (il % 4 == 0 && il % 100 != 0);

    System.out.println(sert ? "Uyğun il" : "Uyğun deyil");

    sc.close();
}
}