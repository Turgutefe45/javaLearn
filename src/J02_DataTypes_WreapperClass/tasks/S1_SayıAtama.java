package J02_DataTypes_WreapperClass.tasks;

public class S1_SayıAtama {
    public static void main(String[] args) {




      /*  Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        code create edip print ediniz.
                a) 3. bir variable kulanarak
        b) 3. bir variable kullanmadan
​
        input	: sayi1=20 ve sayi2=34;
        output  :  sayi1=34 ve sayi2=20
       */
        int say1 = 20;
        int say2 = 34;
        int say3 ;



        say3=say1+say2;
        say1=say3-say1;
        say2=say3-say1;

        System.out.println(say1);
        System.out.println(say2);


    }
}
