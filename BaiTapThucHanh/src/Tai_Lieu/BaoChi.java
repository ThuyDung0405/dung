
package Tai_Lieu;

import java.util.Scanner;

public class BaoChi extends TaiLieu{
    private String ngayPH;

    public BaoChi() {
    }

    public BaoChi(String ngayPH, String maTL, String tenNXB, int soBanPH) {
        super(maTL, tenNXB, soBanPH);
        this.ngayPH = ngayPH;
    }

    public String getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(String ngayPH) {
        this.ngayPH = ngayPH;
    }
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap ngay phat hanh (dd/MM/yyyy) : ");
        ngayPH = sc.nextLine();
        
    }
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("Ngay phat hanh : "+this.getNgayPH());
    }
}
