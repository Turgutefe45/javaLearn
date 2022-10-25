package Ödev_For.Tasks;

import java.util.Scanner;

public class Odev03 {
    public static void main(String[] args) {
        /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
         * bir method create ediniz.
         *
         *  getAsalMi(int sayi)
         *      return true/false

         * */
        Scanner scan =new Scanner(System.in);
        System.out.println("bir dogal sayı girinız");
        int sayi=scan.nextInt();
        boolean asalMi=true;
        System.out.println("girdiginiz sayıasalmı: "+ sayiAsalMi(sayi, asalMi));
        System.out.println(sayiAsalMi(45, asalMi));


    }

    private static boolean sayiAsalMi(int sayi ,boolean asalMi) {
        for (int i = 2; i < sayi; i++) {
            if (sayi % i ==0){
                asalMi=false;

            }

        }





        return asalMi;
    }
}