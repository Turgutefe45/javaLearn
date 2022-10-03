package j10_StringManipulations;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :

        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */
        System.out.println("3 kelimelik isim giriniz");
        Scanner sc = new Scanner(System.in);
        String ucKelimelikIsim = sc.nextLine();

        int ilkBosluk = ucKelimelikIsim.indexOf(" ");
        int ikinciBosluk = ucKelimelikIsim.lastIndexOf(" ");

        String ilkBasHarf = ucKelimelikIsim.substring(0,1);
        String ikinciBasHarf = ucKelimelikIsim.substring(ilkBosluk+1 , ilkBosluk+2);
        String ucuncuBasHarf = ucKelimelikIsim.substring(ikinciBosluk+1 , ikinciBosluk+2);

        System.out.println(ilkBasHarf+"."+ikinciBasHarf+"."+ucuncuBasHarf);

    }
}
