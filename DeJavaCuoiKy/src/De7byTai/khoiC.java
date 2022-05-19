/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De7byTai;

import java.util.Scanner;

/**
 *
 * @author VS9 X64Bit
 */
public class khoiC extends thisinh {

    private int diemvan;
    private int diemsu;
    private int diemdia;
    public int tongdiem;

    public void Nhap() {
        Scanner nhapsc = new Scanner(System.in);
        super.Nhap();
        System.out.println("điểm Văn: ");
        diemvan = nhapsc.nextInt();
        System.out.println("điểm Sử: ");
        diemsu = nhapsc.nextInt();
        System.out.println("điểm Địa: ");
        diemdia = nhapsc.nextInt();
    }

    public void Xuat() {
        try {
            super.Xuat();
            System.out.println("điểm 3 môn VĂN SỬ ĐỊA lần lượt là: " + diemvan + "/t" + diemsu + "/t" + diemdia);
        } catch (Exception ex) {
            throw ex;
        }
    }

    @Override
    public void kiemtra() {
        tongdiem = diemvan + diemsu + diemdia;
        if (tongdiem >= 18) {
            Xuat();
        }
    }
}
