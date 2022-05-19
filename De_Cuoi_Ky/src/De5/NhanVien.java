/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De5;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Dung
 */
public class NhanVien extends Person {

    private int maNhanVien;
    private float heSoLuong;
    private float donVi;

    public NhanVien() {
        super();
    }

    public NhanVien(int maNhanVien, float heSoLuong, float donVi, String hoTen, String gioiTinh, Date ngaySinh, String diaChi) {
        super(hoTen, gioiTinh, ngaySinh, diaChi);
        this.maNhanVien = maNhanVien;
        this.heSoLuong = heSoLuong;
        this.donVi = donVi;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public float getDonVi() {
        return donVi;
    }

    public void setDonVi(float donVi) {
        this.donVi = donVi;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        do {
            System.out.println("Nhap ma nhan vien: ");
            this.setMaNhanVien(sc.nextInt());
            if (maNhanVien < 0) {
                System.out.println("Ma khong hop le. Vui long nhap lai!");
            }
        } while (maNhanVien < 0);
        do {
            System.out.println("Nhap he so luong: ");
            this.setHeSoLuong(sc.nextFloat());
            if (heSoLuong < 0) {
                System.out.println("Ma khong hop le. Vui long nhap lai!");
            }
        } while (heSoLuong < 0);
        do {
            System.out.println("Nhap don vi: ");
            this.setDonVi(sc.nextInt());
            if (donVi < 0) {
                System.out.println("Ma khong hop le. Vui long nhap lai!");
            }
        } while (donVi < 0);
    }
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("\tMa nhan vien: "+this.getMaNhanVien()+"\tHe so luong: "+this.getHeSoLuong()+"\tDon vi: "+this.getDonVi());
    }
}
