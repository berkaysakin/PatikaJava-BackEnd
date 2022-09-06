import java.util.Scanner;
public class odev04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int acilis=10;
        double perKm=2.20,ucretHesap, totalUcret;

        System.out.print("Gidilen KM : ");
        double gKm= input.nextDouble();

         ucretHesap= perKm*gKm+acilis;
         ucretHesap= ucretHesap<20 ? 20 : ucretHesap;

        System.out.println("Ödemeniz Gereken Ucret : "+ ucretHesap);

    }
}
