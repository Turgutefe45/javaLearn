package day05;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan =new Scanner(System.in);
        String isim=scan.next();
        String Sisim= scan.next();
        if (isim.length()>Sisim.length())
            System.out.println("isminiz daha uzun");

    }
}
