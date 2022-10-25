package day06;

import java.util.Scanner;

public class deneme5 {
    public static void main(String[] args) {
        /*
   Get the number of rows and columns from user.
   Create a rectangle.
   rows = 3 and column = 5 ==> * * * * *
                               * * * * *
                               * * * * *
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("satır giriniz");int sat=scan.nextInt();
        System.out.println("sutun giriniz");int sut=scan.nextInt();

        for (int i = 1; i <= sat; i++) {
            for (int j = 1; j <=sut ; j++) {
                System.out.print("* ");

            }
            System.out.println();// dumy

        }

    }
}
