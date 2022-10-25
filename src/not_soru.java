import java.util.Scanner;

public class not_soru {
    public static void main(String[] args) {
        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("kaç öğrenciniz var hocam: ");
        int mevcut=scanner.nextInt();
        int toplam=0;
        int snfArr[]=new int[mevcut];
        for (int i = 0; i < mevcut; i++) {
            System.out.println(i+1+" . öğrencinizin notunu giriniz: ");
            snfArr[i]=scanner.nextInt();
            toplam+=snfArr[i];
        }
        int ortalama=toplam/mevcut;
        int ortalamagecen=0;
        for (int i = 0; i < mevcut; i++) {
            if(snfArr[i]>ortalama){
                ortalamagecen++;
            }

        } System.out.println("sınıf ortalaması: "+ortalama+"\nortalamayı geçen öğrenci sayısı : "+ortalamagecen);
    }
}
