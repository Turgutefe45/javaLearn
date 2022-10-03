package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task_SeyahatProjesi {

    public static void main(String[] args) {

        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
 İşlemlerde direkt bunları cağırabilirsiniz.

        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.
      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.



       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.


         */
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("***** seyahat şirketimize hos geldiniz *****");
        System.out.println("Frankfurt : 60 km \nKoln : 80\n 20 Km basına 5 euro ucretlendirme yapılır :) ");
        System.out.print("yolculuk yapacagınız sehri seciniz : ");
        String hedef = scan.next().toUpperCase();//sehir buyuk harfe update edildi
        */


        Scanner scan = new Scanner(System.in);
        System.out.println("***** Türk Haluk Yollarına Hos Geldiniz *****");
        System.out.println("Frankfurt : 60 Km \nKöln : 80 Km \n20 Km başına 5 € ücretlendirme yapılır :) ");
        System.out.print("Lütfen yolculuk yapacağınız şehri seçiniz : ");
        String hedef = scan.next().toUpperCase();//Şehir ismi büyük harfe update edildi

        double toplamTutar;
        int frankfurtKm = 60;
        int kölnKm = 80;
        double kmBirimFiyat = 0.25;
        String yolculukFrankfurt;
        String yolculukKöln;
        int Ödeme = 100;
        double paraUstu;

        switch (hedef) {

            case "FRANKFURT":
                System.out.println("Rotanız = Frankfurt");
                toplamTutar = frankfurtKm * kmBirimFiyat;
                System.out.println("Tek kişilik Frankfurt yolculuğu " + toplamTutar + " € tutmaktadır.");
                System.out.println("Kaç kişilik bilet istiyorsunuz. (Max 2 kişilik olabilir.)");
                int biletSayi = scan.nextInt();

                switch (biletSayi) {

                    case 1:

                        System.out.println("Bir Kişilik Bilet Talep Edilmiştir.");
                        System.out.println("Rotanız = Frankfurt");
                        System.out.println("Yaptığınız Ödeme = " + Ödeme + " €");
                        System.out.println("Toplam Tutar = " + toplamTutar + " €");
                        paraUstu = Ödeme - toplamTutar;
                        System.out.println("Para Üstünüz = " + paraUstu + " €");
                        System.out.println("Haluk Hoca İyi Yolculuklar Diler!!");

                        break;

                    case 2:

                        System.out.println("İki Kişilik Bilet Talep Edilmiştir");
                        System.out.println("Rotanız = Frankfurt");
                        System.out.println("Yaptığınız Ödeme = " + Ödeme + " €");
                        System.out.println("Toplam Tutar = " + toplamTutar * 2 + " €");
                        paraUstu = (Ödeme - toplamTutar * 2);
                        System.out.println("Para üstünüz = " + paraUstu + " €");
                        System.out.println("Haluk Hoca İyi Yolculuklar Diler!!");

                        break;

                    default:
                        System.out.println("Yanlış seçim yaptınız. Yalnızca çift ve tek kişilik bilet hizmetimiz vardır.");

                }
                break;

            case "KÖLN":
                System.out.println("Rota = Köln");
                toplamTutar = kölnKm * kmBirimFiyat;
                System.out.println("Tek kişilik Köln yolculuğu " + toplamTutar + " € tutmaktadır.");
                System.out.println("Kaç kişilik bilet istiyorsunuz. (Max 2 kişilik olabilir.)");
                int biletSayiKöln = scan.nextInt();

                switch (biletSayiKöln) {

                    case 1:

                        System.out.println("Bir Kişilik Bilet Talep Edilmiştir");
                        System.out.println("Rotanız = Köln");
                        System.out.println("Yaptığınız Ödeme = " + Ödeme + " €");
                        System.out.println("Toplam Tutar = " + toplamTutar + " €");
                        paraUstu = Ödeme - toplamTutar;
                        System.out.println("Para üstünüz = " + paraUstu + " €");
                        System.out.println("Haluk Hoca İyi Yolculuklar Diler!!");

                        break;

                    case 2:

                        System.out.println("İki Kişilik Bilet Talep Edilmiştir");
                        System.out.println("Rotanız Köln");
                        System.out.println("Yaptığınız Ödeme = " + Ödeme + " €");
                        System.out.println("Toplam Tutar = " + toplamTutar * 2);
                        paraUstu = (Ödeme - toplamTutar * 2);
                        System.out.println("Para üstünüz = " + paraUstu + " €");
                        System.out.println("Haluk Hoca İyi Yolculuklar Diler!!");

                        break;

                    default:
                        System.out.println("Yanlış seçim yaptınız. Yalnızca çift ve tek kişilik bilet hizmetimiz varıdr");

                }
                break;
            default:
                System.out.println("Haluk Hoca diyor ki = Yalnızca bu iki şehre seyahat edebilirsin agam.");

        }
    }
}