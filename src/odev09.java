import java.util.Scanner;
public class odev09 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String userName,password,answer,newPassword;

        System.out.print("Kullanıcı Adınız : ");
        userName=input.nextLine();
        System.out.print("Şifreniz : ");
        password=input.nextLine();

        if(userName.equals("patika")&&password.equals("java123")){

            System.out.println("Giriş başarılı");

        }else if(userName.equals("patika")){

            System.out.print("Şifre hatalı!\nŞifreyi sıfırlamak ister misiz?(evet/hayır) : ");
            answer=input.nextLine();

            if (answer.equals("evet")|| answer.equals("Evet")){

                System.out.print("Yeni Şifreniz : ");
                newPassword=input.nextLine();

                if(newPassword.equals("java123")){

                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                }else{

                    System.out.println("Şifre oluşturuldu");
                }

            }else{
                System.out.println("İşlem sonlandırıldı");
            }

        }else{
            System.out.println("Bütün Bilgiler Hatalı!");
        }


    }
}

