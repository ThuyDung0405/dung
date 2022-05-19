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
public class khoiA extends thisinh {

    private int diemtoan;
    private int diemly;
    private int diemhoa;
    public int tongdiem;

    public void Nhap() {
        Scanner nhapsc = new Scanner(System.in);
        super.Nhap();
        System.out.println("Điểm toán: ");
        diemtoan = nhapsc.nextInt();
        System.out.println("Điểm lý: ");
        diemly = nhapsc.nextInt();
        System.out.println("Điểm hóa: ");
        diemhoa = nhapsc.nextInt();
    }

    public void Xuat() {
        try {
            super.Xuat();
            System.out.println("Điểm 3 môn Toán Lý Hóa  là: " + diemtoan + "/t" + diemly + "/t" + diemhoa);
        } catch (Exception ex) {
            throw ex;
        }
    }

    @Override
    public void kiemtra() {
        tongdiem = diemtoan + diemly + diemhoa;
        if (tongdiem >= 20) {
            Xuat();
        }
    }
}
