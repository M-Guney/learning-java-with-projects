package projects.OOP_projects;
import java.util.Scanner;

public class Abstract_PhoneManager {
    public static void main(String[] args) {
        CustomerManagers customerManagers = new CustomerManagers();
        customerManagers.base = new HuwaiPhoneManager("P20 Lite");
        customerManagers.info();
        customerManagers.doShoping();
    }
}
abstract class basePhoneManager{
    private String phoneBrand;
    public String phoneModel;

    public void setPhoneBrand(String phoneBrand){
        this.phoneBrand = phoneBrand;
    }
    public String getPhoneBrand(){
        return phoneBrand;
    }

    public abstract double buyPhone(int price, double otv);
}

class HuwaiPhoneManager extends basePhoneManager{
    HuwaiPhoneManager(String phoneModel){
        setPhoneBrand("Huwai");
        super.phoneModel =phoneModel;
    }
    @Override
    public double buyPhone(int price,double otv){
        double totalTax = ((price*0.18)+(price*0.10)+(price*0.01));
        return (price + (price*otv)+totalTax);
    }
}
class CustomerManagers{
    Scanner scan  = new Scanner(System.in);
    basePhoneManager base;
    int phonePrice;
    double phoneOtv;

    void info(){
        System.out.println("-----------------\n< Telefon Ücret Bilgileri >\n-----------------");
        System.out.print("-> Telefon Geliş Ücreti: ");
        phonePrice = scan.nextInt();
        if(phonePrice>=3000){ // OTV Hesaplamasını Yapacak if-else-if sorgusu
            phoneOtv = 0.4;
        }
        else if(phonePrice<=3000 && phonePrice>1500){
            phoneOtv = 0.25;
        }
        else {
            phoneOtv = 0.15;
        }
        System.out.println("-> Hükümlü Olduğunuz ÖTV Ücreti: %"+phoneOtv*100);
    }
    void doShoping(){
        System.out.println("-----------------\n< Telefon Bilgileri >\n-----------------");
        System.out.println("Telefonun markası: "+ base.getPhoneBrand());
        System.out.println("Telefonun modeli: "+ base.phoneModel);
        System.out.println("-----------------\n< Telefon Hesaplaması >\n-----------------");
        System.out.println("Telefonun fiyatı: " + base.buyPhone(phonePrice,phoneOtv));
        System.out.println("-----------------");
    }
}
/*-----------------
< Telefon Ücret Bilgileri >
-----------------
-> Telefon Geliş Ücreti: 2000
-> Hükümlü Olduğunuz ÖTV Ücreti: %25.0
-----------------
< Telefon Bilgileri >
-----------------
Telefonun markası: Huwai
Telefonun modeli: P20 Lite
-----------------
< Telefon Hesaplaması >
-----------------
Telefonun fiyatı: 3080.0           =        2000TL(girisfiyat)   +  500TL otv +  580 TL diger vergiler
-----------------*/