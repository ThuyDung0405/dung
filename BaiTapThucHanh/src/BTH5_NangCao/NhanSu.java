/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTH5_NangCao;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Dung
 */
public class NhanSu {
    String hoTen;
    int tuoi;
    int namSinh;
    String ngheNghiep;

    public NhanSu() {
    }

    public NhanSu(String hoTen, int tuoi, int namSinh, String ngheNghiep) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
        this.ngheNghiep = ngheNghiep;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        hoTen = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        namSinh = sc.nextInt();
        System.out.println("Nhap nghe nghiep :");
        ngheNghiep = sc.nextLine();
    }
    public int tinhTuoi(){
        LocalDate localDate = LocalDate.now();
        return localDate.getYear()-this.namSinh;
    }
}
