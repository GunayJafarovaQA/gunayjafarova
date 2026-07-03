
import java.util.Scanner;

public class exercise4 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("a daxil et: ");
            int a = sc.nextInt();

            System.out.print("b daxil et: ");
            int b = sc.nextInt();

            System.out.println("Baslangic: a = " + a + ", b = " + b);

            a = a + b;
            System.out.println("Addim 1 (a = a + b): a = " + a + ", b = " + b);

            b = a - b;
            System.out.println("Addim 2 (b = a - b): a = " + a + ", b = " + b);

            a = a - b;
            System.out.println("Addim 3 (a = a - b): a = " + a + ", b = " + b);

            System.out.println("Nəticə: a = " + a + ", b = " + b);

            sc.close();
        }
    }

