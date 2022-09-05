import java.util.Scanner;
public class odev03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Birinci Kenar Uzunluğunu: ");
        int a=input.nextInt();

        System.out.print("İkinci Kenar Uzunluğunu: ");
        int b=input.nextInt();

        System.out.print("Üçüncü Kenar Uzunluğunu: ");
        int c=input.nextInt();

        int u=(a+b+c)/2;
        double alan=(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Alanı: "+alan);



    }
}
