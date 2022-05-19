/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author hoaianh_Kyros
 */
public class SanPham {
    static ArrayList<SanPham> spList = new ArrayList<>();
    private String maSP;
    private String tenSP;
    private int soLuong;
    private float donGia;
    private String ngaySX;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, int soLuong, float donGia, String ngaySX) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.ngaySX = ngaySX;
    }


    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public String getNgaySX() {
        return ngaySX;
    }

    
    public void setNgaySX(String ngaySX) {
        this.ngaySX = ngaySX;
    }

    public static ArrayList<SanPham> getSpList() {
        return spList;
    }

    public static void setSpList(ArrayList<SanPham> spList) {
        SanPham.spList = spList;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
    
    public boolean checkMaSP(String str)
    {
        for(SanPham x: spList)
        {
            if(x.getMaSP().equalsIgnoreCase(str))
                return false;
        }
        return true;
    }
    
    public static int soLuongTonHang(String str)
    {
        int sluong = 0;
        for(SanPham x:spList)
        {
            if(x.getMaSP().equalsIgnoreCase(str))
                sluong =  x.getSoLuong();
        }
        return sluong;
    }
    public  void nhap()
    {
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhap ma sp: ");
                this.maSP = sc.nextLine();
                if(!this.checkMaSP(this.getMaSP()))
                {
                    System.out.print("Nhap so luong ve: ");
                    int soLuong = sc.nextInt();
                    for(SanPham x:spList)
                    {
                        if(x.getMaSP().equalsIgnoreCase(this.getMaSP()))
                        {
                            x.setSoLuong(x.getSoLuong() + soLuong);
                        }
                    }
                }
                else
                {
                    System.out.print("Nhap ten sp: ");
                    this.tenSP = sc.nextLine();
                    System.out.print("Nhap don gia: ");
                    this.donGia = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhap ngay san xuat: ");
                    ngaySX =sc.nextLine();
                    do
                    {
                        System.out.print("Nhap so luong ve: ");
                        this.soLuong = sc.nextInt();
                        if(this.soLuong <= 0)
                        {
                            System.out.println("So luong ve khong hop le. Vui long nhap lai");
                        }
                    }while(this.soLuong <= 0);
                    spList.add(this);
                }
        }
    public static void suaThongTin()
    {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        System.out.print("Nhap ma sp muon thay doi: ");
        String str = sc.nextLine();
        for(SanPham x:spList)
        {
            if(x.getMaSP().equalsIgnoreCase(str))
            {
                System.out.print("Nhap ten sp: ");
                String tenSP = sc.nextLine();
                System.out.print("Nhap don gia: ");
                float donGia = sc.nextFloat();
                sc.nextLine();
                System.out.print("Nhap ngay san xuat: ");
                String ngaySX =sc.nextLine();
                System.out.print("Nhap so luong: ");
                int soLuong = sc.nextInt();
                x.setDonGia(donGia);
                x.setTenSP(tenSP);
                x.setNgaySX(ngaySX);
                x.setSoLuong(soLuong);
                System.out.println("Sua thong tin san pham thanh cong");
                result = 1;
            }
        }
        if(result == 0)
        {
            System.out.println("Khong tim thay san pham tuong ung");
        }
    }
    public void hienThiSP()
    {
        System.out.print("Ma SP: " + this.getMaSP() + "; Ten SP: " + this.getTenSP()
        + "; Don gia: " + this.getDonGia() + "; Ngay SX: " + this.getNgaySX()
        + "; So luong: " + this.getSoLuong());
    }
    
    public static void hienThiDS()
    {
        System.out.println("\t---Danh sach san pham cua sieu thi---");
        for(SanPham x:spList)
        {
            x.hienThiSP();
            System.out.println("");
        }
    }
    
    
}
