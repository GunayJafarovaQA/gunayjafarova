package Tapsiriq3;


class Brauzer {
    public void ac() {
        System.out.println("Ümumi brauzer açılır...");
    }
}

class Chrome extends Brauzer {
    @Override
    public void ac() {
        System.out.println("Google Chrome açılır — sürətli render.");
    }
}

public class Brauzerupcasting {
    public static void main(String[] args) {
        Brauzer b = new Chrome(); // dəyişən ata tipində, obyekt varis
        b.ac(); // JVM runtime-da hansı obyekt olduğuna baxıb Chrome.ac()-ı çağırır

        // Sübut: b.getClass() göstərir ki, real obyekt Chrome-dur
        System.out.println("Real class: " + b.getClass().getSimpleName());
    }
}
