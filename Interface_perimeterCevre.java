package projects.OOP_projects;
// To use the sqrt function
import java.lang.Math;

interface Polygon{ // COKGEN
    void getArea();

    default void getPerimeter(int... sides){
        //(int... sides) ifadesi Java'da bir metotun değişken sayıda argüman almasını ifade eder.
        // Burdaki getPerimeter methodu icine ne sekli girilirse girilsin herzaman cevre hesaplaması yapabilir
        int perimeter = 0;
        for (int side:sides){
            perimeter += side;
        }
        System.out.println("Perimeter: " + perimeter);
    }
}

class Triangle implements Polygon{
    private int a,b,c;
    private double s,area;
    Triangle(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void getArea() {
        s = (double) (a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area: " + area);
    }
}


public class Interface_perimeterCevre {
    public static void main(String[] args) {


        Triangle t1 = new Triangle(3, 4, 5);
        t1.getArea();
        t1.getPerimeter(3,4,5);
    }
}
/*OUTPUT
t1 = 3,4,5
Area: 6.0     alan
Perimeter: 12  cevre
*/

// helper : https://www.programiz.com/java-programming/interfaces
