package J04_AritmeticOperatörler.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _02_ArithmeticOperator_sum2 {

    public static void main(String[] args) {

     /*     /*    kullanıcıdan alınan 4 tane int
         toplamını print eden code create ediniz. */
        System.out.println("4 tane sayı giriniz");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        int sayi = sc.nextInt();
        int sayi1 = sc1.nextInt();
        int sayi2 = sc2.nextInt();
        int sayi3 = sc3.nextInt();

        System.out.println("Sayıların toplamı");
        System.out.println(sayi+sayi1+sayi2+sayi3);



    }
}
