/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De5;

/**
 *
 * @author arohigh
 */
public class SinhVien {

    protected String MaSV;
    protected String HoTen;
    protected String NgaySinh;
    protected String GioiTinh;
    protected Float DTB;

    public SinhVien(String masv, String hoten, String ngaysinh, String gioitinh, Float dtb) {       //phuong thuc khoi tao
        this.MaSV = masv;
        this.HoTen = hoten;
        this.NgaySinh = ngaysinh;
        this.GioiTinh = gioitinh;
        this.DTB = dtb;
    }

    public void HienThi() {
        System.out.println("----------------------------------------------------");
        System.out.println("Ma SV: " + this.MaSV);
        System.out.println("Ho ten: " + this.HoTen);
        System.out.println("Ngay sinh: " + this.NgaySinh);
        System.out.println("Gioi tinh: " + this.GioiTinh);
        System.out.println("Diem TB: " + this.DTB);
    }
}
