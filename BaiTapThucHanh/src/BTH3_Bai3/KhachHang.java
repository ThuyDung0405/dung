/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTH3_Bai3;

import java.util.Scanner;

/**
 *
 * @author Dung
 */
public class KhachHang {
    private String hoTenChuNha;
    private String soNha;
    private int maSoCongTo;

    public KhachHang() {
    }

    public KhachHang(String hoTenChuNha, String soNha, int maSoCongTo) {
        this.hoTenChuNha = hoTenChuNha;
        this.soNha = soNha;
        this.maSoCongTo = maSoCongTo;
    }

    public String getHoTenChuNha() {
        return hoTenChuNha;
    }

    public void setHoTenChuNha(String hoTenChuNha) {
        this.hoTenChuNha = hoTenChuNha;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public int getMaSoCongTo() {
        return maSoCongTo;
    }

    public void setMaSoCongTo(int maSoCongTo) {
        this.maSoCongTo = maSoCongTo;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten chu nha: ");
        this.hoTenChuNha = sc.next();
        System.out.println("Nhap so nha: ");
        this.soNha = sc.next();
        System.out.println("Nhap ma so cong to: ");
        this.maSoCongTo = sc.nextInt();
        
    }

    @Override
    public String toString() {
        return "hoTenChuNha=" + hoTenChuNha + ", soNha=" + soNha + ", maSoCongTo=" + maSoCongTo;
    }
    
}
