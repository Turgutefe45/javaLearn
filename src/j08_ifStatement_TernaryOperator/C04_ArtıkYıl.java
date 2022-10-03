package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C04_ArtıkYıl {
    public static void main(String[] args) {
       /* Scanner Scan =new Scanner(System.in);
        System.out.println("agam yıl gir:");
        int yıl=Scan.nextInt();
        if((yıl%4==0)&&(yıl%100!=0)||(yıl%400==0)) System.out.println("girilen yıl artık yıl");
        else System.out.println("artık yıl degil");/*
           /*
        girilen bir yılın artık (LEAP YEAR) olmasını kontrol eden code create ediniz..
            artık yıl:
            Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
            Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
            Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("agam yilini   gir : ");
        int yil = sc.nextInt();

        // 4'un katı       100'un katı olmamamsı    400'un katı olması
        if ((yil%4==0)       &&  (yil %100!=0)  ||   (yil%400==0) ){
            System.out.println("girdiğiniz yil artık yıl  :-)");
        }else {
            System.out.println("giridiğinz yıl artık yıl değildir  :-(");
        }






    }
}
