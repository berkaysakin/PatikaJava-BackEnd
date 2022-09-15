import java.util.Scanner;

public class odev25 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String id,password;
        int yourRight=3,balance=2000 ;

        while(yourRight>0){
            System.out.println("Kullanıcı Adınız : ");
            id=input.nextLine();
            System.out.print("Şifreniz : ");
            password=input.nextLine();
            int select;

            if(id.equals("patika")&&password.equals("123")){
                System.out.println("-------------Giriş Başarılı-------------");


                do {

                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış");
                    select= input.nextInt();
                    int price;
                    switch (select) {
                        case 1:
                            System.out.print("Yüklemek istediğiniz tutar : ");
                            price = input.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.print("Çekmek istediğiniz tutar : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Yetersiz Bakiye.");
                            } else {
                                balance -= price;
                                System.out.println("İşlem gerçekleştirildi. Bakiyeniz : "+balance);
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;

                        default:
                            System.out.println("Gerçsiz değer girdiniz.");
                            break;
                    }
                } while (select != 4);
                System.out.println("Görüşmek üzere.");

                }else{

                yourRight--;
                System.out.println("-------------Hatalı Bilgi-------------");
                System.out.println("-------------Kalan Hakkınız : " + yourRight);
                if (yourRight == 0) {
                    System.out.println("Hesabınız bloke edilmiştir");
                }
            }

        }










    }
}
