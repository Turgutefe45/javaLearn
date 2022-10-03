package J11_MethodCreation;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        //task--->girilen ad ve soyadın ilk harflerini  büyük digerlerini küçük yapan metot create ediniz..
        Scanner scan =new Scanner(System.in);
        System.out.println("adıınızı giriniz : ");
        String ad = scan.next();
        System.out.println("soyadınızı giriniz : ");
        String soyad = scan.next();
        ebikGabık(ad,soyad);



    }

    private static String ebikGabık(String ad, String soyad) {
        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad= soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
        System.out.println("ad  soyad = " + ad+" "+soyad);
        return ad +"  "+soyad;
    }
}
