package j10_StringManipulations;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kel= scan.nextLine();
        System.out.println(kel.length()/2);

    }
}
