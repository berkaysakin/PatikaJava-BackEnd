import java.util.Scanner;
public class odev05 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double pi=3.14,r,a,alan;

        System.out.print("Daire Diliminin Yarıçapını Giriniz: ");
        r=input.nextDouble();

        System.out.print("Daire Diliminin Merkez Açı Ölçüsünü Giriniz: ");
        a=input.nextDouble();

        alan=(pi*(r*r)*a)/360;

        System.out.println("Daire Diliminin Alanı: "+alan);



    }
}
