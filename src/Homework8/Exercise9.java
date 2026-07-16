package Homework8;

public class Exercise9 {
    public static void main(String[] args) {

        int[] massiv = new int[8];

        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = (i + 1) * 10;
        }

        for (int eded : massiv) {
            System.out.print(eded + " ");
        }
    }
}