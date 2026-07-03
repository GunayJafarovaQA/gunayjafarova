import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("double eded");
        double num = sc.nextDouble();
        int castResult = (int) num;
        long roundResult = Math.round(num);

        System.out.println("(int) casting neticesi: " + castResult);
        System.out.println("Math.round() neticesi:" + roundResult);

        // (int) ondaliq hisseni silir, Math.round() ise en yaxin tam edede yuvarlaqlasdirir.

    }
}