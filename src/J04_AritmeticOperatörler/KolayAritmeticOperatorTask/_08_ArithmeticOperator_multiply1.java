package J04_AritmeticOperatörler.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _08_ArithmeticOperator_multiply1 {

    public static void main(String[] args) {

        /* Verilen 3 double hakkında, (num1 , num2, num3),
            Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
            Sonucu yazdırın.  */

        System.out.println("Girdiğiniz 3 sayı birbiri ile çarpılacaktır.");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc1.nextInt();
        int num3 = sc2.nextInt();

        int sonuc = num1*num2*num3;

        System.out.println("Girdiğiniz sayıların çarpım sonuçları aşağıdadır");
        System.out.println(sonuc);




    }
}
