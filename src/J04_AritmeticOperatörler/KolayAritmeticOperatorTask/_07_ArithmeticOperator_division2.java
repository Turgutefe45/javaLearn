package J04_AritmeticOperatörler.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _07_ArithmeticOperator_division2 {

    public static void main(String[] args) {

        /* Verilen int ler hakkında, (num1, num2),
            num1'i num2'ye bölün ve sonucu int sonuc'a eşitleyin.
            int sonucu yazdırın. */

        System.out.println("İki sayı girin. Girdiğiniz ilk sayı 2.sayıya bölünecektir");
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan1.nextInt();

        double sonuc = num1/num2;
        int gsonuc = (int)sonuc;

        System.out.println("Bölüm sonucu aşağıdadır");
        System.out.println(gsonuc);







    }
}
