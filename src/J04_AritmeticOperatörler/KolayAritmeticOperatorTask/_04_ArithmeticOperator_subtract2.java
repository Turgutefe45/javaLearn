package J04_AritmeticOperatörler.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _04_ArithmeticOperator_subtract2 {

    public static void main(String[] args) {

        /*
        Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
        Sonucu yazdırın.
        Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.
         */
        System.out.println("4 tane sayı giriniz. İlk girdiğiniz sayıdan diğer sayılır çıkarılacaktır!!");


        Scanner sc =new Scanner(System.in);
        Scanner sc1 =new Scanner(System.in);
        Scanner sc2 =new Scanner(System.in);
        Scanner sc3 =new Scanner(System.in);

        int sayi = sc.nextInt();
        int sayi1 = sc1.nextInt();
        int sayi2 = sc2.nextInt();
        int sayi3 = sc3.nextInt();

        System.out.println( "Sonuç " + (sayi - sayi1 - sayi2 - sayi3) + " idir");



    }
}
