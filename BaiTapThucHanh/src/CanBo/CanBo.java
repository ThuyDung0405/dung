package CanBo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
import sun.util.resources.LocaleData;

public class CanBo {
    protected String hoTen;
    protected int namSinh;
    protected String gioiTinh;
    protected String diaChi;
    protected float heSoLuong;
    public CanBo() {
    }

    public CanBo(String hoTen, int namSinh, String gioiTinh, String diaChi, float heSoLuong) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.heSoLuong = heSoLuong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten : ");
        hoTen = sc.nextLine();
        do{
            System.out.print("Nhap nam sinh : ");
            namSinh = sc.nextInt();
            if(namSinh<0 || namSinh> LocalDate.now().getYear()){
                System.out.println("Nam sinh khong hop le. Vui long nhap lai"); 
            }
        }while(namSinh<0 || namSinh> LocalDate.now().getYear());
        sc.nextLine();
        System.out.print("Nhap gioi tinh : ");
        gioiTinh = sc.nextLine();
        System.out.print("Nhap dia chi : ");
        diaChi = sc.nextLine();
        System.out.print("Nhap he so luong : ");
        heSoLuong = sc.nextFloat();
    }
    @Override
    public String toString() {
        return "CanBo{" + "hoTen=" + hoTen + ", namSinh=" + namSinh + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", luong="+(heSoLuong*1490000);
    }
    public String getTen(){
        return this.hoTen;
    }
    
}
