import java.util.Scanner;
 class odev02 {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

        System.out.print("ürün fiyatını giriniz:");
        int urun= input.nextInt();

        boolean kosul= urun<=1000;

        double kdv= kosul ? 0.18 : 0.08;

        double kdvUrun=(kdv*urun)+(urun);

        System.out.println("Ürün Fiyatı = " +kdvUrun);
    }
}
