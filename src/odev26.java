import java.util.Scanner;
public class odev26 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Ebob(a,b)\nsayıları küçükten büyüğe yazmayı unutmayınız...");
        System.out.println("---a sayısını giriniz : ");
        int num1=input.nextInt();

        System.out.println("---b sayısını giriniz : ");
        int num2=input.nextInt();

        int tempNumber=1;
        int ebob=1;

        while(tempNumber<=num2){
            tempNumber++;
            if(num2%tempNumber==0 && num1%tempNumber==0){
               ebob=tempNumber;
            }

        }
        System.out.println("EBOB : "+ebob);
        int ekok=num1*num2/ebob;
        System.out.println("EKOK : "+ekok);



    }
}
