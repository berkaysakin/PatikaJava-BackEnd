import java.util.Scanner;
public class odev12 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Sıralamak için\nA Sayısını Giriniz : ");
        int a=input.nextInt();
        System.out.print("B Sayısını Giriniz : ");
        int b=input.nextInt();
        System.out.print("C Sayısını Giriniz : ");
        int c=input.nextInt();

        if(a<b&&a<c){
            if(b<c){
                System.out.println("A<B<C");
            }else{
                System.out.println("A<C<B");
            }
        }else if(b<c&&b<a){
            if(c<a){
                System.out.println("B<C<A");
            }else{
                System.out.println("B<A<C");
            }

        }else if(c<b&&c<a){
            if(b<a){
                System.out.println("C<B<A");
            }else{
                System.out.println("C<A<B");
            }
        }

    }
}
