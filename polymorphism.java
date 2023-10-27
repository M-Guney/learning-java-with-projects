package BTK;

public class polymorphism {
    /*
    *
    * polymorphism = Polimorfizm, aynı isimdeki metotların veya işlevlerin farklı sınıflar
    *                                veya türler tarafından farklı şekillerde uygulanabilme özelliğidir
    * */
    public static void main(String[] args) {
        // Polymorphism - Çok biçimlilik
        Kedi kedi = new Kedi();
        //kedi.ses();

        Kopek kopek = new Kopek();
        //kopek.ses();

        Kurbaga kurbaga = new Kurbaga();
        Tavuk tavuk = new Tavuk();
        //kurbaga.ses();

        HayvanSesi hs = new HayvanSesi();
        hs.ses();
        hs.ses(tavuk);
        hs.ses(kurbaga);
    }
}
    class Hayvan{
        void ses() {
            System.out.println("Bu method ilgili hayvanin cikardigi sesi belirtecek");
        }
    }
class Tavuk extends Hayvan{
    void ses() {
        System.out.println("Tavuk: "+"Hukuuk Hukuug");
    }
}
    class Kedi extends Hayvan{
        void ses() {
            System.out.println("miyav");
        }
    }
    class Kopek extends Hayvan{
        void ses() {
            System.out.println("hav hav");
        }
    }

    class Kurbaga extends Hayvan{
        void ses() {
            System.out.println("vrak vrak");
        }
    }
    class HayvanSesi extends Hayvan{
        void ses(Hayvan h) { //polymorphism
            h.ses();
        }
    }