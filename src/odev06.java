import java.util.Scanner;
public class odev06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double boy,kilo,vKitleEndeksi;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy=input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz :");
        kilo=input.nextDouble();

        vKitleEndeksi=kilo/(boy*boy);

        System.out.println("Vucüt Kitle Endeksiniz : "+vKitleEndeksi);


    }
}
