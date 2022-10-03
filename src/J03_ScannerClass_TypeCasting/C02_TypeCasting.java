package J03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {
          /*
 byte < short < int < long < float < double
   Auto Widening Casting -> Kucuk data type'larini buyuk data typlearina
Java  otomatik olarak yapar.

 */
        boolean basarılı = true;
        //String basarı=basarılı; -> dogal uyum olmayan variable'larda castşng yapılamaz CTE
        // System.out.println("basarılı = " + basarılı);-> true
        // System.out.println("basarı = " + basarı);->true
        double d = 17;// double variable'a int 17 atandı k->b
        System.out.println("d = " + d);//d = 17.0 auto widding
        int sayi1=33;
        int sayi2=7;

        System.out.println(sayi1/sayi2);// 4
        /*
        java iki int sayiyi biribirine böldugunuzde sonucu int verir
         eğer bölme işleminde ondalık sonuç çıkarsa ondalık kısmı siler
         */

         /* Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
                *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
                *
         *
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("ascii degeri istedigin karekteri gir");
        char ch=scan.nextLine().charAt(0);
        int chasciiDegeri=ch;
        System.out.println(ch+"'ın chasciiDegeri = " + chasciiDegeri);

    }
}
