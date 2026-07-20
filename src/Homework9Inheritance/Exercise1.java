package Homework9Inheritance;

public class Exercise1 {

    public static void main(String[] args) {

        Exercise1Menecer menecer = new Exercise1Menecer("Gunay");
        Exercise1Developer developer = new Exercise1Developer("Leman");

        menecer.ozunuTeqdimEt();
        menecer.idareEt();

        developer.ozunuTeqdimEt();
        developer.kodYaz();
    }
}