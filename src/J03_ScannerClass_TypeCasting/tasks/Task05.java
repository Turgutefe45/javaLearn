package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.

		Scanner scan = new Scanner(System.in);
		System.out.println("iki tam sayı giriniz");
		int say1= scan.nextInt();
		int say2=scan.nextInt();
		System.out.println("bunların toplamı :"+(say2+say1));
		System.out.println("bunların farkı: "+(say2-say1));
		System.out.println("bunların çarpımı :"+(say2*say1));
		System.out.println("bunların bölümü :"+(say2/say1));


	}

}
