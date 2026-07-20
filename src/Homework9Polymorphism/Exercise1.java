package Homework9Polymorphism;


class Kalkulyator {

    public int vurma(int a, int b) {
        return a * b;
    }

    public int vurma(int a, int b, int c) {
        return a * b * c;
    }

    public double vurma(double a, double b) {
        return a * b;
    }
}


public class Exercise1 {

    public static void main(String[] args) {

        Kalkulyator kalkulyator = new Kalkulyator();

        System.out.println(kalkulyator.vurma(5, 4));

        System.out.println(kalkulyator.vurma(2, 3, 4));

        System.out.println(kalkulyator.vurma(2.5, 4.0));
    }
}