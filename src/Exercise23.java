// BMI hesablayaraq kateqoriyanı göstərir.
import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Çəki (kq): ");
        double ceki = scanner.nextDouble();

        System.out.print("Boy (metr): ");
        double boy = scanner.nextDouble();

        double bmi = ceki / (boy * boy);

        System.out.println("BMI = " + bmi);

        if (bmi < 18.5) {
            System.out.println("Arıq");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Artıq çəkili");
        } else {
            System.out.println("Piylənmə");
        }
    }
}