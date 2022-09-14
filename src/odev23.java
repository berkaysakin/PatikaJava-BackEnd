import java.util.Scanner;

public class odev23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int number;
        double result=0;
        System.out.print("Sayıyı Giriniz : ");
        number= input.nextInt();

        for(double i=1 ; i<=number;i++){

            result+=(1/i);
        }
        System.out.println(result);
    }
}
