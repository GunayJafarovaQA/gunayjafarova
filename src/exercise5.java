import java.util.Scanner;

public class exercise5 {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            // WIDENING (int → double)
            System.out.print("int dəyər daxil et: ");
            int a = sc.nextInt();

            double b = a; // avtomatik çevrilir

            System.out.println("Widening nəticə (int → double): " + b);

            // NARROWING (double → int)
            System.out.print("double dəyər daxil et: ");
            double x = sc.nextDouble();

            int y = (int) x; // manual casting

            System.out.println("Narrowing nəticə (double → int): " + y);


            System.out.println("// (int) casting ondaliq hisseni silir, yuvarlamir");

            sc.close();
        }
    }

