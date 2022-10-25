package j15_Arrays.odev;

import java.util.Arrays;
import java.util.Scanner;

public class _12_Array_no14 {

    public static void main(String[] args) {

        /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmal
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("kaç boyutlu array istiyorsunuz : ");
        int arr[]=new int[scan.nextInt()];
        boolean varmı=true;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+ " . index sayıyı giriniz");
            arr[i]=scan.nextInt();
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == 1 && arr[j]==4 || arr[i]==4 && arr[j]==1){
                    varmı=false;
                }
            }
            }
        System.out.println("varmı = " + varmı);

        }
}
