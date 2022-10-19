import java.sql.SQLOutput;
import java.util.Scanner;

public class Odev34 {
    static int sum(int a , int b){

        int result =  a+ b;
        System.out.println("Sonuç : "+result);
        return result;
    }

    static int minus(int a, int b ){

        int result=a-b;
        System.out.println("Sonuç : "+result);
        return result;

    }
    static int times(int a , int b){
        int result=a*b;
        System.out.println("Sonuç : "+result);
        return result;
    }
    static int divided(int a , int b ){
        if(b==0){
            System.out.println("İkinci Sayı Sıfırdan Farklı Olmalı");
            return 0;
        }
        int result=a/b;
        System.out.println("Sonuç : " +result);
        return result;
    }
    static int base(int a , int b ){
        int result=1;
        for(int i=1 ; i<=b; i ++){
            result*=a;
        }
        System.out.println("Sonuç : "+ result);
        return result;
    }
    static int fac(int a){

        int result=1;
        for(int i = 1; i <= a; i++)
        {
            result = result * i;
        }

        System.out.println("Sonuç : "+result);
        return result;
    }
    static int mod(int a , int b){
        int result=a%b;
        System.out.println("Sonuç : "+result);
        return result;
    }
    static int dd(int a, int b){
        int result1=a*b;
        int result2=2*a+2*b;
        System.out.println("Dd Alanı : "+result1);
        System.out.println("Dd Çevresi : "+result2);
        return result1  ;
    }
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


        String menu="1-Toplama İşlemi\n" +
                "2-Çıkarma İşlemi\n" +
                "3-Çarpma İşlemi\n" +
                "4-Bölme İşlemi\n" +
                "5-Üslü Sayı Hesaplama\n" +
                "6-Faktöriyel Hesaplama\n" +
                "7-Mod Alma\n" +
                "8-Dikdörtgenin Alanını ve Çevresini Hesaplama\n" +
                "0-Çıkış Yap";


        System.out.println(menu);

        while(true){
            System.out.println("Bir İşlem Seçiniz : ");
            int select=input.nextInt();
            if(select==0){
                break;
            }
            if(select==6){
                System.out.println("Sayıyı Giriniz : ");
                int a= input.nextInt();
                fac(a);
                System.out.println(menu);
            }
            System.out.print("Birinci Sayıyı Giriniz : ");
            int a= input.nextInt();
            System.out.print( "İkinci Sayıyı Giriniz : " );
            int b=input.nextInt();
            switch (select){
                case 1 :
                    sum(a,b);
                    break;
                case 2 :
                    minus(a,b);
                    break;
                case 3 :
                    times(a,b);
                    break;
                case 4 :
                    divided(a,b);
                    break;
                case 5:
                    base(a,b);
                    break;
                case 6:
                    fac(a);
                      break;
                case 7:
                    mod(a,b);
                    break;
                case 8 :
                    dd(a,b);
                    break;

            }
        }

    }
}





