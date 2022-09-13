import java.util.Scanner;
public class odev16 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Hesaplanmasını İstediğiniz Yılı Giriniz : ");
        int year=input.nextInt();

        if(year%4==0){
            System.out.println(year + " Bir Artık Yıldır");
        }else if(year%100==0){
            if(year%400==0){
                System.out.println(year + " Bir Artık Yıldır");
            }else{
                System.out.println(year + " Bir Artık Yıl Değildir");
            }
        }else{
            System.out.println(year + " Bir Artık Yıl Değildir");
        }
    }
}
