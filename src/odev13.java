import java.util.Scanner;
public class odev13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz : ");
        int bMonth= input.nextInt();
        System.out.print("Doğduğunuz günü giriniz : ");
        int bDay= input.nextInt();

        switch (bMonth){

            case 1:
                if (bDay>=1 &&bDay<=31){

                    if(bDay<=21){
                        System.out.println("oğlak burcusunuz : "+bDay+" ocak");
                    }else{
                        System.out.println("kova burcusunuz : "+bDay+" ocak");
                    }
                }else{
                    System.out.println("geçersiz bir tarih girdiniz");
                }
                break;

            case 2 :
                if (bDay>=1 &&bDay<=31){

                    if(bDay<=19){
                        System.out.println("kova burcusunuz : "+bDay+" şubat");
                    }else{
                        System.out.println("balık burcusunuz : "+bDay+" şubat");
                    }
                }else{
                    System.out.println("geçersiz bir tarih girdiniz");
                }
                break;

            case 3:
                if (bDay>=1 &&bDay<=31){

                    if(bDay<=20){
                        System.out.println("balık burcusunuz : "+bDay+" mart");
                    }else{
                        System.out.println("koç burcusunuz : "+bDay+" mart");
                    }
                }else{
                    System.out.println("geçersiz bir tarih girdiniz");
                }
                break;

            case 4:
                if (bDay>=1 &&bDay<=31){

                    if(bDay<=20){
                        System.out.println("koç burcusunuz : "+bDay+" nisan");
                    }else{
                        System.out.println("boğa burcusunuz : "+bDay+" nisan");
                    }
                }else{
                    System.out.println("geçersiz bir tarih girdiniz");
                }
                break;

            case 5:
                if (bDay>=1 &&bDay<=31){

                    if(bDay<=21){
                        System.out.println("boğa burcusunuz : "+bDay+" mayıs");
                    }else{
                        System.out.println("ikizler burcusunuz : "+bDay+" mayıs");
                    }
                }else{
                    System.out.println("geçersiz bir tarih girdiniz");
                }
                break;

            case 6:
                if (bDay>=1 &&bDay<=31){

                    if(bDay<=22){
                        System.out.println("ikizler burcusunuz : "+bDay+" haziran");
                    }else{
                        System.out.println("yengeç burcusunuz : "+bDay+" haziran");
                    }
                }else{
                    System.out.println("geçersiz bir tarih girdiniz");
                }
                break;

            case 7:
                if (bDay>=1 &&bDay<=31){

                    if(bDay<=22){
                        System.out.println("yengeç burcusunuz : "+bDay+" temmuz");
                    }else{
                        System.out.println("aslan burcusunuz : "+bDay+" temmuz");
                    }
                }else{
                    System.out.println("geçersiz bir tarih girdiniz");
                }
                break;

            case 8:
                if (bDay>=1 &&bDay<=31){

                    if(bDay<=22){
                        System.out.println("aslan burcusunuz : "+bDay+" ağustos");
                    }else{
                        System.out.println("başak burcusunuz : "+bDay+" ağustos");
                    }
                }else{
                    System.out.println("geçersiz bir tarih girdiniz");
                }
                break;

            case 9 :
                if (bDay>=1 &&bDay<=31){

                    if(bDay<=22){
                        System.out.println("başak burcusunuz : "+bDay+" eylül");
                    }else{
                        System.out.println("terazi burcusunuz : "+bDay+" eylül");
                    }
                }else{
                    System.out.println("geçersiz bir tarih girdiniz");
                }
                break;

            case 10:
                if (bDay>=1 &&bDay<=31){

                    if(bDay<=22){
                        System.out.println("terazi burcusunuz : "+bDay+" ekim");
                    }else{
                        System.out.println("akrep burcusunuz : "+bDay+" ekim");
                    }
                }else{
                    System.out.println("geçersiz bir tarih girdiniz");
                }
                break;

            case 11:
                if (bDay>=1 &&bDay<=31){

                    if(bDay<=21){
                        System.out.println("akrep burcusunuz : "+bDay+" kasım");
                    }else{
                        System.out.println("yay burcusunuz : "+bDay+" kasım");
                    }
                }else{
                    System.out.println("geçersiz bir tarih girdiniz");
                }
                break;

            case 12:
                if (bDay>=1 &&bDay<=31){

                    if(bDay<=21){
                        System.out.println("yay burcusunuz : "+bDay+" aralık");
                    }else{
                        System.out.println("oğlak burcusunuz : "+bDay+" aralık");
                    }
                }else{
                    System.out.println("geçersiz bir tarih girdiniz");
                }
                break;








        }

    }
}
