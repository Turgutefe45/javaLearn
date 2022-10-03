package J04_AritmeticOperatörler.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _09_ArithmeticOperator_multiply2 {

    public static void main(String[] args) {

    /*    Oluşturulmuş olan double'lar hakkında,
        Bu 4 doubleyi  birbiriyle çarpın ve sonuca  eşitleyin.
        Double sonucu yazdırın.   */

        System.out.println("4 tane ondalıklı sayı giriniz. Girdiğiniz sayılar birbiri ile çarpılacaktır");

        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);

        double do1 = input1.nextDouble();
        double do2 = input2.nextDouble();
        double do3 = input3.nextDouble();
        double do4 = input4.nextDouble();

        double sonuc = do1*do2*do3*do4;
        System.out.println("Sayıların çarpımı budur");
        System.out.println(sonuc);






    }
}
