package projects.OOP_projects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class ArrayList_Question1 {
    // 50 ile 100 arasinda rastgele 100
    // sayidan olusan bir listenin içerisinde
    // 5'e tam bölünen sayilari yeni bir listeye aktariniz
    // ortalamasini bulunuz?
    // method kullanarak çözelim
    public static void main(String[] args) {
        ArrayList<Integer> liste=turet(50,100,100);
//        System.out.println(liste);
        ArrayList<Integer> bol = bolunen(5,liste);
        System.out.println("ortalaması: "+(float)(toplam(bol)/bol.size())); //ortalaması: 43.0//ortalaması: 47.0//ortalaması: 44.0//ortalaması: 38.0
    }

    static ArrayList<Integer> turet(int baslangıcDegeri,int bitisDegeri,int adet){
        ArrayList<Integer> dizi = new ArrayList<>();
        Random r = new Random();
        for (int i =0;i<adet;i++) {
            dizi.add(r.nextInt((bitisDegeri - baslangıcDegeri)+baslangıcDegeri));
        }
        return dizi;
    }
    static ArrayList<Integer> bolunen(int bolunecek, ArrayList<Integer>dizi){
        ArrayList<Integer> b = new ArrayList<>();
        for(int i=0;i< dizi.size();i++){
            if (dizi.get(i)%bolunecek==0) b.add(dizi.get(i));
        }
        return b;
    }
    static int toplam(ArrayList<Integer> liste){
        int toplam =0;
        for(int sayi:liste) toplam+=sayi;
        return toplam;
    }
}

