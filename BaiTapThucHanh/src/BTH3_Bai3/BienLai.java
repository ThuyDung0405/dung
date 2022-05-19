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
public class BienLai extends KhachHang{
    private int chiSoCu;
    private int chiSoMoi;

    public BienLai() {
    }

    public BienLai(int chiSoCu, int chiSoMoi) {
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
       
    }

    public int getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    public int SoTienPhaiTra() {
        return (this.chiSoMoi - this.chiSoCu)*850000;
    }
    public void nhapBL(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chi so cu: ");
        this.chiSoCu = sc.nextInt();
        System.out.println("Nhap chi so moi: ");
        this.chiSoMoi = sc.nextInt();
    }
   
    @Override
    public String toString() {
        return super.toString()+ "BienLai " + "chiSoCu=" + chiSoCu + ", chiSoMoi=" + chiSoMoi +"So tien phai tra: "+SoTienPhaiTra();
    }
}
