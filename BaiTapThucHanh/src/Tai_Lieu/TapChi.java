
package Tai_Lieu;

import java.util.Scanner;

public class TapChi extends TaiLieu {
    private int soPH;
    private int thangPH;

    public TapChi() {
    }

    public TapChi(int soPH, int thangPH, String maTL, String tenNXB, int soBanPH) {
        super(maTL, tenNXB, soBanPH);
        this.soPH = soPH;
        this.thangPH = thangPH;
    }

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap so phat hanh : ");
        soPH = sc.nextInt();
        int n;
        do {
            System.out.print("Nhap thang phat hanh : ");
            n = sc.nextInt();
            if (n < 1 || n>12) {
                System.out.println("Thang khong hop le. Vui long nhap lai");
            }
        } while (n < 1 || n>12);
        this.setThangPH(n);
    }
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("So phat hanh : "+this.getSoPH()+"\t"+" Thang phat hanh : "+this.getThangPH());
    }
}
