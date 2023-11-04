package enumExample;

public class Tavuk implements Animal {
    private static int tavukCount = 0;
    String name;
    int age;


    public static void AnimalSound() {
        System.out.println("Hukuuug");
    }
    public Tavuk() {
        tavukCount++;
    }

    public static int getTavukCount(){
        return tavukCount;
    }
    public static String species(){
        return "tavuk";
    }
//    public int AnimalCount(){
//        return tavukCount;
//    }
}
