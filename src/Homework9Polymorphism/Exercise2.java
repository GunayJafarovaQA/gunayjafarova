package Homework9Polymorphism;

class Bildiris {

    public void gonder() {
        System.out.println("Bildiriş göndərildi");
    }
}


class EmailBildiris extends Bildiris {

    @Override
    public void gonder() {
        System.out.println("Email ilə bildiriş göndərildi");
    }
}


class SmsBildiris extends Bildiris {

    @Override
    public void gonder() {
        System.out.println("SMS ilə bildiriş göndərildi");
    }
}


class PushBildiris extends Bildiris {

    @Override
    public void gonder() {
        System.out.println("Push bildirişi göndərildi");
    }
}


public class Exercise2 {

    public static void main(String[] args) {

        Bildiris[] bildirisler = {
                new EmailBildiris(),
                new SmsBildiris(),
                new PushBildiris()
        };


        for (Bildiris bildiris : bildirisler) {
            bildiris.gonder();
        }
    }
}