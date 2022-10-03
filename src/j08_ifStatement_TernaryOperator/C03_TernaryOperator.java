package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {

        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.

       // Scanner sc = new Scanner(System.in);
        Scanner sc= new Scanner(System.in);

        System.out.println("agam bi tamsayı gir bakam : ");

        int agaSayisi = sc.nextInt();

        System.out.println("   ***  if-else   ***   ");

        if (agaSayisi % 2 == 0) {

            System.out.println("agam sayi ÇİFT");

        } else System.out.println("agam sayi TEK ");




        System.out.println("   ***  ternary   ***   ");
        // String sonuc  =(agaSayisi%2==0 ? "agam sayı ÇİFT" :"agam sayi TEK");//komut cıktısı String  type variable
        //   System.out.println("sonuc = " + sonuc);

        System.out.println(agaSayisi % 2 == 0 ? "agam sayı ÇİFT" : "agam sayi TEK");

        /*
        ahan da TRICK->  ternary operator işlem sonucunda true veya false göre bir cıktı verir.
        eger bu çıktı type göre bir variable atanmazsa sout ile doğrudan print edlimeli.
         */

    }
}
