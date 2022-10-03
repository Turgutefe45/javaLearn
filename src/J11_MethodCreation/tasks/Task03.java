package J11_MethodCreation.tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.
		Scanner scan = new Scanner(System.in);


		System.out.print("Saat değerini giriniz : ");
		double saat2 = scan.nextInt();
		System.out.print("Mil değerini giriniz : ");
		double mil = scan.nextDouble();
		System.out.print("Kilogram değerini giriniz : ");
		double kilo = scan.nextDouble();
		cevirici(saat2, mil, kilo);

	}
	public static void cevirici (double saat , double mil , double kg) {
		System.out.println("saat = " + saat + " saniye = " + saat * 3600 + " mil = " + mil + " km = " + mil * 1.619 +
				" kg = " + kg + " gr = " + kg * 1000);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
