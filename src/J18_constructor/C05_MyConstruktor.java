package J18_constructor;
public class C05_MyConstruktor {
    static int x = 3;
    int y = 5;
    public C05_MyConstruktor() {
        x += 5;
        System.out.println("-x" + x + x);
    }
    public C05_MyConstruktor(int i, int i2) {
        this(3);
        y += 2;
        System.out.println("-x" + y + x);
    }
    public C05_MyConstruktor(int i) {
        this();
        this.y = i;
        y += y;
        System.out.println("-x" + x);
    }
    public static void main(String[] args) {
        C05_MyConstruktor mc1 = new C05_MyConstruktor(4, 3);


    }
}
