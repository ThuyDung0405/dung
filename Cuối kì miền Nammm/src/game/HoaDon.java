/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import static game.KhachHang.khList;
import static game.SanPham.spList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import sun.net.www.content.audio.x_aiff;

/**
 *
 * @author hoaianh_Kyros
 */
public class HoaDon {

    static ArrayList<HoaDon> hdList = new ArrayList<>();
    private String maKH;
    private String maSP;
    private int soLuong;
    private float thanhTien;

    public HoaDon() {
    }

    public HoaDon(String maKH, String maSP, int soLuong) {
        this.maKH = maKH;
        this.maSP = maSP;
        this.soLuong = soLuong;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public boolean checkMaKH(String str) {
        for (KhachHang x : KhachHang.khList) {
            if (x.getMaKH().equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }

    public boolean checkMaSP(String str) {
        for (SanPham x : SanPham.spList) {
            if (x.getMaSP().equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap ma KH: ");
            this.maKH = sc.nextLine();
            if (this.checkMaKH(this.getMaKH())) {
                System.out.println("Ma KH khong ton tai. Vui long nhap lai");
            }
        } while (this.checkMaKH(this.getMaKH()));
        do {
            System.out.print("Nhap ma SP: ");
            this.maSP = sc.nextLine();
            if (this.checkMaSP(this.getMaSP())) {
                System.out.println("Ma KH khong ton tai. Vui long nhap lai");
            }
        } while (this.checkMaSP(this.getMaSP()));
        if(SanPham.soLuongTonHang(this.maSP) > 0)
        {
        int soLuong;
        do {
            System.out.print("Nhap so luong mua: ");
            soLuong = sc.nextInt();
            if (soLuong > SanPham.soLuongTonHang(this.maSP)) {
                System.out.println("So luong sp khong du. Vui long nhap lai");
            }
        } while (soLuong > SanPham.soLuongTonHang(this.maSP));

            float tien = 0;
            int result = 0;
            for (SanPham x : SanPham.spList) {
                if (x.getMaSP().equalsIgnoreCase(this.getMaSP())) {
                    tien = soLuong * x.getDonGia();
                    x.setSoLuong(x.getSoLuong() - soLuong);
                }
            }
            for (HoaDon x : hdList) {
                if (x.getMaKH().equalsIgnoreCase(this.maKH) && x.getMaSP().equalsIgnoreCase(this.maSP)) {
                    x.setSoLuong(x.getSoLuong() + soLuong);
                    result = 1;
                }
            }
            for (TongTienKH x : TongTienKH.vipList) 
            {
                if (x.getMaKH().equalsIgnoreCase(this.maKH)) {

                    x.setTongTien(x.getTongTien() + tien);
                    result = 1;
                }
            }
            if (result == 0) 
            {
                this.soLuong = soLuong;
                hdList.add(this);
                TongTienKH.vipList.add(new TongTienKH(this.maKH, this.tinhTien()));
            }
            System.out.println("\t---Da mua san pham thanh cong---");
        }
        else
        {
            System.out.println("\t--HET HANG--");
        }

    }

    public float tinhTien() {
        for (SanPham x : SanPham.spList) {
            if (x.getMaSP().equalsIgnoreCase(this.getMaSP())) {
                this.thanhTien = this.getSoLuong() * x.getDonGia();
            }
        }
        return this.thanhTien;
    }

    public void hienthi() {
        System.out.print("MaKH: " + this.getMaKH() + ", MaSP: " + this.getMaSP()
                + ", So luong: " + this.getSoLuong() + ", Thanh Tien: " + this.tinhTien());
    }

    public static void hienThiHD() {
        System.out.println("\t----HOADON----");
        for (HoaDon x : hdList) {
            x.hienthi();
            System.out.println("");
        }
    }

}
