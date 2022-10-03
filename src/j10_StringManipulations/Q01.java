package j10_StringManipulations;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("bir cümle giriniz ");
        String  şehir = scan.nextLine();
        System.out.println(şehir.contains(" "));
//
      //  if (şehir.contains(" ")){
      //      System.out.println("Boşluk içeriyor");
      //  }else System.out.println("boşluk içermiyo");


    }
}

