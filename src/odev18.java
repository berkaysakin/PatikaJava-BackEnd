import java.util.Scanner;
public class odev18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int total=0, number;


        do {

            System.out.print("Bir sayı giriniz : ");
            number=input.nextInt();


                if (number%2==0 || number%4==0) {
                    total += number;

                }


        }while(number%2==0);

        System.out.println(total);
    }
}
