package projects.OOP_projects;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_digerTipler {
    public static void main(String[] args) {
        ArrayList<Object> liste = // Object
        new ArrayList<>(Arrays.asList("ali",5,'c',true,2.34f));
//        System.out.println(liste);  //[ali, 5, c, true, 2.34]

        float sayi = (float) liste.get(4);// egerki cevrilmezse hata verir
//        System.out.println(sayi);//2.34

        ArrayList<Boolean> durumlar =new ArrayList<>(Arrays.asList(true,false,true,false));
//        System.out.println(durumlar);//[true, false, true, false]

        ArrayList<Float> kesirli = new ArrayList<>();
        kesirli.add(2.34f);
        kesirli.add((float)1.34);
        kesirli.add(5f);
        System.out.println(kesirli);//[2.34, 1.34, 5.0]
    }
}
