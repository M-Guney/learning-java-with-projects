package projects;
import java.util.Scanner;

class Bank_Client {
    protected String fname = "Suluman";
    protected String lname = "guney";
    protected String email = "suluman@guney.com";
    protected int age = 21;
}
class Bank_employee extends Bank_Client {
    private int balance = 1000;
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bank_employee atm = new Bank_employee();
        int currentBalance = atm.getBalance();
        String welcoming = atm.welcome();

        while (true) {
            System.out.print("What do you want to do withdraw(1), deposit(2), get balance(3), quit(0): ");
            int choosen = scan.nextInt();
            switch (choosen) {
                case 1:
                    int take_my_money = atm.withdraw();
                    System.out.println("Mevcut Bakiye: " + atm.getBalance());
                    break;
                case 2:
                    int deposit_my_money = atm.deposit();
                    System.out.println("Mevcut Bakiye: " + atm.getBalance());
                    break;
                case 3:
                    System.out.println("Mevcut Bakiyeniz: " + atm.getBalance());
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor ...");
                    return;
                default:
                    System.out.println("Lütfen geçerli bir sayı giriniz!");
                    break;
            }
        }
    }

    int getBalance() {
        return balance;
    }

    int withdraw() {
        System.out.print("How much do you want to withdraw? ");
        int wthdraw = scan.nextInt();
        if (wthdraw < balance) {
            System.out.print("Do you want to withdraw " + wthdraw + "$" + "  (y/n) ");
            String choose = scan.next();
            if (choose.equals("y")) {       // String karşılaştırmada == yerine .equals("") methodu kullanılır
                balance -= wthdraw;

                System.out.println("Hesabınızdan " + wthdraw + "$ " + "çektiniz");
            } else if (choose.equals("n")) {
                System.out.println("Para çekim ekranına geri dönüyorsunuz");
                withdraw();
            } else {          //else () olmaz
                System.out.println("Yanlış bir değer girdiniz lutfen tekrar deneyin");
                withdraw();
            }
        } else if (wthdraw == balance) {
            System.out.print("Do you want to withdraw " + wthdraw + "$" + "  (y/n) ");
            String choose = scan.next();
            if (choose.equals("y")) {
                balance -= wthdraw;
                System.out.println("Hesabınızdanki bütün ( " + wthdraw + "$" + ") parayı çektiniz");
            } else if (choose.equals("n")) {
                System.out.println("Para çekim ekranına geri dönüyorsunuz");
                withdraw();
            } else {            //else de (parantez)  açılmaz
                System.out.println("Yanlış bir değer girdiniz lutfen tekrar deneyin");
                withdraw();
            }
        }
        return balance;
    }

    int deposit() {
        System.out.println("How much do you want to deposit");
        int depo = scan.nextInt();
        System.out.println("You are depositing "+depo+ "$");
        balance += depo;
        return balance;
    }

    String welcome(){
        System.out.println("Welcom to GNY bank ");
        return fname;
    }


}