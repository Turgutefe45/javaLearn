package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir hesabınız varmı  varsa 1  yoksa 0  işaretleyin");
        boolean hesap = scan.hasNext();
        System.out.println(hesap);


    }
}
