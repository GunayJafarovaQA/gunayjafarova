package Tapsiriq7;

// Tapşırıq 7: Loglana bilən servis (interface, implements)

interface Loglana {
    void log(); // yalnız metodun imzası, gövdəsi yoxdur
}

class Servis implements Loglana {
    @Override
    public void log() {
        System.out.println("Servis işə düşdü — log yazılır: [INFO] Servis başladı.");
    }
}

public class Loglanma {
    public static void main(String[] args) {
        Servis s = new Servis();
        s.log();
    }
}

