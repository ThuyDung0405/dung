package Phuong_Tien;

import java.util.ArrayList;
import java.util.Scanner;

public class PTGT {
    static ArrayList<PTGT> listPTGT = new ArrayList<>();
    protected int soMay;
    protected String hangSX;
    protected int namSX;
    protected float giaBan;

    public PTGT() {
    }

    public PTGT(int soMay, String hangSX, int namSX, float giaBan) {
        this.soMay = soMay;
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.giaBan = giaBan;
    }

    public int getSoMay() {
        return soMay;
    }

    public void setSoMay(int soMay) {
        this.soMay = soMay;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap so may : ");
            this.setSoMay(sc.nextInt());
            if(this.getSoMay()<=0){
                System.out.println("So may khong hop le. Vui long nhap lai!");
            }
        }while(this.getSoMay()<=0);
        sc.nextLine();
        System.out.print("Nhap hang sx : ");
       this.setHangSX(sc.nextLine());
       do{
            System.out.print("Nhap nam SX : ");
            this.setNamSX(sc.nextInt());
            if(this.getNamSX()<=0){
                System.out.print("Nam SX khong hop le. Vui long nhap lai!");
            }
        }while(this.getNamSX()<=0);
       do{
            System.out.print("Nhap gia ban : ");
            this.setGiaBan(sc.nextFloat());
            if(this.getGiaBan()<=0){
                System.out.print("Gia ban khong hop le. Vui long nhap lai!");
            }
        }while(this.getGiaBan()<=0);
       
       
    }
    public void hienThi(){
        System.out.print("Số máy : "+this.getSoMay()+"\t"+" Hang sx : "+this.getHangSX()+"\t"+" Nam SX : "+this.getNamSX()+"\t"+" Gia ban : "+this.getGiaBan());
    }
}
