package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_İfElseStatement {
    public static void main(String[] args) {
        /*
TASK-> girilen yasın 18 den buyuklugunu kontrol eden code create ediniz
 */
        Scanner scan =new Scanner(System.in);
        System.out.println("yasınızı giriniz: ");

        int yas=scan.nextInt();
        if(yas>18) System.out.println("yasınız 18 den büyük");
        Scanner Scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı = scan.nextInt();
        if (sayı>0) System.out.println( "girdiginiz sayı pozitif");
        else if (sayı<0) System.out.println("girdiginiz sayı negatiftir");
        else System.out.println("girdiginiz sayı sıfırdır");

        }

    }

