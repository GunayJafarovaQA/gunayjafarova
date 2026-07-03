import java.util.Scanner;
public class exercise1 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("a daxil edin: ");
            int a = sc.nextInt();

            System.out.print("b daxil edin: ");
            int b = sc.nextInt();

            System.out.println("Toplama: " + (a + b));
            System.out.println("Çıxma: " + (a - b));
            System.out.println("Vurma: " + (a * b));
            System.out.println("Bölmə: " + (a / b));
            System.out.println("Qalıq: " + (a % b));
            // int / int = int -> bolme zamani ondalıq hissə itir (məs: 17/5 = 3)
            sc.close();
        }
    }



