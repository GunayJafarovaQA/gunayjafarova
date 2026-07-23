package Tapsiriq2;
// Tapşırıq 2: Bildiriş zənciri (super.metod(), multilevel inheritance)

class Bildiris {
    public void gonder() {
        System.out.println("Ümumi bildiriş göndərilir.");
    }
}

class EmailBildiris extends Bildiris {
    @Override
    public void gonder() {
        super.gonder(); // ata versiyasını əvvəl çağırırıq
        System.out.println("Email vasitəsilə göndərilir.");
    }
}

class TeciliEmailBildiris extends EmailBildiris {
    @Override
    public void gonder() {
        super.gonder(); // EmailBildiris.gonder() -> o da öz növbəsində Bildiris.gonder()-i çağırır
        System.out.println("TƏCİLİ! Dərhal oxunmalıdır.");
    }
}

public class bildiriszenciri {
    public static void main(String[] args) {
        System.out.println("--- Bildiris ---");
        Bildiris b = new Bildiris();
        b.gonder();

        System.out.println("\n--- EmailBildiris ---");
        EmailBildiris e = new EmailBildiris();
        e.gonder();

        System.out.println("\n--- TeciliEmailBildiris ---");
        TeciliEmailBildiris t = new TeciliEmailBildiris();
        t.gonder();
    }
}
