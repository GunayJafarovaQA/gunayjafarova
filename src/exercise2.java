// Üç tam ədəd içərisində ən böyük və ən kiçik olanı tapır.


import java.util.Scanner;

public class Exercise2 {
public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("a: ");
    int a = sc.nextInt();

    System.out.println("b: ");
    int b = sc.nextInt();

    System.out.println("c: ");
    int c = sc.nextInt();

    int enBoyuk ;
    int enKicik ;

    if (a>=b && a>=c)
    {enBoyuk = a ;
    }
    else if (b>=a && b>=c)
    { enBoyuk = c ;
    }
    else {enBoyuk = c ;}

    if (a <= b && a <= c) {
        enKicik = a;
    } else if (b <= a && b <= c) {
        enKicik = b;
    } else {
        enKicik = c;
    }

    System.out.println("Ən böyük: " + enBoyuk);
    System.out.println("Ən kiçik: " + enKicik);

    sc.close();
}
}


