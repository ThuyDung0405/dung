/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De_1;

/**
 *
 * @author Dung
 */
public class Person_De_1 {
    protected String hoTen;
    protected String ngaySinh;
    protected String diaChi;
    protected String gioiTinh;

    public Person_De_1() {
    }

    public Person_De_1(String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public void display(){
        System.out.println("Ho ten : "+this.hoTen);
        System.out.println("Ngay sinh : "+this.ngaySinh);
        System.out.println("Dia chi : "+this.diaChi);
        System.out.println("Gioi tinh : "+this.gioiTinh);
    }
}
