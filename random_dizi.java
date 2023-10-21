package projects;

import java.util.Random;

public class random_dizi {

    public static void main(String[] args) {
        // 0-100 arasinda rastgele sayiyi
        // 1000 elemanli dizi olusturalim

        int[] dizi = new int[1000];
        Random r = new Random();
        int adet, toplam;
        adet = toplam = 0;

        for (int i = 0; i < dizi.length; i++) {

            dizi[i] = r.nextInt(100);
            System.out.print(dizi[i] + "  ");

            if (dizi[i]%10==0){
                adet++;
                toplam += dizi[i];
            }
        }
        System.out.println("\n10 a bolunen sayi adedi: "+adet);
        System.out.println("toplam: "+toplam);
        if (adet>0){
            float ort = (float)toplam/adet;
            System.out.println("ortalaması: "+ort);
        }

    }
}
