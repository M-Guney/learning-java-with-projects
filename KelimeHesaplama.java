package week2_homework;

import java.util.ArrayList;

public class KelimeHesaplama {

    public static void main(String[] args) {
        //s stringinin içindeki kelime sayısını bularak return eden methodu yazınız?

        String s = "insan davranışları içinde en belirgin olanı gerçeği reddetmektir";
        System.out.println("kelime: "+countword(s));
    }
    static int countword(String passage){
        String metin = new String(passage);
        ArrayList<String> passages = new ArrayList<String>();

        int bosluk_index;

            // indexOf bulamazsa -1 verir HATA VERMEZ
        do{
             bosluk_index  = metin.indexOf(" ");
            if (bosluk_index !=-1) {
                String word = passage.substring(0, bosluk_index);       // .substring methodunu Stringi bölmek için kullandım
                passages.add(word);
                metin = metin.substring(bosluk_index+ 1);
            }
        }
        while(bosluk_index !=-1);
        return passages.size(); //   passages yani kelimelerin oldugu arrrayListte ne kadar kelime var diye baktım
    }
}
