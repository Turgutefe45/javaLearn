package J11_MethodCreation.tasks;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("şekillerden birini seçiniz <P>aralelkenar,<U>çgen;<D>ikdörtgen");
		char şekil = scan.next().toUpperCase().charAt(0);
		System.out.println("seççtiginiz şekil için iki kenar giriniz: ");
		double kkenar = scan.nextDouble();
		double bkenar = scan.nextDouble();
		altı(şekil,bkenar,kkenar);
		//System.out.println(altı(char a , double k ,double u));


	}

	public static void altı(char a, double k, double u) {
		if (a == 'P') {
			System.out.println("paralel kenarın çevresi = " + (2 * k * u) + "paralel kenarın alanı için dik kenar bilinmelidir");

		} else if (a == 'D') {
			System.out.println("dikdörtgenin çevresi = " + (2 * (k + u)) + "dikdöörtgenin alanı= " + (k * u));
		} else if (a == 'U') {
			System.out.println("üçgenin çevresi için üçüncü kenar bilinmelidir" + " " +"üçgenin alanı için yükeklik bilinmelidir");

		}


	}
}
