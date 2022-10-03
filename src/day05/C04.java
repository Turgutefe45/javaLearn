package day05;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.
        Scanner scanner= new Scanner(System.in);
        String str = scanner.nextLine();
        int boşluk=str.indexOf(" ");
        if (boşluk==-1 && !str.isEmpty()) System.out.println("şartlara uygun");
        else System.out.println("şartlara uygun değil");


    }
}
