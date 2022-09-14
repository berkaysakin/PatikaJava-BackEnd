public class odev24 {
    public static void main(String[] args) {

       int n=5;
        for(int i=1; i<=n;i++){          //(n-i) yerine ilk satırda 5 boşluk olduğu için 5 de yazılabilir
                                         //ve 5'ten birer birer düşmeye başlar
            for (int k=1;k<=(n-i);k++){  //gösterilen piramit modelinde her bir satırda boşluk birer düşüyor
                                         //n satır sayısı, i yazılan yıldızlar
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i)-1;j++){

                System.out.print("*");
            }
            System.out.println();       //yıldızları alt satıra atmak için
        }



    }
}
