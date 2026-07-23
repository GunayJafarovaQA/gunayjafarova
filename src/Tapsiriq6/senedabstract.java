package Tapsiriq6;
// Tapşırıq 6: Sənəd — abstract + konstruktor

abstract class Sened {
    protected String baslik;

    public Sened(String baslik) {
        this.baslik = baslik;
        System.out.println("Sened konstruktoru işlədi: " + baslik);
    }

    public abstract void capEt();
}

class PDFSened extends Sened {
    public PDFSened(String baslik) {
        super(baslik); // ata konstruktorunu çağırırıq
    }

    @Override
    public void capEt() {
        System.out.println("[PDF] '" + baslik + "' sənədi çap olunur.");
    }
}

class WordSened extends Sened {
    public WordSened(String baslik) {
        super(baslik);
    }

    @Override
    public void capEt() {
        System.out.println("[Word] '" + baslik + "' sənədi çap olunur.");
    }
}

public class senedabstract {
    public static void main(String[] args) {
        PDFSened pdf = new PDFSened("Hesabat.pdf");
        pdf.capEt();

        System.out.println();

        WordSened word = new WordSened("Melumat.docx");
        word.capEt();
    }
}
