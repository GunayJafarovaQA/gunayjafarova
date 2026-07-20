package Homework9Abstraction;


class KofeMasini {

    private void suQizdir() {
        System.out.println("Su qızdırılır...");
    }

    private void kofeToku() {
        System.out.println("Kofe tökülür...");
    }

    private void fincaniDoldur() {
        System.out.println("Fincan doldurulur...");
    }


    public void kofeHazirla() {

        suQizdir();
        kofeToku();
        fincaniDoldur();

        System.out.println("Kofe hazırdır.");
    }
}


public class Exercise1 {

    public static void main(String[] args) {

        KofeMasini masina = new KofeMasini();

        masina.kofeHazirla();
    }
}