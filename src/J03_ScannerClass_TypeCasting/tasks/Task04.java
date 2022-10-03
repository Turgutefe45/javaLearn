package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen aşağıdaki bilgileri giriniz");
        System.out.print("İsim Soyisminiz:  "); String adSoyad = scan.next();
        System.out.print("Yaşınız:  "); int yas = scan.nextInt();
        System.out.print("Kilonuz (KG):  "); int kilo1 = scan.nextInt();
        System.out.print("Boyunuz (CM):  "); int boy1 = scan.nextInt();
        System.out.print("Salona kaç ay geleceksiniz:  "); int ay = scan.nextInt();
        System.out.println("Aylık ücret 20$ olmak üzere, sizin toplam ücretiniz " + ay*20 +"$'dır.");


    }
}
