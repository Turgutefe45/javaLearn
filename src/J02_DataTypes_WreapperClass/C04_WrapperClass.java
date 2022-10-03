package J02_DataTypes_WreapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {

        String name ="turgut";
        int yas=45;

        System.out.println(name.toUpperCase());
        String tc ="1234455"  ;
        String ıd = "98765";

        int yenitc= Integer.valueOf(tc);
        int yeniıd=Integer.valueOf(ıd);
        System.out.println("yenitc = " + yenitc);
        System.out.println("yeniıd = " + yeniıd);
        System.out.println(yeniıd+yenitc);
        System.out.printf( "madem geldin dünyaya otur çalış Javaya");

      //  TASK-> byte short int maximum ve minimum değerlerini print eden code yazınız

        byte maxByteDegeri = Byte.MAX_VALUE;
        byte minByteDegeri = Byte.MIN_VALUE;
        System.out.println("maxByteDegeri = " + maxByteDegeri);
        System.out.println("minByteDegeri = " + minByteDegeri);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

    }


    }




