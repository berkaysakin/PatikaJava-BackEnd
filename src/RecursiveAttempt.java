import java.util.Scanner;
public class RecursiveAttempt {
    static int topRe(int n){
        if(n==1){
            return 1;

        }
        return n+topRe(n-1);
    }
    static int fibRe(int n){
        if(n==1||n==2){
            return 1;
        }
        return fibRe(n-1)+fibRe(n-2);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Fibonaci serisinde bulmak istediğiniz sayı : ");
        int n= input.nextInt();

        System.out.println("Sonuç : "+ fibRe(n));

    }
}
