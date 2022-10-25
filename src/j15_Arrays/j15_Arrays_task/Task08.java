package j15_Arrays.j15_Arrays_task;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
            Scanner scan= new Scanner(System.in);
        System.out.println("agam kaç elemanlı erray istersen: ");
        int arreyBoyut = scan.nextInt();
        int arr[] = new int[arreyBoyut]; // boyutu belirlenmiş boş bir int arry

        for (int i = 0; i <arreyBoyut ; i++) {
            System.out.println(i + "indeks elemanı giriniz");
            arr[i]=scan.nextInt();


        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 1){

                Arrays.toString(arr);
                System.out.print(arr[i] + " ");

            }



        }

    }
}
