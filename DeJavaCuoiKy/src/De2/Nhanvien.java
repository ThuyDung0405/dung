/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De2;

import java.util.ArrayList;

/**
 *
 * @author arohigh
 */
public class Nhanvien extends Person {

    private String PhongBan;
    private Float HeSoLuong;
    private int ThamNien;
    private Float LuongCoBan;

    public String getPhongBan() {
        return PhongBan;
    }

    public void setPhongBan(String PhongBan) {
        this.PhongBan = PhongBan;
    }

    public Float getHeSoLuong() {
        return HeSoLuong;
    }

    public void setHeSoLuong(Float HeSoLuong) {
        this.HeSoLuong = HeSoLuong;
    }

    public int getThamNien() {
        return ThamNien;
    }

    public void setThamNien(int ThamNien) {
        this.ThamNien = ThamNien;
    }

    public Float getLuongCoBan() {
        return LuongCoBan;
    }

    public void setLuongCoBan(Float LuongCoBan) {
        this.LuongCoBan = LuongCoBan;
    }

    public Nhanvien(String HoTen, String NgaySinh, String DiaChi, String GioiTinh,
            String PhongBan, Float HeSoLuong, int ThamNien, Float LuongCoBan) {
        super(HoTen, NgaySinh, DiaChi, GioiTinh);
        this.setPhongBan(PhongBan);
        this.setHeSoLuong(HeSoLuong);
        this.setThamNien(ThamNien);
        this.setLuongCoBan(LuongCoBan);
    }

    public void HienThi() {
        super.HienThi();
        System.out.println("Phong ban: " + this.getPhongBan());
        System.out.println("He so luong: " + this.getHeSoLuong());
        System.out.println("Tham nien: " + this.getThamNien());
        System.out.println("Luong co ban: " + this.getLuongCoBan());
        System.out.println("Luong thuc linh = " + String.format("%.2f", this.LuongThucLinh()));
    }

    public Float LuongThucLinh() {
        return this.getLuongCoBan() * this.getHeSoLuong() * (1 + this.getThamNien() / 100.0f);
    }
//    ArrayList<Object>
    // vector
}
