import java.util.Scanner;
public class odev20 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int total1=1, total2=1,total3=1;

        System.out.print("Kombinasyon Formatı C(n,r) şeklindedir\nn sayısını giriniz : ");
        int n=input.nextInt();
        System.out.print("r sayısını giriniz : ");
        int r=input.nextInt();

        //n!
        for(int i=1; i<=n;i++){
            total1*=i;
        }
        //r!
        for(int k=1; k<=r;k++){
            total2*=k;
        }
        //(n-r)!
        for(int m=1; m<=(n-r);m++){
            total3*=m;
        }

        //C(n,r) = n! / (r! * (n-r)!)
        int result=total1/(total2*total3);

        System.out.println("Cevap : "+ result);


    }
}
