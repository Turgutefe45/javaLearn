package j15_Arrays.odev;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */
        int toplam=0;
        int arr[]={12, 14 , 21 ,23 , 10 ,4};
        for (int i = 0; i < arr.length; i++){
            toplam+=arr[i];
         //  int ortalama=(toplam/arr.length);
          //  System.out.println("ortalama = " + ortalama);
        }
        System.out.println("toplam = " + toplam);
        int ortalama=(toplam/arr.length);
        System.out.println("ortalama = " + ortalama);


    }
}