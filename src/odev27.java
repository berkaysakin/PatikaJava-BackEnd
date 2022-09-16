import java.util.Scanner;
public class odev27 {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);

            System.out.println("Kaç tane sayı gireceksiniz : ");
            int n= input.nextInt();
            int tempBig=0,tempSmall=0;

            for(int i=1;i<=n;i++) {
                System.out.print(i + ". Sayıyı Giriniz : ");
                int number = input.nextInt();
                if (i == 1) {
                    tempBig = number;
                    tempSmall = number;
                } else {
                    if (number > tempBig) {
                        tempBig=number  ;
                    } else if (number < tempSmall) {
                        tempSmall =number ;
                    }
                }

            }
            System.out.println("en büyük sayı : "+tempBig);
            System.out.println("en küçük sayı : "+tempSmall);

    }
}
