package BTK;
class Dersler{
    int dersNo; // no modifier
    public String dersIsmi;
    protected String dersHocasi;
    private String sifre = "adad*-++eadaw131421"; // burada atama yapilabilir

    public String getSifre() { // getter
        return sifre;
    }
    public void setSifre(String sifre) { //encapsulation - kapsülleme
        this.sifre = sifre;//setter
    }
}
public class Public_private_protected {
    public static void main(String[] args) {
		/*
		 Access Levels
		 Modifier 	 Class 	Package 	Subclass 	World
		 public 	        Y 		Y 			Y 			Y
		 protected 	Y 		Y 			Y 			N
		 no modifier   Y 		Y 			N 			N
         private 	    Y 		N 			N 			N
		 */
        Dersler d = new Dersler();
        d.dersNo = 105;
        d.dersIsmi = "OOP";
        d.dersHocasi = "Yasin";
        //d.sifre = "qas23frt"; private oldugu için atama yapamayiz
        System.out.println(d.getSifre()); //getter 
        d.setSifre("qwerty1234");//setter
        System.out.println(d.getSifre());

    }
}