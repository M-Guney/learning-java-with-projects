package BTK;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
 *The {abstract} keyword is a non-access modifier, used for classes and methods:
 *
 * Abstract class: is a restricted class that cannot be used to create objects
            (to access it, it must be inherited from another class).
 *
 * Abstract method: can only be used in an abstract class, and it does not have a body.
            The body is provided by the subclass (inherited from).
 *
 * An abstract class can have both abstract and regular methods:
 *
 * It is not possible to create an object of the Animal class:
            Animal myObj = new Animal(); // will generate an error
 *
 *
 * */
/*
* Abstract sınıfından bir sey cagirmak icin obje olusturulamaz ama {degisken} cagirarak erisim saglanabilir
//          BaseShopCalculatorManager baseShopCalculatorManager;  <--------------------|
             baseShopCalculatorManager.breadBuy(x)/x+" TL"                                         |
                    Burada Base... abstact sınıfındaki methoda ulasmak icin base... diye bir degisken tanımlaması yapıldı
* */
public class Abstract_Ozet_Sınıflar {
    // Ozet sınıflar demek yerine soyut sınıflar demek daha dogrudur.
    // Somut sınıftan miras alan somut sınıfın nesnesini oluşturduk
    public static void main(String[] args) {


    Somut somut = new Somut();
    somut.belirtec();
    somut.yazici();//Abstract olan Soyut classındaki methoda ulasmak icin somut nesnesini kullandım

    Soyut ada = new Somut();
    System.out.println(ada.info()); //This is in the abstract class
}
}

abstract class Soyut {
    // Nesnesi oluşturulamaz
    // Miras verebilir
    // En az bir tane soyut metot içermelidir
    // İstediğiniz kadar somut metot tanımlanabilir

    abstract  void belirtec();
    abstract  void isaretci();

    String info(){
        return "This is in the abstract class";
    }

    void yazici(){
        System.out.println("Somut method içinden");
    }
}
class Somut extends Soyut {
    @Override
    void belirtec(){
        System.out.println("Somuttaki belirtec calisti");
    }
    @Override
    void isaretci(){
    }
}
