package projects;

import java.util.Random;

public class matris_ureten_method {
    static int[][] matrisUret(int satir, int sutun) {
        int[][] m = new int[satir][sutun];
        Random r = new Random();

        int i, k;
        for (i = 0; i < satir; i++) {
            for (k = 0; k < sutun; k++) {
                m[i][k] = r.nextInt(5);
                // buraya Scanner yardımıyla ne kadara kadar sayı istiyor ise ekelenebilir
            }
        }
        return m;
    }

    static void matrisYaz(int[][] m, int satir, int sutun) {
        int i, k;
        System.out.println("------------------");
        for (i = 0; i < satir; i++) {
            for (k = 0; k < sutun; k++) {
                System.out.print(m[i][k] + "  ");
            }
            System.out.println();
        }
    }

    static int[][] matrisTopla(int[][] m1, int[][] m2, int satir, int sutun) {
        int[][] mt = new int[satir][sutun];
        int i, k;
        for (i = 0; i < satir; i++) {
            for (k = 0; k < sutun; k++) {
                mt[i][k] = m1[i][k] + m2[i][k];
            }
        }
        return mt;
    }

    public static void main(String[] args) {
        int[][] m1 = matrisUret(3, 4);
        int[][] m2 = matrisUret(3, 4);
        int[][] mt = matrisTopla(m1, m2, 3, 4);

        // EGERKI matrisTopla da matrisdeki satir surun sayisi esit olmazsa hata verir

        matrisYaz(m1, 3, 4);
        matrisYaz(m2, 3, 4);
        matrisYaz(mt, 3, 4);
    }
}
    /*
    ------------------  EXAMPLE
4  1  4  4
2  0  0  0
1  1  1  3
------------------
2  2  0  0
4  3  3  0
4  3  2  4
------------------
6  3  4  4
6  3  3  0
5  4  3  7

Process finished with exit code 0
*/

