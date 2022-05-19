
package CanBo;

import java.io.ObjectStreamConstants;
import java.util.Scanner;

public class CongNhan extends CanBo {
    private String bac;

    public CongNhan() {
    }

    public CongNhan(String bac, String hoTen, int namSinh, String gioiTinh, String diaChi, float heSoLuong) {
        super(hoTen, namSinh, gioiTinh, diaChi, heSoLuong);
        this.bac = bac;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap bac : ");
        bac = sc.nextLine();
    }

    @Override
    public String toString() {
        System.out.print(super.toString());
        return ", bac=" + bac + '}';
    }
    
}
