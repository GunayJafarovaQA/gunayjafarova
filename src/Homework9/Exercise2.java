package Homework9;

public class Exercise2 {

    public static void main(String[] args) {

        Telebe telebe = new Telebe();

        telebe.setAd("Günay");
        telebe.setBal(85);

        System.out.println(
                "Ad: " + telebe.getAd()
                        + ", Bal: " + telebe.getBal()
                        + ", Qiymət: " + telebe.getQiymet()
        );
    }
}