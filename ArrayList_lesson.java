package projects.OOP_projects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class ArrayList_lesson {
    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(3);
        liste.add(0);
        liste.add(3);
        liste.add(5);
        liste.add(7);
                                    // liste.add(index,integer);
//        System.out.println(liste); //[3, 0, 3, 5, 7]
        liste.add(9);
//        System.out.println(liste); //[3, 0, 3, 5, 7, 9]
        liste.add(0,1);                                 // 0. indise ekler kalanlari kaydirir
//        System.out.println(liste); //[1, 3, 0, 3, 5, 7, 9]

        liste.add(3,4);
//        System.out.println(liste);//[1, 3, 0, 4, 3, 5, 7, 9]

//        System.out.println(liste.size());//8 listenin eleman sayisi

//        System.out.println(liste.get(3));//4    // 3.indisdeki degeri dondurdu

//        System.out.println(liste.get(liste.get(4)+2));//5. indisdeki deger 5
//        System.out.println(liste);//[1, 3, 0, 4, 3, 5, 7, 9]
        liste.remove(5);
//        System.out.println(liste);//[1, 3, 0, 4, 3, 7, 9]

        liste.clear();// listenin butun elemanlarini siler
//        System.out.println(liste);//        []
    }
}

class RandomArray{
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        Random r = new Random();
        for (int i = 0;i<10;i++) liste.add(r.nextInt(10));
        System.out.println(liste);//[0, 6, 3, 9, 5, 6, 4, 4, 6, 2]               ,                 [2, 0, 5, 1, 2, 2, 2, 0, 8, 0]

        ArrayList<Integer>cloneList = new ArrayList<>();
        cloneList = (ArrayList<Integer>) liste.clone();
        System.out.println(cloneList);
        // OUTPUT
        //[3, 7, 3, 3, 5, 1, 0, 1, 8, 3]
        //[3, 7, 3, 3, 5, 1, 0, 1, 8, 3]

        System.out.println(liste.indexOf(1));
        liste.set(0,0);  // 0. indisi siler ve yerine 0 degeri koyar
        liste.set(1,1);  // 1. indisi siler ve yerine 1 degeri koyar
        System.out.println("before shuffle"+liste);

        //shuffle
        //elemanlarını rastgele sıralamak için kullanılır
        Collections.shuffle(liste);
        System.out.println("after shuffle"+liste);
        //Bu metod, koleksiyon içindeki elemanların sırasını değiştirir ve onları karıştırır.
        //          Kısacası, koleksiyonun elemanları rastgele bir sıraya yerleştirilir.

    }
}