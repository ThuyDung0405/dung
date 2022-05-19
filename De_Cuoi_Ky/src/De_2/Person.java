/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De_2;

/**
 *
 * @author Dung
 */
public class Person {
    protected String hoTen;
    protected String ngaySinh;
    protected String gioiTinh;
    protected String diaChi;

    public Person() {
    }

    public Person(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
    public void hienThi(){
        System.out.println("Ho ten : "+this.hoTen);
        System.out.println("Ngay sinh : "+this.ngaySinh);
        System.out.println("Gioi tinh : "+this.gioiTinh);
        System.out.println("Dia chi : "+this.diaChi);
    }
}
