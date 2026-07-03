import java.util.Scanner;
public class exercise8 {
    public static void main(String[] args ){
        Scanner sc = new Scanner (System.in) ;
        System.out.print("Celsius derecesini yazin:");
        int c = sc.nextInt();

        double wrong = c * 9 / 5 + 32;
        double correct = c * 9.0 / 5 + 32;

        System.out.println("int bolme ile netice" + wrong);
        System.out.println("double bolme ile netice" + correct);




    }

}
