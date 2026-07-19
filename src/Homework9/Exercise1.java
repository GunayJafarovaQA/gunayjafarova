package Homework9;

public class Exercise1 {

    private int batareya;

    public void setBatareya(int batareya) {

        if (batareya >= 0 && batareya <= 100) {
            this.batareya = batareya;
        } else {
            System.out.println("Xəta! Batareya 0-100 arası olmalıdır.");
        }

    }

    public int getBatareya() {
        return batareya;
    }

}

