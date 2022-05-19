/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De7byTai;

import java.util.Scanner;

public abstract class thisinh {

    public String hoten;
    public String ngaysinh;
    public String diachi;

    public void Nhap() {
        Scanner nhapsc = new Scanner(System.in);
        System.out.println("Nhập tên thí sinh: ");
        hoten = nhapsc.next();
        System.out.println("Nhập địa chỉ thí sinh: ");
        diachi = nhapsc.next();
        System.out.println("Nhập ngày sinh thí sinh: ");
        ngaysinh = nhapsc.next();
    }

    public void Xuat() {
        System.out.println("Tên: " + hoten + " Tuổi: " + ngaysinh + " Địa chỉ: " + diachi);
    }

    public abstract void kiemtra();
}
