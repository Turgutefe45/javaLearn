package j10_StringManipulations;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

        System.out.println("İsim ve soyisim giriniz");
        Scanner sc = new Scanner(System.in);

        String adSoyad = sc.nextLine();

        int index = adSoyad.indexOf(" ");

        String ad = adSoyad.substring(0 ,  index);
        String soyad = adSoyad.substring(index);

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);


    }
}
