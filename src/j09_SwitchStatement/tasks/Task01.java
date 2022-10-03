package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.println("agam bir sayı gir");
        System.out.print("Sayi = ");
        int sayi = sc.nextInt();
        int onlarBasamagi=(sayi/10)%10;



        switch (onlarBasamagi){
            case 0:
                System.out.println("onlar basamagı sıfır");
                break;
            case 1:
                System.out.println("onlar basamagı bir");
                break;
            case 2:
                System.out.println("onlar basamagı iki");
                break;
            case 3:
                System.out.println("onlar basamagı üç");
                break;
            case 4:
                System.out.println("onlar basamagı dört");
                break;
            case 5:
                System.out.println("onlar basamagı beş");
                break;
            case 6:
                System.out.println("onlar basamagı altı");
                break;
            case 7:
                System.out.println("onlar basamagı yedi");
                break;
            case 8:
                System.out.println("onlar basamagı sekiz");
                break;
            case 9:
                System.out.println("onlar basamagı dokuz");
                break;
            default:
                System.out.println("agam düzgün bir sayı gir");

        }




    }
}
