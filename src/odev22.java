import java.util.Scanner;
public class odev22 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int number,digitNumber,totalValue=0;
        System.out.print("Sayıyı Giriniz : ");
         number=input.nextInt();

        while(number!=0){
            digitNumber=number%10;//basmaklara ayrılıyor ayrılıyor
            totalValue+=digitNumber;
            number/=10;//bir basamak yok ediyor

        }
        System.out.println("Rakamlar toplamı : "+totalValue);



    }
}
