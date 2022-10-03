package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /* girilen bir karektrin harf olup olmadıgını kontrol eden code create ediniz*/




        Scanner sc =new Scanner(System.in);

        System.out.print("bir karekter giriniz : ");

        char karekter =sc.nextLine().charAt(0);
        if((karekter>='A'&&karekter<='Z')||(karekter>='a'&& karekter<='a'));
        System.out.println("ghirdiginiz karekter harftir");
          System.out.println("karekter harf değildir");

    }
}
