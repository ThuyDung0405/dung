/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De3;

/**
 *
 * @author arohigh
 */
public class Person {

    protected String HoTen;
    protected String NgaySinh;
    protected String DiaChi;
    protected String GioiTinh;

    public Person(String HoTen, String NgaySinh, String DiaChi, String GioiTinh) {
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
    }

    public void HienThi() {
        System.out.println("--------------------------------------");
        System.out.println("Ho ten: " + this.HoTen);
        System.out.println("Ngay sinh: " + this.NgaySinh);
        System.out.println("Dia chi: " + this.DiaChi);
        System.out.println("Gioi tinh: " + this.GioiTinh);
    }

}
