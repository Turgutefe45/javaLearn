package day10;

public class C6_ZarSorusu {
    public static void main(String[] args) {
         /*
Iki tane atilan zarin toplamlarinin 9 olmasi durumanda "Kazandiniz" yazisini yazdirin,
 aksi takdirde "Tekrar deneyiniz" yazisi yazmali

 */
        int min =1;
        int max =6;

        int zar1 = (int) (Math.random()*((max-min)+1)) +min;
        int zar2 = (int) (Math.random()*((max-min)+1)) +min;
        System.out.println("zar1 = " + zar1);
        System.out.println("zar2 = " + zar2);
        int toplam =  zar1+ zar2;

        if(toplam ==9){
            System.out.println("kazandiniz");
        }else System.out.println("tekrar deneyiniz");
        // ikinci yol
        int zar3=(int)(Math.random()*((6 - 1) + 1) + 1);
        int zar4=(int)(Math.random()*((6 - 1) + 1) + 1);
        System.out.println((zar1 + zar2 == 9) ? "Kazandınız" : "Tekrar deneyiniz");
    }
}
