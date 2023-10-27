package week2_homework;
import java.util.Scanner;

public class Asal_tf {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.print("Bir sayı girde asal mı değil mi bakayım: ");
        double temp = scan.nextDouble();
        System.out.println("Girdiğin sayı asal mı: "+asalmi(temp));

    }
    static boolean asalmi (double temp_input){
        boolean cvp = false;
        /* Sayının sadece bire ve kendisine bölünebilmesi gerekiyor*/
        int i = 1;
        int bolensayilartoplam = 0;
        do {
            if (temp_input < 2) {
                break;
            }
            if (temp_input%i ==0) {
                bolensayilartoplam +=i;
            }
            i++;


        }
        while (bolensayilartoplam<=temp_input); // buradaki eşit ya da farklı olma durumu neyi etkiler anlayamadım
        if (bolensayilartoplam==temp_input+1){
            return true;
        }
        return cvp;
    }
}
