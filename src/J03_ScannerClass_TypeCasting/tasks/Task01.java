package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen final,vize ve project notlarıınızı giriniz");

        int fina= scan.nextInt();
        int vize = scan.nextInt();
        int proje = scan.nextInt();
        double ort =  fina*0.5+vize*0.3+proje*0.2;
        System.out.println("ortalamanız  : "+ ort);

    }
}
