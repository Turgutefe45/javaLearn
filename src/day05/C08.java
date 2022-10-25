package day05;

import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cm giriniz");
        int sayi= scan.nextInt();
        çeviri(sayi);


    }

    private static int çeviri(int sayi) {
        return sayi/100;
    }

}
