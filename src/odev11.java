import java.util.Scanner;
public class odev11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int heat;
        System.out.print("mevcut sıcaklık derecesini giriniz : ");
        heat=input.nextInt();

        if(heat<5){

            System.out.println("Kayak Yapabilirsiniz");
        } else if (heat>=5 && heat<=15) {

            System.out.println("Sinemaya Gidebilirsiniz");
        }else if(heat>=15 && heat<=25){

            System.out.println("Piknik Yapabilirsiniz");
        }else if(heat>25){

            System.out.println("Ufak Su Birikintisinde Yüzebilirsiniz");
        }

    }
}
