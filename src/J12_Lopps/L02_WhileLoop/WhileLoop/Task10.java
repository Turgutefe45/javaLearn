package J12_Lopps.L02_WhileLoop.WhileLoop;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.

Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int say= scan.nextInt();
        for (int i = 0; i < say; i++) {
            if (i % 2 == 1) System.out.println(i+=0);

        }

    }
}
