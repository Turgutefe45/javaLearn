package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("günde kaç saat uyuyorsunuz");
        int uyku = scan.nextInt();
        int ay = uyku*30;
        int yıl = ay*12;
        int yıl40= yıl*40;
        System.out.println("ayda :"+ay + " "+ " yılda :" +yıl +"  " + "40 yılda :"+ yıl40);

    }
}
