package BTK;

class Car{

}
class Mercedes extends Car  {
    static void method(Car c){ // bunu cagirirken obje kulanmamak icin static olarak belirledim
        if (c instanceof Mercedes){ // c objesi Mercedesin objesi midir
            Mercedes m = (Mercedes) c;  //Downcasting
            System.out.println(" Downcasting calisti"); // true
        }
    }
}
public class instanceof_Example {
    public static void main(String[] args) {
        // method static olmasaydi:
        //Mercedes obj = new Mercedes();
        //obj.method(c);                                   seklinde yapmam gerekirdi

        Car c = new Mercedes();
        Mercedes.method(c);
    }
}
