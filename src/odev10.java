import java.util.Scanner;
public class odev10 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int mat,tr,fiz,kim,muz,top,ortalama,sayac=5;
        System.out.print("Matematik Notunuz: ");
        mat=input.nextInt();
        System.out.print("Türkçe Notunuz: ");
        tr=input.nextInt();
        System.out.print("Fizik Notunuz: ");
        fiz=input.nextInt();
        System.out.print("Kimya Notunuz: ");
        kim=input.nextInt();
        System.out.print("Müzik Notunuz: ");
        muz=input.nextInt();

        top=mat+tr+fiz+kim+muz;


        if (mat>100 || mat<0){
            top-=mat;
            sayac--;
        }
        if (tr>100 || tr<0){
            top-=tr;
            sayac--;
        }
        if (fiz>100 || fiz<0){
            top-=fiz;
            sayac--;
        }
        if (kim>100 || kim<0){
            top-=kim;
            sayac--;
        }
        if (muz>100 || muz<0){
            top-=muz;
            sayac--;
        }

        ortalama=top/sayac;

        if(ortalama>55){
            System.out.println("geçtiniz");
        }else{
            System.out.println("kaldınız");
        }

        System.out.println("notunuz" + ortalama);

    }
}
