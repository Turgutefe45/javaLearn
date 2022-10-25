package j15_Arrays.odev;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
         elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
          -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */
        int arr[] = {5, 6, 8, 12, 14, 19};// arrry nasıl yazdırılır..?
        System.out.println(arr);
        int top = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1){top-=arr[i];

            } else top += arr[i];
        } System.out.println(top);

    }



    }

