package J18_constructor;

public class C02_Arac {
    // fields ( özellikler)
    String marka;
    String model;
    int km=10;
    double motorHcm;
    boolean vitesOtm=false;
    boolean ikinciEl;
    int yıl;


    @Override
    public String toString() {
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHcm=" + motorHcm +
                ", vitesOtm=" + vitesOtm +
                ", ikinciEl=" + ikinciEl +
                ", yıl=" + yıl +
                '}';
    }

    public static void main(String[] args) {
        C02_Arac arac1=new C02_Arac();// default construktor ile araç1 obj create edildi
        arac1.ikinciEl=true;
        arac1.marka="volvo";
        arac1.km=50000;
        arac1.model="xc60";
        arac1.motorHcm=2.4;
        System.out.println(arac1.marka+" "+arac1.model+" "+arac1.km+" "+arac1.yıl+" "+arac1.ikinciEl);

        C02_Arac arac2=new C02_Arac();
        arac2.ikinciEl=false;
        arac2.marka="honda";
        arac2.model="accord";
        arac2.motorHcm=2.0;
        arac2.yıl=2022;
        System.out.println(arac2.marka+" "+arac2.model+" "+arac2.km+" "+arac2.motorHcm+" "+arac2.vitesOtm);
        System.out.println("araç2 ="+arac2);



    }
}
