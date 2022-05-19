
package BTH5_Bai1;

public class Main {
    public static void main(String[] args) {
        Nguoi p1 = new Nguoi();
        Nguoi p2 = new Nguoi();
        NhanSu n1 = new NhanSu();
        NhanSu n2 = new NhanSu();
        p1.nhapTT();
        System.out.println("==================================================");
        System.out.println(p1.toString());
        p2.nhapTT();
        System.out.println("==================================================");
        System.out.println(p2.toString());
        n1.nhapTTNhanSu();
        System.out.println("==================================================");
        System.out.println(n1.toString());
        n2.nhapTTNhanSu();
        System.out.println("==================================================");
        System.out.println(n2.toString());
        
    }
}
