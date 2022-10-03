package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
        // pazartesi hafta başlangıcı olarak alınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");
        int gunNo = scan.nextInt();
        switch (gunNo) {
            case 1:
                System.out.println("yüz gün sonra çarşamba");
                break;
            case 2:
                System.out.println("yüz gün sonra perşembe");
                break;
            case 3:
                System.out.println("yüz gün sonra cuma");
                break;
            case 4:
                System.out.println("yüz gün sonra  cumartesi");
                break;
            case 5:
                System.out.println("yüz gün sonra pazar");
                break;
            case 6:
                System.out.println("yüz gün sonra pazartesi");
                break;
            case 7:
                System.out.println("yüz gün sonra  salı");

                break;
            default:
                System.out.println("adam gibi bir sayı gir");


        }
    }
}

