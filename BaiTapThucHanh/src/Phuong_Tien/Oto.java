
package Phuong_Tien;

import java.util.ArrayList;
import java.util.Scanner;

public class Oto extends PTGT {
    static ArrayList<Oto> listOto = new ArrayList<>();
    private int soChoNgoi;
    private String kieuDongCo;

    public Oto() {
    }

    public Oto(int soChoNgoi, String kieuDongCo, int soMay, String hangSX, int namSX, float giaBan) {
        super(soMay, hangSX, namSX, giaBan);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        do{
            System.out.print("Nhap so cho ngoi : ");
            this.setSoChoNgoi(sc.nextInt());
            if(this.getSoChoNgoi()<=0){
                System.out.println("So cho ngoi khong hop le. Vui long nhap lai!");
            }
        }while(this.getSoChoNgoi()<=0);
        sc.nextLine();
        System.out.print("Nhap kieu dong co : ");
        this.setKieuDongCo(sc.nextLine());
    }
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("\t"+" So cho ngoi : "+this.getSoChoNgoi()+"\t"+" Kieu dong co : "+this.getKieuDongCo());
    }
}
