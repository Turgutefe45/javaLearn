package j15_Arrays.odev;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */
        // int minumumsay = 100

       int arr[]={14,13,19,5,35,2};
        int  minumumsay=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<minumumsay){
                minumumsay=arr[i];
            }
          //  System.out.println("minumumsay = " + minumumsay);

        }
        System.out.println("minumumsay = " + minumumsay);


    }
}

