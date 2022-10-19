import java.util.Scanner;
public class Odev37 {
    static void pmFive(int n){
        if (n > 0){
            System.out.print(n + " ");

            pmFive(n - 5);
        }System.out.print(n +" ");

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("İşlem için sayınızı giriniz : ");
         n= input.nextInt();

        System.out.print("Çıktısı : ");
        pmFive(n);


    }
}
