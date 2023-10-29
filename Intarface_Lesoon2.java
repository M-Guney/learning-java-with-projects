package projects.OOP_projects;
// Arayüzler (interface), sınıflara miras verilebilen yapılardır.
// Sınıf birden fazla arayüzü uygulayabilir ve bu şekilde çoklu mirası taklit edebilir.
// Arayüzler, metotları içermeyen yapılardır
// Bir sınıf arayüzü uyguladığında o arayüzdeki metotları uygulamak zorundadır.

/*
* Like abstract classes, interfaces cannot be used to create objects
* Interface methods do not have a body - the body is provided by the "implement" class
* On implementation of an interface, you must override all of its methods
* Interface methods are by default {abstract} and {public}
* An interface cannot contain a constructor (as it cannot be used to create objects)
*/

/*Why And When To Use Interfaces?
1)         To achieve security - hide certain details and only show the important details of an object (interface).

2)         Java does not support "multiple inheritance" (a class can only inherit from one superclass).
                However, it can be achieved with interfaces, because the class can implement multiple interfaces.
        Note: To implement multiple interfaces, separate them with a comma
 */
public class Intarface_Lesoon2 {
    public static void main(String[] args) {
        Mirasci m = new Mirasci();
        m.belirtec();
    }
}
interface  Arayuz{
    void belirtec();
    void isaretci();
}
class Mirasci implements Arayuz{
//Interface icindeki tüm methodlar subclassta tanimlanmak zorundadir.
    @Override
    public void belirtec(){
    }
    public void isaretci(){
    }
    //Interface'ler implements ile miras verirler
}

//             Multiple Interfaces                                                                 Multiple Interfaces

interface FirstInterface {
    public void myMethod(); // interface method
}
interface SecondInterface {
    public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
    //Note: To implement multiple interfaces, separate them with a comma( , )
    public void myMethod() {
        System.out.println("Some text..");
    }
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}

class Main {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        // Bir sınıf arayüzü uyguladığında o arayüzdeki metotları uygulamak zorundadır.
        myObj.myMethod();
        myObj.myOtherMethod();
    }

}