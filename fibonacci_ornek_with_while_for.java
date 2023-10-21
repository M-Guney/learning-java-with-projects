package projects;
import java.util.*;

public class fibonacci_ornek_with_while_for {
    public static void main(String[] args) {

        int a ,b,c;
        a= 0;
        b=1;
        c=0;

        Scanner scan  = new Scanner(System.in);
        int k = scan.nextInt();
        /*
            for (int i=0; i<k;i++){

            c = a+b;
            System.out.print(c + " ");
            a = b; b=c;
        }
        */

        //        SOR
        // bu kod neden iki adet veri istiyor
        while (scan.hasNextInt()){
            int i = 0;
            while(i<k){
                i++;
                c=a+b;
                if(c>=0 && c<50) {  // sadece belli sınırlar koyarsam bana dogru sonucu veriyor
                    System.out.print(c + " ");
                }
                a= b; b=c;

            }

        }

    }


}
