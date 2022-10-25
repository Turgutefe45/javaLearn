package J18_constructor;

public class C03_Student {
    // fields
    String ad;
    String soyad;
    int sınıf;
    double ortalama;
    int okulNo;
    boolean taktir;
    public void mezuniyet(){
        if ( ortalama>=50){
            System.out.println("agam diploman hayırlı olsun");


        }else System.out.println("agam seneyede bekleriz");
    }

    @Override
    public String toString() {//obj refarans degeri print etmemesi ,ç,n obje datalarını
                              // Stringe çeviren metod
        return "C03_StudentRunner{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sınıf=" + sınıf +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", taktir=" + taktir +
                '}';
    }
}
