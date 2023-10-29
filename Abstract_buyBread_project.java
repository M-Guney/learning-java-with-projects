package projects.OOP_projects;
import java.util.Scanner;

public class Abstract_buyBread_project {
    public static void main(String[] args) {
        CustomerManager customer = new CustomerManager();
        customer.base = new superMarketCalculator();
        //Süpermarket için hesaplama yaptırtacağız.
        // nereden alısveris yapacaksak {base} degiskenine superMarketCalculator nesnesi yapar
        // new olarak MarketCalculatorManager belirlemiş olsaydık o sınıfa göre hesaplama yaptırtacaktık.
        customer.doShoping();
    }
}

abstract class BaseShopCalculator{
    abstract double breadBuy(int HowMuchBread);
    // double diye tanımlamamızın nendeni ekmegin fiyatının kesirli olması
}

class superMarketCalculator extends BaseShopCalculator{
    @Override
    double breadBuy(int HowMuchBread){
        return HowMuchBread *13;
    }
}

class marketCalculator extends BaseShopCalculator{
    @Override
    double breadBuy(int HowMuchBread){
        return HowMuchBread *7.5;
    }
}

class CustomerManager{
    BaseShopCalculator base;
    Scanner scan = new Scanner(System.in);

    void doShoping(){
        System.out.println("-------------------\n-> Ekmek Hesaplaması\n-------------------");
        System.out.print("-> Kaç Ekmek Alacaksınız: ");
        int x = scan.nextInt();
        System.out.println("Ekmek fiyatı: "+ base.breadBuy(x)/x+"TL");
        // buradaki base.breadBuy(x)/x bir ekemeğin fiyatını verir
        System.out.println("Almıs oldugunuz "+x+" ekmeğin fiyati: "+ base.breadBuy(x));
        System.out.println("-------------------");
    }
}
/*-------------------
OUTPUT SuperMarket
* -> Kaç Ekmek Alacaksınız: 45
Ekmek fiyatı: 13.0TL
Almıs oldugunuz 45 ekmeğin fiyati: 585.0
-------------------*/

/*-------------------
OUTPUT Market
-> Kaç Ekmek Alacaksınız: 45
Ekmek fiyatı: 7.5TL
Almıs oldugunuz 45 ekmeğin fiyati: 337.5
-------------------*/


