/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NganHang;

/**
 *
 * @author Dung
 */
public class KhachHang {
    protected String maKH;
    protected String tenKH;
    protected String diaChi;

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, String diaChi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
}
