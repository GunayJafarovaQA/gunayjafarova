package Tapsiriq8;

// Tapşırıq 8: Fayl menecer — iki interface (multiple interface)

interface Yuklene {
    void yukle();
}

interface Endirile {
    void endir();
}

class FaylMenecer implements Yuklene, Endirile { // vergüllə hər ikisini implement edir
    @Override
    public void yukle() {
        System.out.println("Fayl yüklənir...");
    }

    @Override
    public void endir() {
        System.out.println("Fayl endirilir...");
    }
}

public class Faylmanager {
    public static void main(String[] args) {
        FaylMenecer fm = new FaylMenecer();
        fm.yukle();
        fm.endir();
    }
}
