/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Dung
 */
public class ThiSinh {

    protected String hoTen;
    protected Date ngaySinh;
    protected String diaChi;

    public ThiSinh() {
    }

    public ThiSinh(String hoTen, Date ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        this.setHoTen(sc.nextLine());
        System.out.println("Nhap ngay sinh: ");
        try {
            this.setNgaySinh(new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine()));

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Nhap dia chi: ");
        this.setDiaChi(sc.nextLine());
    }
    public boolean check(){
        return false;
    }
    public void in(){
        System.out.print("Ho ten: "+this.getHoTen()+"\tNgay sinh: "+this.getNgaySinh()+"\tDia chi: "+this.getDiaChi());
    }
}
