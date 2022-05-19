/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CanBo;

import java.util.Scanner;


public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String congViec, String hoTen, int namSinh, String gioiTinh, String diaChi, float heSoLuong) {
        super(hoTen, namSinh, gioiTinh, diaChi, heSoLuong);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap cong viec : ");
        congViec = sc.nextLine();
    }
    public String toString(){
        System.out.print(super.toString());
        return ", congviec="+congViec+'}';
    }
}
