package j10_StringManipulations;

public class C02_Length {
    public static void main(String[] args) {
        String str="madem geldin dünyaya otur çalış javaya";
        int karekterSay=str.length();
        System.out.println(str);
        System.out.println(karekterSay);
        System.out.println("str.length() = " + str.length());
        String str1="";
        System.out.println(str1.length());
        String str2=" ";
        System.out.println(str2.length());
        String str3=null;
        System.out.println(str3.length());

    }
}
