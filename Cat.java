package enumExample;

class Cat implements Animal {
    int HowManyLives = 9;
    private static int catCount = 0;
    String name;
    int age;
    int livesRemaining;
    public static void AnimalSound() {
        System.out.println("Miyawww");
    }
    public Cat() {
        catCount++;
    }

    public static int getCatCount(){
        return catCount;
    }
//    public int AnimalCount(){
//        return catCount;
//    }
    public static String species(){
        return "kedi";
    }

}
