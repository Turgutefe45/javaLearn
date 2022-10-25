package j15_Arrays.odev;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
        String str = "hello world";
        String str1[] = str.split("");
        for (int i =str1.length-1 ; i >=0; i--) {
            System.out.print(str1[i]);
            
        }
        


    }
}