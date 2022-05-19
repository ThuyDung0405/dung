/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTH5_Bai1;

import java.util.Scanner;

/**
 *
 * @author Dung
 */
public class NhanSu extends Nguoi {

    private String maNhanSu;
    private float heSoChucVu;
    private float heSoLuong;

    static int luongCoBan;

    public NhanSu() {
    }

    public void nhapTTNhanSu() {
        Scanner sc = new Scanner(System.in);
        super.nhapTT();
        System.out.println("Nhap ma nhan su : ");
        maNhanSu = sc.next();
        System.out.println("Nhap he so chuc vu : ");
        heSoChucVu = sc.nextFloat();
        System.out.println("Nhap he so luong : ");
        heSoLuong = sc.nextFloat();

    }

    static void setLuongCoBan(int lcb) {
        luongCoBan = lcb;
    }
//  lương=(heSoLuong+heSoChucVu)*luongCoBan-heSoLuong*luongCoBan*5%
    public double tinhLuong() {
        return (heSoLuong + heSoChucVu)*luongCoBan-(heSoLuong*luongCoBan*0.05);
    }
@Override
    public String toString() {
        return "Nhan Su : " + super.toString() + " maNhanSu = " + maNhanSu + ", heSoChucVu = " + heSoChucVu + ", heSoLuong = " + heSoLuong+"luong = "+tinhLuong();
    }
}
