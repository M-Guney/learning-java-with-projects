package enumExample;
import java.util.Scanner;
/*Bir Animal intarface ı olusturup  Cat Dog Tavuk diye implement eden
* miras alan*/
public class enumLesson{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Comprehension dene = new Comprehension();
        System.out.print("Kac tane hayvan girmek istersin: ");
        int sayac = scan.nextInt();

        while (sayac >0){ //       enum Cins{Cat, Tavuk}
            dene.bul(); // burada hangi cins oldugunu, ismini, yasını öğrendim


            sayac--;
        }
        System.out.println("---------------------------------------");
        int cats =dene.kacKedi();
        System.out.println("Cat counts: "+cats);;
        dene.sadeceCats();// sadece tavukların isimlerinin oldugu listeyi yazdırır
        System.out.println("");
        Cat.AnimalSound();
        Cat.AnimalSound();
        System.out.println("------------------");

        int tavuklar =dene.kacTavuk();
        System.out.println("Tavuk counts: "+tavuklar);
        dene.sadeceTavuklar();
        System.out.println("");
        Tavuk.AnimalSound();
        Tavuk.AnimalSound();

//        dene.everthingInList();// iki defa yazdırma problemini çöz    // çalılışıyor ama  her defasında iki defa yazdırıyor onu çözemedim
    }

}

