package BTH3.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class TheMuon extends SinhVien {

    private int soPhieuMuon;
    private String ngayMuon;
    private String hanTra;
    private String soHieuSach;

    public TheMuon() {
    }

    public TheMuon(int soPhieuMuon, String ngayMuon, String hanTra, String soHieuSach, String hoTen, int namSinh, int tuoi, String lop) {
        super(hoTen, namSinh, tuoi, lop);
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
    }

    public int getSoPhieuMuon() {
        return soPhieuMuon;
    }

    public void setSoPhieuMuon(int soPhieuMuon) {
        this.soPhieuMuon = soPhieuMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getHanTra() {
        return hanTra;
    }

    public void setHanTra(String hanTra) {
        this.hanTra = hanTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    public void nhapTM() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phieu muon: ");
        this.soPhieuMuon = sc.nextInt();
        System.out.println("Nhap ngay muon: ");
        this.ngayMuon = sc.next();
        System.out.println("Nhap ngay hen tra: ");
        this.hanTra = sc.next();
        System.out.println("Nhap so hieu sach: ");
        this.soHieuSach = sc.next();
    }

    @Override
    public String toString() {
        return "TheMuon" +super.toString()+ "soPhieuMuon=" + soPhieuMuon + ", ngayMuon=" + ngayMuon + ", hanTra=" + hanTra + ", soHieuSach=" + soHieuSach ;
    }

   
}
