package Tapsiriq4;

// Tapşırıq 4: Test qaçırıcı — dynamic dispatch (polymorphism, array)

class Test {
    public void icraEt() {
        System.out.println("Ümumi test icra olunur.");
    }
}

class UITest extends Test {
    @Override
    public void icraEt() {
        System.out.println("UI Test icra olunur — düymələr, formalar yoxlanılır.");
    }
}

class APITest extends Test {
    @Override
    public void icraEt() {
        System.out.println("API Test icra olunur — endpoint-lər yoxlanılır.");
    }
}

class DBTest extends Test {
    @Override
    public void icraEt() {
        System.out.println("DB Test icra olunur — məlumat bazası bütövlüyü yoxlanılır.");
    }
}

public class dynamicdispatch {
    public static void main(String[] args) {
        Test[] testler = new Test[3];
        testler[0] = new UITest();
        testler[1] = new APITest();
        testler[2] = new DBTest();

        for (Test t : testler) {
            t.icraEt(); // hər obyekt öz versiyasını işlədir
        }
    }
}

