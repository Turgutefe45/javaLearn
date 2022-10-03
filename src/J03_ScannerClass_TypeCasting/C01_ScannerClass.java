package J03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("adınızı giriniz");
        String isim = scan.nextLine();
        System.out.println("isim = " + isim);
        Scanner scan2 = new Scanner(System.in);

        System.out.println("karenin kenar uzunlugunu giriniz");

        int kenar = scan.nextInt();
        System.out.println("alan :" + (kenar * kenar) + "çevre : " + (kenar * 4));

       // Scanner sc = new Scanner(System.in);//1. adım
       // System.out.println("isminiz giriniz : ");//2. adım
        // char ch = sc.nextLine().charAt(0);// kullanıcıdan gelen string ifadenin 0. index ilk  karakteririni alır
        // System.out.println("isminizin ilk karakteri :" + ch);
        // String isim=sc.nextLine();//kullanıcını girdiği tüm satırı isim'e atar
       // String ad = sc.next();//kullanıcını girdiği ilk ifadeyi  ad'e atar
        // System.out.println("ad = " + ad);
        // System.out.println("isim = " + isim);
        System.out.println("3 basamaklı bir sayı giriniz");
        int ucSay= scan.nextInt();
        System.out.println( "birler basamagı :"+ ucSay%10);
        ucSay /= 10 ;
        System.out.println( "onlar basamagı :"+ ucSay%10);
        ucSay /= 10 ;
        System.out.println( "yüzler basamagı :"+ ucSay%10);

    }

}