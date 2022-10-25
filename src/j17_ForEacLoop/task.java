package j17_ForEacLoop;

import java.util.ArrayList;
import java.util.List;

public class task {
    public static void main(String[] args) {
        // task array elamanlarının çarpımını print eden code create ediniz...-> with for-each

        int arr[][] = {{2, 3}, {4}, {5, 6, 7}};


        int crpm = 1;
        for (int kc[] : arr) {
            for (int a:kc){
                crpm*=a;
            }
        }
        System.out.println("crpm = " + crpm);//crpm = 5040
        // task-> iki string array eleamanlarının ortak olmasını kontrol eden code create ediniz..with for-each
        String arr1[] = {"nazım", "gülsüm", "dilek", "erol", "cüneyt", "ciğdem"};
        String arr2[] = {"musty", "gülsüm", "ayşe", "enise", "cüneyt", "ciğdem"};
        List<String > ortakIsim=new ArrayList<>();//ortak ısımlerin atanacagı boş list
        for (String str1:arr1){
            for (String str2:arr2){
                if (str2.equalsIgnoreCase(str1)){//her bir çekirdek eşitliği kontrol
                    ortakIsim.add(str2);
                }
            }
        }
        if (ortakIsim.isEmpty()){//ortak isim list boşluk kontrol
            System.out.println("ararylerinizde ortak isim yok "+ortakIsim);
        }else System.out.println(ortakIsim);


    }
}
