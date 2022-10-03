package J02_DataTypes_WreapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {
        String ad="turgyut" ;
        String Sad="efe";
        int a=7;
        int b=11;
        // Birden çok String variable ile farklı data type  variable'ler + ile işleme alınırsa
         // java birleştirme yaparak yeni bir String oluşturur

        System .out.println(ad+Sad+a+b);// turgut efe 7 11
        System.out.println(a+ad+Sad+b);// 7 turgut efe 11
        System.out.println(a+b+ad+Sad);// 18 turgut efe
        System.out.println(ad+Sad+(a+b));// turgut efe 18

    }
}
