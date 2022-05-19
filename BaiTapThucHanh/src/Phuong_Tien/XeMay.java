/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phuong_Tien;

import java.util.ArrayList;
import java.util.Scanner;

public class XeMay extends PTGT{
    static  ArrayList<XeMay> listXeMay = new ArrayList<>();
    private float congSuat;

    public XeMay() {
    }

    public XeMay(float congSuat, int soMay, String hangSX, int namSX, float giaBan) {
        super(soMay, hangSX, namSX, giaBan);
        this.congSuat = congSuat;
    }

    public float getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(float congSuat) {
        this.congSuat = congSuat;
    }
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        do{
            System.out.print("Nhap cong suat: ");
            this.setCongSuat(sc.nextFloat());
            if(this.getCongSuat()<=0){
                System.out.println("Cong suat khong hop le. Vui long nhap lai!");
            }
        }while(this.getCongSuat()<=0);
    }
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("\t"+" Cong suat : "+this.getCongSuat());
    }
}
