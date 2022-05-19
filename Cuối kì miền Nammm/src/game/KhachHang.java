/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import static game.SanPham.spList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoaianh_Kyros
 */
public class KhachHang {
    static ArrayList<KhachHang> khList = new ArrayList<>();
    private String maKH;
    private String tenKH;
    private int namSinh;
    private String to, phuong, quan, thanhPho;

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, int namSinh, String to, String phuong, String quan, String thanhPho) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.namSinh = namSinh;
        this.to = to;
        this.phuong = phuong;
        this.quan = quan;
        this.thanhPho = thanhPho;
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

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getPhuong() {
        return phuong;
    }

    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }
    
    public boolean checkMaKH(String str)
    {
        for(KhachHang x: khList)
        {
            if(x.getMaKH().equalsIgnoreCase(str))
                return false;
        }
        return true;
    }
    public void themKh()
    {
        System.out.println("\t---Nhap thong tin khach hang---");
        Scanner sc = new Scanner(System.in);
        do {      
            System.out.print("Nhap ma KH: ");
            this.maKH = sc.nextLine();
            if(!this.checkMaKH(this.getMaKH()))
                System.out.println("Ma khach hang da ton tai. Vui long nhap lai");
        } while (!this.checkMaKH(this.getMaKH()));
        System.out.print("Nhap ten KH: ");
        this.tenKH = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        this.namSinh = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap to: ");
        this.to = sc.nextLine();
        System.out.print("Nhap phuong: ");
        this.phuong = sc.nextLine();
        System.out.print("Nhap quan: ");
        this.quan = sc.nextLine();
        System.out.print("Nhap thanh pho: ");
        this.thanhPho = sc.nextLine();
        khList.add(this);
        System.out.println("Them khach hang thanh cong");
    }
    
    public void hienThi()
    {
        System.out.print("MaKH: " + this.getMaKH() + "; TenKH: " + this.getTenKH()
        + "; Nam sinh: " + this.getNamSinh() + "; Dia chi: "
        + this.getTo() + ", " + this.getPhuong() + ", " + this.getQuan() 
        + ", " + this.getThanhPho());
    }
}
