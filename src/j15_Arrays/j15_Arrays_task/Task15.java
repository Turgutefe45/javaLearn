package j15_Arrays.j15_Arrays_task;

public class Task15 {
    public static void main(String[] args) {
        // task ->arr tum elemanlarını toplayan code create ediniz->137
        int apt[][] = {
                {1, 2, 3}, //0. kat
                {10, 20}, //1. kat
                {101}//2. kat
        };//3 katlı apt

        int toplam=0;

        for (int kat = 0; kat < apt.length; kat++) {

            for (int daire = 0; daire < apt[kat].length; daire++) {

                toplam +=apt[kat][daire];
            }
        }
        System.out.println("arr deki tum elemalar toplamı : "+toplam);// 137

    }
    }

