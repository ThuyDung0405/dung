/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NganHang;

import java.util.Scanner;

/**
 *
 * @author Dung
 */
public class GiaoDich {
    protected String maGD;
    protected String ngayGD;
    protected double soTienGD;
    protected String loaiGD;

    public GiaoDich() {
    }

    public GiaoDich(String maGD, String ngayGD, double soTienGD, String loaiGD) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.soTienGD = soTienGD;
        this.loaiGD = loaiGD;
    }

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public String getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }

    public double getSoTienGD() {
        return soTienGD;
    }

    public void setSoTienGD(double soTienGD) {
        this.soTienGD = soTienGD;
    }

    public String getLoaiGD() {
        return loaiGD;
    }

    public void setLoaiGD(String loaiGD) {
        this.loaiGD = loaiGD;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma GD : ");
        this.setMaGD(sc.nextLine());    
        System.out.println("Nhap ngay GD : ");
        this.setNgayGD(sc.nextLine());    
        System.out.println("Nhap so tien GD : ");
        this.setSoTienGD(sc.nextDouble());    
        do {            
            System.out.println("Nhap loai GD : ");
            loaiGD = sc.nextLine();
            if(loaiGD.equalsIgnoreCase("W")||loaiGD.equalsIgnoreCase("D")){
                this.loaiGD=loaiGD;
                
            }
        } while (true);
        
    }

    @Override
    public String toString() {
        return "GiaoDich{" + "maGD=" + maGD + ", ngayGD=" + ngayGD + ", soTienGD=" + soTienGD + ", loaiGD=" + loaiGD + '}';
    }
}
