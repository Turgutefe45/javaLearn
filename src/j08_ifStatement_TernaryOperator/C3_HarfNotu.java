package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C3_HarfNotu {
    public static void main(String[] args) {
        Scanner Scan =new Scanner(System.in);
        System.out.println("agam notunu gir:");
        int not=Scan.nextInt();
        if (not<0 || not>100) System.out.println("agam böyle not olmaz");
        else if(not<50) System.out.println("D");
        else if(not<60) System.out.println("C");
        else if(not<80) System.out.println("B");
        else System.out.println("A");




    }
}
