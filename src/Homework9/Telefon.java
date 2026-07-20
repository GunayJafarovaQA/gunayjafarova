package Homework9;

public class Telefon {

    private int batareya;

    public void setBatareya(int batareya) {
        if (batareya>=0 && batareya<=100){
            this.batareya = batareya;
        } else {
            System.out.println("0 və 100 arası rəqəm daxil edin");
        }
    }

    public int getBatareya() {
        return batareya;
    }

    public static void main(String[] args) {

        Telefon telefon = new Telefon();

        telefon.setBatareya(50);

        System.out.println(telefon.getBatareya());
    }
}