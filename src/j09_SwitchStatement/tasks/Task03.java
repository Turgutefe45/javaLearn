package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Girilen  gün sayısına karşılık gelen günün  adını print eden code create ediniz
        // 1.gün Pazartesi alınız

        Scanner oku = new Scanner(System.in);
        System.out.print("gunNo = ");
        int gunNo = oku.nextInt();

        switch (gunNo) {
            case 1:
                System.out.println("girilen gün pazartesi");
                break;
            case 2:
                System.out.println("girilen gün salı");
                break;
            case 3:
                System.out.println("girilen gün çarşamba");
                break;
            case 4:
                System.out.println("girilen gün perşembe");
                break;
            case 5:
                System.out.println("girilen gün cuma");
                break;
            case 6:
                System.out.println("girilen gün cumartesi");
                break;
            case 7:
                System.out.println("girilen gün pazar");

                break;
            default:
                System.out.println("adam gibi bir sayı gir");


        }
    }
}
