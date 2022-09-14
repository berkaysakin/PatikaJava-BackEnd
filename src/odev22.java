import java.util.Scanner;
public class odev22 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int number,tempNumber,digitNumber=0,digitValue,digitPow=1,result=0   ;

        System.out.print("Sayıyı giriniz : ");
        number=input.nextInt();
        tempNumber=number;

        while(tempNumber!=0){
        tempNumber/=10;
        digitNumber++;
        }

        tempNumber=number;
        while(tempNumber!=0){

            digitValue=tempNumber%10;//10 ile bölümünden kalanı alıyoruz basamaklarına ayırıyoruz
            digitPow=1;//her döngü başladığında önceki döngüden kalan değer sıfıra eşitlenecek

            for(int i=1; i<=digitNumber; i++){
            digitPow*=digitValue;
            }

            result+=digitPow;
            tempNumber/=10;//Burda da sayının bir basamağını siliyoruz
        }


        if (result==number){
            System.out.println(result+" Sayısı bir Armstrong sayıdır");
        }else{
            System.out.println(result+" Sayısı bir Armstrong sayı değildir");
        }


    }
}
