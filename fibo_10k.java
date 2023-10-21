package projects;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class fibo_10k {

    public static void main(String[] args) {
        /*    istenilen aralıktaki fiboları bul
                    swicth ile çift tek hangisinde işlem yapmak istediğini seç
                    ya da verilen fibo aralığından rastgele bir sayı döndür
                    swicth ile ne işlem yapmak istediğini seç   */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Başlangıç değerini girin: ");
        int start = scanner.nextInt();
        System.out.print("Bitiş değerini girin: ");
        int end = scanner.nextInt();

        Random r = new Random();
        int a,b,c,sayac;
        a=1;b=c=sayac=0;

        ArrayList <Integer> dizi  = new ArrayList<Integer>();
        ArrayList <Integer> total_fibo  = new ArrayList<Integer>();
        ArrayList <Float> bolum  = new ArrayList<Float>();

        while (c<end){
            c=a+b;
            total_fibo.add(c);
            if (c>start && c<end) {
                dizi.add(c);
                sayac++;
            }
            a=b;b=c;
        }
        //for (int k =0;k<dizi.size();k++) {
            //System.out.println(dizi.get(k) + " ");

            // Scanner scan= new Scanner(System.in);
        System.out.print("aralıktaki fibolarınız: ");
            for (int d = 0;d<dizi.size();d++){
                System.out.print(dizi.get(d) + " ");
            }

            System.out.println("Ne yapmak istediğinizi seçin");
            System.out.println("0=random numara fibodan");
            System.out.println("1=cift sayıların ort");
            System.out.println("2= tek ort");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    int ctoplam = 0;
                    ArrayList<Integer> cift = new ArrayList<Integer>();
                    for (int K = 0; K < dizi.size(); K++) {
                        int temp = dizi.get(K);
                        if (temp % 2 == 0) {
                            cift.add(temp);
                            ctoplam += temp;
                        }
                        else{
                            System.out.println("Aranan sonuç dizinin içinde yer almamaktadır");
                        }
                    }
                    System.out.println(cift.size() + " Cift sayının ortalaması: " + ctoplam / cift.size());
                    break;

                case 2:
                    int tektoplam = 0;
                    ArrayList<Integer> tekk = new ArrayList<Integer>();
                    for (int L = 0; L < dizi.size(); L++) {
                        int temp = dizi.get(L);
                        if (temp % 2 != 0) {
                            tekk.add(temp);
                            tektoplam += temp;
                        }
                        else{
                            System.out.println("Aranan sonuç dizinin içinde yer almamaktadır");
                        }
                    }
                    System.out.println(tekk.size() + " Tek sayının ortalaması: " + tektoplam / tekk.size());
                    break;


                case 0:
                    int random_index = r.nextInt(dizi.size());
                    int random_element = dizi.get(random_index);
                    System.out.println(random_element);
                    break;


        }
    }


}
