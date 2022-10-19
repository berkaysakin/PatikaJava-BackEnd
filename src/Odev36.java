import java.util.Scanner;
public class Odev36 {
    static boolean isPrime(int n,int i){
        if(n==1){
            System.out.println("Asal sayı değil");
            return false;
        }
        if(n%i==0){
            System.out.println("Asal sayı değil");
            return false;
        }
        if(i*i>n){
            System.out.println("Asal sayı");
            return true;
        }

        return isPrime(n,i+1);

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Kontrol etmek istediğiniz sayıyı girin : ");
        int n= input.nextInt();

        isPrime(n,2);
    }
}
