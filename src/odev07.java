import java.util.Scanner;
public class odev07 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double elma=3.67, armut=2.14, domates=1.11, muz=0.95, patlican=5.00, fiyat;

        System.out.print("Elma Kaç KG: ");
        double elmaKg=input.nextDouble();

        System.out.print("Armut Kaç KG: ");
        double armutKg=input.nextDouble();

        System.out.print("Domates Kaç KG: ");
        double domatesKg=input.nextDouble();

        System.out.print("Muz Kaç KG: ");
        double muzKg=input.nextDouble();

        System.out.print("Patlıcan Kaç KG: ");
        double patlicanKg=input.nextDouble();

        fiyat=(patlicanKg*patlican)+(armut*armutKg)+(domates*domatesKg)+(muz*muzKg)+(elma*elmaKg);
        System.out.print("Odemeniz Gerken Fiyat: "+fiyat);


    }
}
