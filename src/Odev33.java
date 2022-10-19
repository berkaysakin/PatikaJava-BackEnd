public class Odev33 {
    static boolean isPalindrom(int number) {
        int tempNumber=number,reverseNumber=0,lastNumber;
        while (tempNumber!=0){
            lastNumber=tempNumber%10; //lastNumber = tempNumber'ın 10'a bölümünden kalan
            reverseNumber=(reverseNumber*10)+lastNumber;
            tempNumber/=10;
        }
        if (reverseNumber==number){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(88));

    }
}

