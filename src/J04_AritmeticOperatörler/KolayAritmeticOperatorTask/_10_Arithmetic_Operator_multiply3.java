package J04_AritmeticOperatörler.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _10_Arithmetic_Operator_multiply3 {

    public static void main(String[] args) {

        /* Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        Bu int'leri birbiriyle çarpın ve sonuca eşitleyin.
        int sonuc u yazdırın. */

        System.out.println("4 sayı giriniz. Girdiğiniz sayılar birbirleri ile çarpılacaktır");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);

    int num1 = sc1.nextInt();
    int num2 = sc2.nextInt();
    int num3 = sc3.nextInt();
    int num4 = sc4.nextInt();

    int sonuc = num1*num2*num3*num4;

        System.out.println("Sayıların çarpım sonucu aşağıdadır");
        System.out.println(sonuc);




    }
}
