package J04_AritmeticOperatörler.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _03_ArithmeticOperator_subtract1 {

    public static void main(String[] args) {

    /*     /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         farkını print eden code create ediniz. */

        System.out.println("İki sayı giriniz");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        int sayi1 = sc.nextInt();
        int sayi2 = sc1.nextInt();

        System.out.println("Girdiğiniz sayıların farkı aşağıdadır");
        System.out.println(sayi1 - sayi2);


    }
}
