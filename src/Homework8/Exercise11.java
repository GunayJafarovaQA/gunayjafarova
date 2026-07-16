package Homework8;

public class Exercise11 {
    public static void main(String[] args) {

        int[] orijinal = {5, 10, 15, 20};

        int[] kopya = new int[orijinal.length];

        for (int i = 0; i < orijinal.length; i++) {
            kopya[i] = orijinal[i];
        }

        kopya[0] = 99;

        System.out.print("Orijinal: ");
        for (int eded : orijinal) {
            System.out.print(eded + " ");
        }

        System.out.println();

        System.out.print("Kopya: ");
        for (int eded : kopya) {
            System.out.print(eded + " ");
        }
    }
}