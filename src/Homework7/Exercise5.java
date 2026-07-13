package Homework7;

public class Exercise5 {

    public static void main(String[] args) {

        double qiymet = 1000;
        int il = 0;

        while (qiymet < 2000) {

            il++;

            qiymet = qiymet * 1.08;

            System.out.println("İl " + il + ": " + qiymet + " AZN");
        }

        System.out.println("Ümumi " + il + " il çəkdi.");
    }
}