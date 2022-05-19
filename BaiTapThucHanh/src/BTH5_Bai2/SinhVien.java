/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTH5_Bai2;

import java.util.Scanner;

/**
 *
 * @author Dung
 */
public class SinhVien extends Nguoi {
    private String maSV;
    private String tenLop;
    private float diem1,diem2,diem3;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenLop, float diem1, float diem2, float diem3, String hoTen, String diaChi, int namSinh) {
        super(hoTen, diaChi, namSinh);
        this.maSV = maSV;
        this.tenLop = tenLop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    public float tinhDiemTB(){
        return (diem1+diem2+diem3)/3;
    } 
    @Override
    public void nhapTT(){
        super.nhapTT();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma SV : ");
        maSV = sc.next();
        System.out.println("Nhap diem 1: ");
        diem1=sc.nextFloat();
        System.out.println("Nhap diem 2: ");
        diem2 = sc.nextFloat();
        System.out.println("Nhap diem 3 : ");
        diem3 = sc.nextFloat();
    }
    @Override
    public void inTT(){
        super.inTT();
        System.out.printf("Ma SV: "+maSV+"\tDiem 1: "+diem1+"\tDiem 2: "+diem2+"\tDiem 3: "+diem3);
    }
}
