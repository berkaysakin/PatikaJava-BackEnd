import java.util.Scanner;
public class odev17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int total=0,counter=0,num;
        System.out.print("Sayı Giriniz: ");
         num= input.nextInt();

        for(int i=1; i<=num;i++){

            if(i%4==0 && i%3==0){
                total+=i;
                counter++;

            }
        }
        int answer=total/counter;
        System.out.println("3 ve 4'ün ortak katlarının ortalaması: "+answer);

    }
}
