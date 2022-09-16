import java.util.Scanner;
public class odev28 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int total=0;
        System.out.print("Bir sayı giriniz : ");
        int number= input.nextInt();

        for(int i =1;i<number;i++){
            if(number%i==0){
                total+=i;
            }
        }
        if(number==total){
            System.out.println("bu sayı mükemmel knk");
        }else{
            System.out.println("mükemmel değil");
        }
    }
}
