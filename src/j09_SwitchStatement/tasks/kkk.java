package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class kkk {
    public static void main(String[] args) {
        /*
         * TASK :

         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapan code create ediniz.
         */
            Scanner sc = new Scanner(System.in);

            System.out.println("aldığınız ürün adedini giriniz : ");
            int urunAD = sc.nextInt();

            System.out.println("liste fiyatını girin : ");
            float listFyt = sc.nextFloat();

            System.out.println("kartınız varsa y yoksa n giriniz :");
            char card = sc.next().toLowerCase().charAt(0);

            if (card == 'y') {
                if (urunAD >= 10) {
                    System.out.println(listFyt * 0.80);
                } else
                    System.out.println(listFyt * 0.85);

            }
            if (card == 'n')
                if (urunAD >= 10) {
                    System.out.println(listFyt * 0.85);
                } else
                    System.out.println(listFyt * 0.90);

        }
    }
