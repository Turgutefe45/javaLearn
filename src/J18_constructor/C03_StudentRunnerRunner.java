package J18_constructor;

public class C03_StudentRunnerRunner {
    public static void main(String[] args) {
        C03_Student ogrenci1=new C03_Student();
        ogrenci1.ad="fatih";
        ogrenci1.soyad="Ataş";
        ogrenci1.sınıf=1;
        ogrenci1.ortalama=77;
        ogrenci1.taktir=false;
        System.out.println("öğrenci1 = "+ ogrenci1);
        ogrenci1.mezuniyet();

    }
}
