package J04_AritmeticOperatörler.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         toplamını print eden code create ediniz. */

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int sayi1 = sc1.nextInt();
        int sayi2 = sc2.nextInt();

        System.out.println("Sayıların toplamı");
        System.out.println(sayi1 + sayi2);



    }
}
