package projects.OOP_projects;
/*
* An interface is a completely "abstract class" that is used to group related methods with empty bodies:
*
*
* */
public class Inteface_Lesson {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
        // OUTPUT
        //The pig says: wee wee
        //Zzz
    }
}//implementation = Uygulama
interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}
/*
To access the interface methods, the interface must be {"implemented"}(kinda like inherited)
    by another class with the implements keyword (instead of extends).
The body of the interface method is provided by the "implement" class:
*/
class Pig implements Animal {
    // Animal classında tanımlanan bir method cagirilmazsa hata verir
    //public void run(); gibi bir kod olursa implements(uygulanan)olan class da cagirilmasi gerekir
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}
