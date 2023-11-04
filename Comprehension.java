package enumExample;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import  java.util.Scanner;

public class Comprehension {
    private static ArrayList<String> cats = new ArrayList<>();
    private static ArrayList<String> tavuk = new ArrayList<>();
    private static ArrayList<ArrayList<String>> animals = new ArrayList<>();

    public static void bul() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen girmek istediğiniz hayvanın cinsini giriniz: ");
        String cins = scan.nextLine();
        System.out.print("Hayvanın ismi var ise ismini gir: ");
        String hayvaninIsmi = scan.nextLine();
        System.out.print("Hayvanın yaşını gir: ");
        int hayvanYas = scan.nextInt();


        if (cins.equals("Cat")) {
//            ArrayList<String> cats = new ArrayList<>();
            Cat hayvan = new Cat();
            hayvan.name = hayvaninIsmi;
            hayvan.age = hayvanYas;
            cats.add(hayvaninIsmi);

//            cats.add(String.valueOf(hayvanYas));  hayvanların yaşlarını ArrayListe aktarmadım
//            hayvan.AnimalSound();


        } else if (cins.equals("Tavuk")) {
//            ArrayList<String> tavuklar = new ArrayList<>();
            Tavuk hayvan = new Tavuk();
            hayvan.name = hayvaninIsmi;
            hayvan.age = hayvanYas;
            tavuk.add(hayvaninIsmi);

        } else {
            System.out.println("Yanlış bir cins (" + cins + ") türü girdiniz");
            System.out.println("Lutfen tekrardan bilgileri giriniz");
            bul();
        }
        animals.add(cats);
        animals.add(tavuk);
    }

    public static void everthingInList() {
        for (ArrayList<String> animalList : animals) {
            for (String animal : animalList) {
                System.out.println(animal);
            }
            System.out.println("");
        }
    }

    public static void sadeceCats() {
        System.out.print("Kediler: ");
        for (String animal : cats) {
            System.out.print(animal + " ");
        }
    }

    public static void sadeceTavuklar() {
        System.out.print("Tavuklar: ");
        for (String animal : tavuk) {
            System.out.print(animal + " ");
        }
    }


    public static int kacKedi() {
        return Cat.getCatCount();
    }

    public static int kacTavuk() {
        return Tavuk.getTavukCount();
    }
}
