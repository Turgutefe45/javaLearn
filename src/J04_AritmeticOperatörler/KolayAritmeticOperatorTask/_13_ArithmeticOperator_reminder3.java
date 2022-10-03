package J04_AritmeticOperatörler.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _13_ArithmeticOperator_reminder3 {

    public static void main(String[] args) {

        /* Verilen iki int hakkında,
            num1'in num2'ye bölümünden kalanı yazdırınız.  */

        System.out.println("İki sayı giriniz. Girdiğiniz ilk sayı ikinci girdiğiniz sayıya bölünecek ve size kalan söylenecektir");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int num1 = sc1.nextInt();
        int num2 = sc2.nextInt();

        int kalan = num1 % num2;

        System.out.println("İki sayının bölümünden kalan = " + kalan);




    }
}
