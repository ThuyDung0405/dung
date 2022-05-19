
package Phuong_Tien;

import java.util.ArrayList;
import java.util.Scanner;

public class XeTai extends PTGT {
    static ArrayList<XeTai> listXeTai = new ArrayList<>();
    private float trongTai;

    public XeTai() {
    }

    public XeTai(float trongTai, int soMay, String hangSX, int namSX, float giaBan) {
        super(soMay, hangSX, namSX, giaBan);
        this.trongTai = trongTai;
    }

    public float getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(float trongTai) {
        this.trongTai = trongTai;
    }
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        do{
            System.out.print("Nhap trong tai : ");
            this.setTrongTai(sc.nextFloat());
            if(this.getTrongTai()<=0){
                System.out.println("Trong tai khong hop le. Vui long nhap lai!");
            }
        }while(this.getTrongTai()<=0);
    }
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("\t"+" Trong tai : "+this.getTrongTai());
    }
    
}
