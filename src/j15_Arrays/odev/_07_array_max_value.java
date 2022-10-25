package j15_Arrays.odev;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */
      //  int maxValue= 0;
        int arr[]={12,2,5,15,25,56,14,13,7,87 };
        int maxValue=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxValue){
                maxValue=arr[i];
            }
           // System.out.println("maxValue = " + maxValue);

        }
        System.out.println("maxValue = " + maxValue);


    }
}

