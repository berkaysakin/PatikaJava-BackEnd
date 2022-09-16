import java.util.Scanner;
public class odev29 {
    public static void main(String[] args) {

        int a=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıldız istediğiniz satır sayısı : ");
        a = input.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*a-(2*i-1); k++) {

                System.out.print("*");

            }
            System.out.println("");
        }
    }
}
