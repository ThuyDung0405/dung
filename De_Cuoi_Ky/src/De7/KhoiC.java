/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De7;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Dung
 */
public class KhoiC extends ThiSinh {

    private float diemVan;
    private float diemSu;
    private float diemDia;

    public KhoiC() {
    }

    public KhoiC(float diemVan, float diemSu, float diemDia, String hoTen, Date ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.diemVan = diemVan;
        this.diemSu = diemSu;
        this.diemDia = diemDia;
    }

    public float getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(float diemVan) {
        this.diemVan = diemVan;
    }

    public float getDiemSu() {
        return diemSu;
    }

    public void setDiemSu(float diemSu) {
        this.diemSu = diemSu;
    }

    public float getDiemDia() {
        return diemDia;
    }

    public void setDiemDia(float diemDia) {
        this.diemDia = diemDia;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        do {
            System.out.println("Nhap diem van: ");
            this.setDiemVan(sc.nextFloat());
            if (diemVan < 0 || diemVan > 10) {
                System.out.println("Diem khong hop le. Vui long nhap lai!");
            }
        } while (diemVan < 0 || diemVan > 10);
        do {
            System.out.println("Nhap diem su: ");
            this.setDiemSu(sc.nextFloat());
            if (diemSu < 0 || diemSu > 10) {
                System.out.println("Diem khong hop le. Vui long nhap lai!");
            }
        } while (diemSu < 0 || diemSu > 10);
        do {
            System.out.println("Nhap diem su: ");
            this.setDiemDia(sc.nextFloat());
            if (diemDia < 0 || diemDia > 10) {
                System.out.println("Diem khong hop le. Vui long nhap lai!");
            }
        } while (diemDia < 0 || diemDia > 10);

    }

    @Override
    public boolean check() {
        if (this.getDiemDia() + this.getDiemSu() + this.getDiemVan() > 20) {
            return true;
        }
        return false;
    }

    @Override
    public void in() {
        super.in();
        System.out.println("\tDiem van: " + this.getDiemVan() + "\tDiem su: " + this.getDiemSu() + "\tDiem dia: " + this.getDiemDia());
    }
}
