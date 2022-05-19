package BTH3.Bai2;

import java.util.Scanner;

public class SinhVien {

    public String hoTen;
    public int namSinh;
    public int tuoi;
    public String lop;

    public SinhVien() {
    }

    public SinhVien(String hoTen, int namSinh, int tuoi, String lop) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten SV: ");
        this.hoTen = sc.next();
        System.out.println("Nhap nam sinh: ");
        this.namSinh = sc.nextInt();
        System.out.println("Nhap tuoi: ");
        this.tuoi = sc.nextInt();
        System.out.println("Nhap lop: ");
        this.lop = sc.next();
    }

    @Override
    public String toString() {
        return "SinhVien " + "hoTen=" + hoTen + ", namSinh=" + namSinh + ", tuoi=" + tuoi + ", lop=" + lop ;
    }

    
}
