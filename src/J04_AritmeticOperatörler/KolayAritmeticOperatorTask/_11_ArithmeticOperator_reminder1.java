package J04_AritmeticOperatörler.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _11_ArithmeticOperator_reminder1 {

    public static void main(String[] args) {

        /*  Verilen int ler hakkında (num1, num2),
            num1 'in   num2'ye bölümünden kalanı, int sonuc'a  eşitleyin.
            int sonucu yazdırın.  */

        Scanner sc1 = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz.");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("İkinci sayıyı giriniz");
        int num1 = sc1.nextInt();
        int num2 = sc2.nextInt();
        int kalan = num1 % num2;

        System.out.println("İki sayının bölümünden kalan " + (kalan) + " idir" );




    }
}
