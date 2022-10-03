package j10_StringManipulations;

public class C01_Concatenation {
    public static void main(String[] args) {
        String name="Nur";
        String meslek ="Qa tester";
        System.out.println( name.concat(meslek));// NurQa tester
        System.out.println(name);//Nur
        name =meslek.concat(name);//
        System.out.println("name ="+name);//Qa testerNur
        System.out.println(name.concat(100+":) "));//Qa testerNur100

    }
}
