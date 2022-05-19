/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De_3;

import java.io.Serializable;

public class NhanVien extends Person implements Serializable{
    private String phongBan;
    private float heSoLuong;
    private int thamNien;
    private float luongCB;

    public NhanVien() {
    }

    public NhanVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String phongBan, float heSoLuong, int thamNien, float luongCB) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCB = luongCB;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public float getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(float luongCB) {
        this.luongCB = luongCB;
    }
    
    public float luongThucLinh(){
        return this.getLuongCB()*this.getHeSoLuong()*(1+this.getThamNien()/100);
    }
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("Phong ban : "+phongBan);
        System.out.println("He so luong : "+heSoLuong);
        System.out.println("Tham nien : "+thamNien);
        System.out.println("Luong co ban : "+luongCB);
    }
    public Object[] toObject(){
        return new Object[]{
            hoTen,ngaySinh,gioiTinh,diaChi,phongBan,heSoLuong,thamNien,luongCB,luongThucLinh()
        };
    }
}
