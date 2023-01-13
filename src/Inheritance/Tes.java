package Inheritance;

public class Tes {
    public static void main(String args[]) {
        Programmer Ahmad;
        Ahmad = new Programmer("Ahmad",80000,5000);
        Manager Fahrul;
        Fahrul = new Manager("Fahrul",80000,10000);
        System.out.println("Manager: ");
        System.out.println("=====================================");
        Fahrul.info();
        System.out.println();
        System.out.println("Programmer: ");
        System.out.println("=====================================");
        Ahmad.info();
        System.out.println();
    }
}
