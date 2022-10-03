package J11_MethodCreation;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //girilen sayının eşitligini kontrol eden method crate ediniz
        Scanner scan = new Scanner(System.in);


        System.out.print("1. sayıyı giriniz : ");
        int sayı1 = scan.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        int sayı2 = scan.nextInt();

        System.out.println("eşitKontrol(sayı1, sayı2) = " + eşitKontrol(sayı1, sayı2));
        System.out.println(eşitKontrol(sayı1,sayı2));
        System.out.println("eşitKontrol(3,5) = " + eşitKontrol(3, 5));
        System.out.println("eşitKontrol(56,56) = " + eşitKontrol(56, 56));
        eşitKontrol2(8,7);
        eşitKontrol2(45,45);




    }

    private static boolean eşitKontrol(int sayı1, int sayı2) {
        boolean eşitmi = false;
        if (sayı1 == sayı2) {
            eşitmi = true;
        } else eşitmi = false;
        return eşitmi;


    }
    public static void eşitKontrol2(int a,int b){
        if (a==b){
            System.out.println("sayılar eşit: ");}
        else System.out.println("sayılar eşşit degil");


    }
}