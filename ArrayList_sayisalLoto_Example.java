package projects.OOP_projects;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_sayisalLoto_Example {
    public static void main(String[] args) {
        // 1-49 arasýnda tekrar etmeyen 6 sayý seçelim
        // listeler kullanýlacak

        ArrayList<Integer> liste = new ArrayList<>();

        for (int i=1;i<50;i++)liste.add(i);        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49]
//        System.out.println(liste);

        Collections.shuffle(liste);     // listeyi karistirdim
//        System.out.println(liste);                  // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49]

        ArrayList<Integer> altili = new ArrayList<>(6); // 6 eleeman tutsun diye 6
        for(int i=0;i<6;i++) altili.add(liste.get(i));

        Collections.sort(altili);
        System.out.println(altili);  //[9, 19, 22, 36, 42, 46]  //[3, 31, 36, 39, 43, 44]  //[1, 4, 17, 20, 32, 35]

    }
}
