package Homework9Abstraction;


class Bankomat {

    private double balans = 1000;


    private boolean yoxla(double mebleg) {

        return mebleg <= balans;
    }


    public void pulCek(double mebleg) {

        if (yoxla(mebleg)) {

            balans -= mebleg;

            System.out.println(
                    "Çəkilən məbləğ: " + mebleg
            );

            System.out.println(
                    "Qalan balans: " + balans
            );

        } else {

            System.out.println(
                    "Balans kifayət etmir."
            );
        }
    }
}


public class Exercise2 {

    public static void main(String[] args) {


        Bankomat bankomat = new Bankomat();


        // uğursuz çəkim
        bankomat.pulCek(1500);


        // uğurlu çəkim
        bankomat.pulCek(300);
    }
}