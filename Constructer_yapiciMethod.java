package BTK;

class Cokgen{
    int en,boy,yukseklik;
    /*this anahtar kelimesinin kullanım amacı,
     sınıfın alanları ile constructor'ın parametreleri aynı isimde olduğunda bu alanları ayırt etmek içindir.
    Bu sayede constructor'ın parametreleriyle sınıfın alanları karıştırılmaz. this kullanılmasa bile kod çalışır, */
    Cokgen(){
        this.en = 5;
        this.boy = 10;
        this.yukseklik = 15;
    }
    Cokgen(int en,int boy,int yukseklik){
        this.en = en; // Bu durumda en parametresi ile sınıfın en alanı karıştırılır
        this.boy = boy; // boy parametresi ile sınıfın boy alanı karıştırılır
        this.yukseklik = yukseklik; // yukseklik parametresi ile sınıfın yukseklik alanı karıştırılır

    }
    int hacim(){
        return this.en*this.boy*this.yukseklik;
    }
}

public class Constructer_yapiciMethod {
    public static void main(String[] args) {
        // Constructer - yapici-  methodlar siniflar ile ayni isimde olan
        // ve nesne olusturuldugu zaman bir kere calisan methodlardir.
        // program calismadan once yapilacak islemler bu method ile
        // gerceklestirilir.

        Cokgen c = new Cokgen();//constructer ile varsayilan degerler atanir
        System.out.println(c.hacim());
        System.out.println("Egerki icine deger girilmezse en basata belirlenen degerler calisir");// 5,10,15

        Cokgen c2 = new Cokgen(10,20,30);//10,20,30
        // burada ise overload esilmis constructer araciligiyla kullanici degerleri belirler
        System.out.println(c2.hacim());
    }
}
