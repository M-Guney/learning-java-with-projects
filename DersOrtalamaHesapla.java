package week2_homework;

import java.util.Scanner;

public class DersOrtalamaHesapla {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Ders o1 = new Ders();
        System.out.print("Ders isim: ");
        o1.ders_isim = scan.nextLine();
        System.out.print("isim: ");
        o1.ogr_ad = scan.nextLine();
        System.out.print("soyad: ");
        o1.ogr_soyad = scan.nextLine();

        System.out.print("ogr no: ");
        o1.ogr_no = scan.nextLine();

        System.out.print("ogr vize: ");
        o1.ogr_vize = scan.nextInt();
        System.out.print("ogr final: ");
        o1.ogr_final = scan.nextInt();

        String student_statement = o1.getOgr_ortalama(o1.ogr_vize, o1.ogr_final);
        System.out.println("-----------------------------------");
        System.out.println("Ders: "+o1.ders_isim);
        System.out.println("Ogrenci isim: "+o1.ogr_ad+" "+o1.ogr_soyad);
        System.out.println("Ogrenci No: "+o1.ogr_no);
        System.out.println("");
        System.out.println("Ogrenci vize: "+o1.ogr_vize+"    "+"Ogrenci Final: "+o1.ogr_final);
        System.out.println("Ogrenci ortalaması: "+o1.getjustOrtalama());
        System.out.println("Ogrenci durumu: " + student_statement);


    }
}
