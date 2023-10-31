package week3_homework;
// bu kodda enum kullandım -->       https://www.w3schools.com/java/java_enums.asp
public class UML_DiagramSoruus {

    public static void main(String[] args) {
        Customer e1 = new Customer();
        Customer e2 = new Customer();
        System.out.println("------------------------");

        e2.Name = "MUSTAFA";
        e2.Surname = "Güney";
        e2.age = 21;
        e2.phoneNo = 5151151551L;  // sonuna L koymamın nedeni veri buyuk oldugundan Long a casting yapmak
        e2.emailAdres = "muhammed@gmail.com";
        e2.genclikDurumu = Person.Genclik.Teenager;
        e2.customer_Experiance = Customer.customerExp.New;

                                                                                                                         //OUTPUT
        System.out.println("Müşteri: "+e2.Name +" "+ e2.Surname);                       //Müşteri: MUSTAFA Güney
        System.out.println("Genclik durumu: "+ e2.calculateAge(e2.age));                //Genclik durumu: Teenager

        // Yaş belirtmek istemeden tanımlamak istersek diye genclikDurumu degişkenini
        //              e2.genclikDurumu = Person.Genclik.Teenager; değiştirebiliriz
        //System.out.println("Genclik durumu: "+ e2.genclikDurumu);

        System.out.println("İletişim: "+ e2.phoneNo+" / "+e2.emailAdres);              //İletişim: 5151151551 / muhammed@gmail.com
        System.out.println("Müşteri deneyimi: " + e2.customer_Experiance);            //Müşteri deneyimi: New

        System.out.println("------------------------");

        Employee eleman = new Employee();
        eleman.Name = "Mehmet";
        eleman.Surname = "Sarilira";
        eleman.age = 35;
        //eleman.genclikDurumu = Person.Genclik.Adult;

        eleman.Salary = 11250;
        eleman.OverTime = 30;
        eleman.OverRate = 376;

        System.out.println("Calışan: "+eleman.Name + " " + eleman.Surname);                             //Calışan: Mehmet Sarilira
        System.out.println("Genclik durumu: "+ eleman.calculateAge(eleman.age));                       //Genclik durumu: Adult
        //System.out.println("Genclik durumu: "+ eleman.genclikDurumu);                                    //Genclik durumu: Adult

        // ek olarak Toplam maaş hesaplaması
        int TotalSalary = eleman.totalSalary(eleman.Salary, eleman.OverTime, eleman.OverRate);
        System.out.println("Toplam Maaş: "+TotalSalary);                                                            //Toplam Maaş: 22530
    }
    public static abstract  class Person{
        String Name;
        String Surname;
        Genclik genclikDurumu;
        public enum Genclik{ //     enum, sınırlı bir sayıda sabit değeri temsil etmek için kullanılır.
            Kid,Teenager,Adult
        }
        //ek olarak yaşına göre GenclikDurumunu hesaplama
        int age;
        public Genclik calculateAge(int age){
            // public Genclik dememin nedeni return tipi enum ile olusturdugum Genclik tipinden dolayı
            if (age<18)genclikDurumu= Genclik.Kid;
            else if (age<30) genclikDurumu= Genclik.Teenager;
            else genclikDurumu=Genclik.Adult;
            return genclikDurumu;
        }

    }
    static class Customer extends Person{
        long phoneNo;
        String emailAdres;
        customerExp customer_Experiance;

        public enum customerExp{
            Regular, New
        }
    }

    static class Employee extends Person {
        int Salary;
        int OverTime; // Fazla mesai saati
        int OverRate;  // Mesai ücreti

        //ek olarak mesailerin ücreti eklenince olan parayı hesapladım
        int totalSalary(int salary,int OverTime,int OverRate){
            return salary + OverTime*OverRate;
        }
    }
}