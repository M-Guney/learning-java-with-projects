package projects.OOP_projects;
import java.util.ArrayList;
import java.util.Random;
public class ArrayList_Question2 {
    //rastgele 1000 adet 5 karakterli harf dizisi oluştur.
    //Bu dizilerin baş harfi büyük veya küçük 'Z' harfi olan kaç tanesi var.

    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        for (int i =0;i<1000;i++) s.add(uret(5));
        System.out.println(s);
        System.out.println(bul('Z','z',s));
    }

    static String uret(int nekadar) {
        String s = "";
        Random r = new Random();
        int bk;
        char harf;

        for (int i=0;i<nekadar;i++){
            bk = r.nextInt(2);
            if(bk==0) harf = (char)((char) r.nextInt(26)+97);
            else harf=(char)((char) r.nextInt(26)+65);
            s+=harf;
        }
        return s;
    }
    static int bul(char bir,char iki,ArrayList<String> s){
        int sayac = 0;
        for (int i=0;i<s.size();i++){
            if(s.get(i).charAt(0)==bir || s.get(i).charAt(0)==iki) {
                sayac++;
            }
        }
        return sayac;
    }

}
