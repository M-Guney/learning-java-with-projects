package week3_homework;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;   //ArrayList i sıralamak istersek kullanabiliriz
import java.util.Arrays;         // String i sıralamak istersek kullanabiliriz
/*Java ile rastgele küçük harflerden oluşan 5'er karakterli  100 string üreterek bir string dizisine aktarınız.
Java ile rastgele büyük harflerden olusan 5'er karakterli 100 string oluşturarak bir arraylist'e aktarınız.*/

public class rastgele5harfli_Kelime {
    public static void main(String[] args) {
        Random r = new Random();
        String s = "";
        String[] kucukKelime = new String[100];
        for (int  i=0;i<100;i++){
            for (int k=0;k<5;k++){
                int asciiKod = r.nextInt(26)+97;// 0 ile 25 arasında rastgele bir tamsayı üretir.
                char karakter =(char)asciiKod;
                s+=karakter;
            }
            kucukKelime[i]=s;
            s = ""; // egerki s degiskenini tekrardan sıfırlamazsam ustune yazar
        }
        Arrays.sort(kucukKelime); // String [ ] i sıralamak icin kullandım
        for (String kelime : kucukKelime) System.out.print(kelime+" ");
       /*OUTPUT EXAMPLE
        acjyo atcye aweif bxywc bzpyz cborh ccwdl cooso ddybl dyfvp eevop ekwrr ekxdm eortd evuou ......*/

        ArrayList<String>boyukKelime = new ArrayList<>();
        s="";
        for (int  i=0;i<100;i++){
            for (int k=0;k<5;k++){
                int asciiKod = r.nextInt(26)+65;
                char karakter =(char)asciiKod;
                s+=karakter;
            }
            boyukKelime.add(s);
            s = ""; // egerki s degiskenini tekrardan sıfırlamazsam ustune yazar
        }
        Collections.sort(boyukKelime); // sıralamak icin kullandım
//        for (String kelime :boyukKelime) System.out.print(kelime+ " ");
        /*OUTPUT EXAMPLE
        * ADTKU AFCXO BAUZA BIEEF BJNMV BLLEY BNDFL BQGJN BUFZQ CGEDR DEFRB DILDQ ...*/

    }
}

