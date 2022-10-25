package Ödev_For.Tasks;

import java.util.Scanner;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("sayıların oldugu bir string giriniz");
		String cumle = scan.nextLine();
		int rakam = 0;
		for (int i = 0; i < cumle.length(); i++) {
			if (cumle.charAt(i) >= '0' && cumle.charAt(i) <= '9') {
				rakam++;
				System.out.println("girilen cümlede:" + rakam + "adet rakam vardır");
			}

		}


	}
}

