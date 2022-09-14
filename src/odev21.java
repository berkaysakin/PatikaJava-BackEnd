import java.util.Scanner;
public class odev21 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n,r,total=1;
        System.out.print("Üs Hesaplama...\nÜs formatı n^r şeklindedir\nn=taban r=üs\nn sayısını giriniz : ");
        n=input.nextInt();
        System.out.print("r sayısını giriniz : ");
        r= input.nextInt();


        //3^4=3.3.3.3=81

        for(int i =1;i <=r;i++){

            total*=n;
        }
        System.out.println(n+"^"+r+"="+total);

    }
}
