package week2_homework;
public class Ders {
    // Öğrenci numarası, ad, soyad, aldığı bir dersin ismi,
    // o dersin vize puanı ve o dersin final puanını saklayacak değişkenleri sınıf içine tanımlayınız
    int ogr_vize,ogr_final;
    String ogr_no;
    String ogr_ad,ogr_soyad,ders_isim;

    //Bu sınıf içinde ayrıca öğrencinin puan ortalamasını hesaplayan (vize %40, final %60) method tasarlayınız
    /* ortalama>=60 ise "GEÇTİ",
        ortalama>=55 ve 60'tan küçükse "ŞARTLI GEÇER",
        ortalama 55'ten küçükse "KALDI"
        şeklinde string return edilsin.
   */
    public String getOgr_ortalama(int ogr_vize,int ogr_final) {
        double ortalama = ogr_vize * 0.4f + ogr_final * 0.6f;
        if (ortalama >= 60) {
            return "GEÇTİ";
        } else if (ortalama >= 55 && ortalama < 60) {
            return "ŞARTLI GEÇER";
        } else{
            return "KALDI";
        }
    }
    public double getjustOrtalama() {
        double ortalama = ogr_vize * 0.4f + ogr_final * 0.6f;
        return ortalama;
    }
}
