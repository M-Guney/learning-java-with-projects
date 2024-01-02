package week9_Homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class CIDDI_ORNEK {
    public static void main(String[] args) {
        Set<String> metin = new HashSet<>();
        List<String> myList = new ArrayList<>();

        try{
            // ADIM 1
            String DosyaYolu = "C:\\yazılım\\2023-2024 2.Sınıf ders notları\\OOP\\OOP\\src\\Adsız doküman.txt";

            FileReader fileReader = new FileReader(DosyaYolu);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String satir = null;
            while ((satir = bufferedReader.readLine()) != null) {
                String[] words = satir.split(" ");
                myList.addAll(Arrays.asList(words));
            }
            System.out.println("Toplam Kelime Sayısı: " + myList.size()); // 905
            System.out.println(myList); // Metni dogru bir şekilde okumasını yaptım
            // ADIM 2
            metin.addAll(myList);
            System.out.println("Toplam Kelime Sayısı: " + metin.size()); // 653
            System.out.println(metin); // Metnin içindeki tamamiyle aynı olan kelimeleri silip dogru bir şekilde okumasını yaptım

            // ADIM 3
            Map<Character, Integer> harf = metin.stream()
                    .map(s -> s.length()>0 ? s.toLowerCase().charAt(0) : null)// Kelimenin ilk harfini aldım (eğer kelime boşsa null)
                    .filter(c -> c != null && Character.isLetter(c)) // harf mi // Buradaki c ilk harfi temsil ediyor
                    .collect(Collectors.toMap(c -> c, c -> 1, Integer::sum)); // Harfleri say
            //Output
            harf.forEach((haarf,sayi) -> System.out.print(haarf + ": "+ sayi+" "));
            // ş: 8 a: 61 b: 51 c: 4 d: 63 e: 33 f: 4 g: 40 ç: 21 h: 33 i: 34 k: 66 l: 2 m: 15 n: 11 o: 36 p: 5 ı: 1 r: 8 s: 38 t: 26 u: 8 v: 11 ö: 9 y: 46 z: 5 ü: 10


            bufferedReader.close(); // Okuma yaparken kullandıgım methodları kapadım
            fileReader.close();
    } catch (IOException e) { //  (Giriş/Çıkış İstisnası) genel hataları ele almak için kullanılır
        System.err.println("An error occurred while reading the file: " + e.getMessage());
        e.printStackTrace();
    }
}
}