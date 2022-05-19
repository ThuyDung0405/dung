package So_Phuc;

import java.util.Scanner;

public class SoPhuc {

    double phanThuc, pt;
    double phanAo, pa;

    public SoPhuc() {
    }

    public SoPhuc(float pt, float pa) {
        phanThuc = pt;
        phanAo = pa;
    }

    public void nhapSoPhuc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan thuc: ");
        pt = sc.nextDouble();
        phanThuc = pt;
        System.out.println("Nhap phan ao: ");
        pa = sc.nextDouble();
        phanAo = pa;
    }

    public void inSoPhuc() {
        System.out.println(this.phanThuc +"+"+ this.phanAo + "i");
    }

    SoPhuc congSoPhuc(SoPhuc sp) {
        SoPhuc SP1 = new SoPhuc();
        SP1.phanThuc = phanThuc +sp.phanThuc; 
        SP1.phanAo = phanAo + sp.phanAo;
        return SP1;
    }
    SoPhuc nhanSoPhuc(SoPhuc sp){
        SoPhuc SP2 = new SoPhuc();
        SP2.phanThuc = phanThuc*sp.phanThuc - phanAo*sp.phanAo;
        SP2.phanAo = phanAo*sp.phanThuc + phanThuc*sp.phanAo;
        return SP2;
    }
    
}
