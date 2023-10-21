package projects;
import java.util.*;

public class fibonacci_kullanıcıdan_aralık_al {

    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);

        int a,b,c,start,stop,sayac;
        a=0;
        b=1;
        c=0;
        sayac = 0;


        System.out.println("Başlangıç değerini gir");
        start=tara.nextInt();
        System.out.println("Bitiş gir");
        stop = tara.nextInt();

        if (start >stop){
            System.out.println("Başlangıc degeri bitiş degerinden büyük olamaz");
        }
        else if (start==stop){
            System.out.println("Başlangıc ile bitiş degeri bir birine eşit olamaz ");
        }
        else {
            while (c < stop) {
                c = a + b;
                if (c >= start && c < stop) {
                    sayac++;
                    System.out.println(sayac + ". bulunan fibo: " + c);
                }
                a = b;
                b = c;
            }
            System.out.print(c + " Tane fibo bulundu. ");
        }
    }
}
