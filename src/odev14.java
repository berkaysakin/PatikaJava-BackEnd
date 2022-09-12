import java.util.Scanner;
public class odev14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int distance,age,type;

        //mesafe başına ücret 0.10
        //negatif değer girişinde hatalı veri uyarısı
        //12 yaştan küçükse %50, 12-24 arasında %10, >65 ise %30 indirim uygulanır
        //yolculuk tipi gidiş dönüşse %20 indirim uygulanır

        System.out.print("Mesafeyi KM Cinsinden Giriniz : ");
        distance=input.nextInt();
        System.out.print("Yaşınızı Giriniz : ");
        age= input.nextInt();
        System.out.print("Yolculuk Tipinizi Seçiniz(1:Tek Yön - 2:Gidiş-Dönüş) : ");
        type=input.nextInt();

        if(distance<0||age<0||type<0){
            System.out.println("Hatalı Veri Girişi Yaptınız");
            System.exit(0);
        }

        double charge=distance*0.10;
        double chargeFiftyP=charge*1/2;
        double chargeTenP=charge-charge*1/10;
        double chargeThirtyP=charge-charge*35/100;
        double doubleTicketFiftyP=2*chargeFiftyP-chargeFiftyP*0.20;
        double doubleTicketThrityP=2*chargeThirtyP-chargeThirtyP*0.20;
        double doubleTicketTenP=2*chargeTenP-chargeTenP*0.20;
        double doubleTicketCharge=2*charge-charge*0.20;

        if(type==1){
            if( age>=1 && age<12){
                System.out.println("Ödemeniz Gereken Ücret : "+chargeFiftyP);
            }else if(age>=12 && age<=24){
                System.out.println("Ödemeniz Gereken Ücret : "+chargeTenP);
            }else if(age>65){
                System.out.println("Ödemeniz Gereken Ücret : "+chargeThirtyP);
            }else{
                System.out.println("Ödemeniz Gereken Ücret : "+charge);
            }
        }
        else if(type==2){
            if( age>=1 && age<12){
                System.out.println("Ödemeniz Gereken Ücret : "+doubleTicketFiftyP);
            }else if(age>=12 && age<=24){
                System.out.println("Ödemeniz Gereken Ücret : "+doubleTicketThrityP);
            }else if(age>65){
                System.out.println("Ödemeniz Gereken Ücret : "+doubleTicketTenP);
            }else{
                System.out.println("Ödemeniz Gereken Ücret : "+doubleTicketCharge);
            }
        }else{
            System.out.println("Hatalı Veri Girişi Yaptınız!");
        }


    }
}
