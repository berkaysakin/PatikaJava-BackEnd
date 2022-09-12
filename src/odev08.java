import java.util.Scanner;
public class odev08 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int n1,n2,process,answer;

        System.out.print("birinci sayıyı giriniz: ");
        n1=input.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        n2=input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak istediğinz işlemi seçiniz: ");
        process=input.nextInt();

        switch (process){

            case 1:
                answer=n1+n2;
                System.out.println("Toplam: "+answer);
                break;

            case 2:
                answer=n1-n2;
                System.out.println("Çıkarma: "+answer);
                break;

            case 3:
                answer=n1*n2;
                System.out.println("Çarpma: "+answer);
                break;

            case 4:
                if(n2!=0) {
                    answer = n1 / n2;
                    System.out.println("Bölme: " + answer);
                }else {
                    System.out.println("Hiçbir sayı sıfıra bölünemez!");
                }
                break;

            default:
                System.out.println("Hatalı numara girdiniz");

        }

    }
}
