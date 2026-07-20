package Homework9Inheritance;


    class Hesab {

        String sahib;
        double balans;

        public Hesab(String sahib, double balans) {
            this.sahib = sahib;
            this.balans = balans;
        }

        public void medaxilEt(double mebleg) {
            balans += mebleg;
        }
    }


    class EmanetHesabi extends Hesab {

        public EmanetHesabi(String sahib, double balans) {
            super(sahib, balans);
        }

        public void faizElaveEt(double faiz) {
            balans += balans * faiz / 100;
        }
    }


    public class Exercise2 {

        public static void main(String[] args) {

            EmanetHesabi hesab = new EmanetHesabi("Gunay", 1000);

            hesab.medaxilEt(500);
            hesab.faizElaveEt(10);

            System.out.println("Sahib: " + hesab.sahib);
            System.out.println("Balans: " + hesab.balans);
        }
    }