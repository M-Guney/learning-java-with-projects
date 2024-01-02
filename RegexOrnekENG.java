package week9_Homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexOrnekENG {

    public static void main(String[] args) {
        String s = "Non, wrong. Choice is an illusion between those with power and those without. Causality. There is no escape from it. We are forever slaves to it. Our only hope, our only peace is to understand it, to understand the why. Why is what separates us from them, you from me. Why is the only source of power, without it you are powerless. And this is how you come to me, without why, without power, another link in the chain.";

        // 1- Kaç sözcük olduğunu buldurunuz.
        Pattern p = Pattern.compile("\\s");
        Matcher m = p.matcher(s);
        int sayac = 0;
        while(m.find()) sayac++;
        sayac = sayac +1;
        System.out.println("Kelime sayısı: "+sayac);


        //2. Tüm noktalama işaretleri sayısını buldurunuz.
        p = Pattern.compile("[.!,:;?]");
        m = p.matcher(s);
        sayac = 0;
        while(m.find()) sayac++;
        System.out.println("Nokatalama sayısı: "+sayac);


        //3. Büyük ve küçük harfle başlayan "Why/why" sözcüklerinin sayısını buldurunuz.
        p = Pattern.compile("why|Why");
//        p = Pattern.compile("[Wwhy]{3}");//4 // Şeklinde de yapılabilinir
        m = p.matcher(s);
        sayac = 0;
        while(m.find()) sayac++;
        System.out.println("Why/why kelime sayısı: "+sayac);


        //4. İngilizce kelimelerde ard arda gelen tüm çift ünlüleri bulunuz. Örnek -> choice, without, causality
        p = Pattern.compile("[aeuoi]{2}");
        m = p.matcher(s);
        sayac = 0;
        while(m.find()) sayac++;
        System.out.println("Ard arda gelen ünlü  çift sayısı {Burak Özçivit <3 Fahriye Evcen}: "+sayac);


        // 5. Büyük harfle başlayan sözcük sayısı.
        p = Pattern.compile("\\b[A-Z]");
        m = p.matcher(s);
        sayac = 0;
        while(m.find()) sayac++;
        System.out.println("Büyük harfle başlayan kelime sayısı: "+sayac);
    }
    /** Output
     Kelime sayısı: 79
     Nokatalama sayısı: 17
     Why/why kelime sayısı: 4
     Ard arda gelen ünlü  çift sayısı {Burak Özçivit <3 Fahriye Evcen}: 15
     Büyük harfle başlayan kelime sayısı: 9*/

}
