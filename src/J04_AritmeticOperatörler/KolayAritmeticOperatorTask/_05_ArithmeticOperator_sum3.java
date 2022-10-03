package J04_AritmeticOperatörler.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _05_ArithmeticOperator_sum3 {

    public static void main(String[] args) {

          /*    kullanıcıdan alınan 3 tane int
         toplamını print eden code create ediniz. */

        System.out.println("Toplanmasını istediğiniz 3 sayı giriniz");

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int sayi = sc.nextInt();
        int sayi1 = sc1.nextInt();
        int sayi2 = sc2.nextInt();

        System.out.println("Girilen 3 sayının toplamı aşağıdadır");
        System.out.println( sayi + sayi1 + sayi2);


    }
}
