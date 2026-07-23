package Tapsiriq1;
// Tapşırıq 1: HR — İşçi və Menecer (Inheritance & super)

class Isci {
    protected String ad;

    public Isci(String ad) {
        this.ad = ad;
    }

    public void melumatGoster() {
        System.out.println("Ad: " + ad);
    }
}

class Menecer extends Isci {
    private int komandaSayi;

    public Menecer(String ad, int komandaSayi) {
        super(ad); // ata konstruktorunu çağırırıq
        this.komandaSayi = komandaSayi;
    }

    @Override
    public void melumatGoster() {
        super.melumatGoster(); // ata metodunu da çağıra bilərik
        System.out.println("Komanda sayı: " + komandaSayi);
    }
}

public class HRvsisci {
    public static void main(String[] args) {
        Menecer m = new Menecer("Gunay", 5);
        m.melumatGoster();
    }
}

