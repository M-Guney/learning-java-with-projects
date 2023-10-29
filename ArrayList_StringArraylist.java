package projects.OOP_projects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_StringArraylist {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>(Arrays.asList("ali","betül","cihan"));
//        System.out.println(liste); //[ali, betül, cihan]
        liste.add("deniz");
        liste.add("elif");
        liste.add("cihan");
//        System.out.println(liste);  //[ali, betül, cihan, deniz, elif, cihan]

//        System.out.println(liste.indexOf("cihan")); //2         "cihan" 2. indisdeki elemanmıs
//        System.out.println(liste.get(0).length());//3
//        System.out.println("Ali".length());//3

//        System.out.println(liste.get(liste.get(0).length())); //deniz

//        System.out.println(liste.get(4).charAt(0)); //elif in ilk harfi e
        System.out.println(liste);//[ali, betül, cihan, deniz, elif, cihan]
        liste.add(0,"zeynep");
        liste.add(1,"alkan");
        System.out.println(liste);//[zeynep, alkan, ali, betül, cihan, deniz, elif, cihan]

        Collections.sort(liste);
        System.out.println(liste); //[ali, alkan, betül, cihan, cihan, deniz, elif, zeynep]

        for(String isim:liste){
            System.out.println(isim);
        }


    }
}
// output
//ali
//alkan
//betül
//cihan
//cihan
//deniz
//elif
//zeynep
