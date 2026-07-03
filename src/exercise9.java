import java.util.Scanner;
public class exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Email daxil edin:");
        String email = sc.nextLine();

        boolean hasAt = email.contains("@");
        boolean hasDot = email.contains(".");
        boolean beforeAt = email.indexOf("@") >= 2;

        System.out.println("@ var: + hasAt");
        System.out.println(". var: + hasDot");
        System.out.println("@-dan evvel minimum 2 simvol var: + beforeAt");

    }

}
