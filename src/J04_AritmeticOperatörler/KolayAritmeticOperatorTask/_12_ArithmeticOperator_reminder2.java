package J04_AritmeticOperatörler.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _12_ArithmeticOperator_reminder2 {

    public static void main(String[] args) {

        /* Verilen int ler hakkında (num1 ve num2),
            num1'in num2'ye bölümünden kalanı int sonuc'a eşitleyiniz.
            int sonuc'u yazdırınız.  */

        System.out.println("İki sayı giriniz. Sistem bunları birbirine bölecektir");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int num1 = sc1.nextInt();
        int num2 = sc2.nextInt();

        int kalan = num1 % num2;

        System.out.println("İlk girilen sayının ikinci sayıya bölümünden kalan " + kalan + " budur ");






    }
}
