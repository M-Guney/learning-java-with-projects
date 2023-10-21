package projects;

public class diziler {
    public static void main(String[] args) {
        // Arrays - Diziler
        // Java'da primitive yapıdaki diziler Array olarak adlandırılır
        // Nesne tipi ise Listeler (ArrayList) olarak adlandırılır.
        int[] sayilar = {3,5,6,8,9,1,0}; // 7 elemanlı bir dizi tanımlayıp değerleri atadık
        System.out.println(sayilar[0]);//3
        System.out.println(sayilar[2]);//6
        System.out.println(sayilar[2+3]);//sayilar[5]
        //System.out.println(sayilar[7]);//taşma hatası
        //System.out.println(sayilar[sayilar.length]);//taşma hatası
        System.out.println(sayilar[sayilar.length-1]);// 6. indis
        System.out.println(sayilar[sayilar.length-sayilar.length]);// 7-7
        System.out.println(sayilar[167-163]);


        int[] dizi = new int[3]; //3 elemanlı bir dizi alanını Ram'de rezerve ettik
        dizi[0] = 5;
        dizi[1] = 0;
        dizi[2] = 1;
        dizi[0] = 7;
        //dizi[3] = 12; taşma hatası alırız
        System.out.println("-->"+dizi[2]);
    }
}
