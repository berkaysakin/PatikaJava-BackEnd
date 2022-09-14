import java.util.Scanner;
public class odev19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Sayıyı Giriniz : ");
        int number=input.nextInt();
        System.out.println("4'ün kuvvetleri");
        for(int i=1;i<=number;i*=4){

            System.out.println(i);
        }
        System.out.println("5'in kuvvetleri");
        for(int k=1;k<=number;k*=5){
            System.out.println(k);
        }
    }

}
