package Tai_Lieu;

import java.util.Scanner;

public class Sach extends TaiLieu{
    private String tenTG;
    private int soTrang;

    public Sach() {
    }

    public Sach(String tenTG, int soTrang, String maTL, String tenNXB, int soBanPH) {
        super(maTL, tenNXB, soBanPH);
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap ten tac gia : ");
        tenTG = sc.nextLine();
        int n;
        do {
            System.out.print("Nhap so trang : ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("So trang phai > 0. Vui long nhap lai");
            }
        } while (n <= 0);
        this.setSoTrang(n);
    }
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("Ten tac gia : "+this.getTenTG()+"\t"+" So trang : "+this.getSoTrang());
    }
}
