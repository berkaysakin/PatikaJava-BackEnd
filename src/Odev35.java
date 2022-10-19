import java.util.Scanner;
public class Odev35 {

    static int base(int a , int b){
        if(a==1){
            return 1;
        }else if(b==0){
            return 1;
        }else{
            return base(a,b-1)*a;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Taban Değeri : ");
        int a= input.nextInt();
        System.out.println("Üs Değeri : ");
        int b =input.nextInt();

        System.out.println("Sonuç :" +base(a,b));
    }
}
