package J04_AritmeticOperatörler.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _06_ArithmeticOperator_division1 {

    public static void main(String[] args) {

        /*    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         bölümünü print eden code create ediniz. */

        System.out.println("İki sayı giriniz. İlk girdiğiniz sayı 2. girdiğiniz sayıya bölünecektir");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        int sayi = sc.nextInt();
        int sayi1 = sc1.nextInt();

        double gsayi = sayi;
        double gsayi1 = sayi1;

        System.out.println("Girdiğiniz sayıların bölümü aşağıdadır");
        System.out.println(gsayi/gsayi1);




    }
}
