/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phuong_Tien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so luong phuong tien ban muon dang ky: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("So phuong tien phai > 0. Vui long nhap lai");
            }
        } while (n <= 0);
        for (int i = 0; i < n; i++) {
            int choice;
            do {
                System.out.println("==========Nhap phuong tien thu "+(i+1)+"==========");
                System.out.println("1.Oto");
                System.out.println("2.XeMay");
                System.out.println("3.XeTai");
                System.out.print("Your choice: ");
                choice = sc.nextInt();
                if (choice < 1 || choice > 3) {
                    System.out.println("Vui long nhap lai");
                }
            } while (choice < 1 || choice > 3);
            switch (choice) {
                case 1:
                    PTGT a = new Oto();
                    a.nhap();
                    PTGT.listPTGT.add(a);
                    Oto.listOto.add((Oto) a);

                    System.out.println("Them PT thanh cong");
                    break;
                case 2:
                    PTGT b = new XeMay();
                    b.nhap();
                    PTGT.listPTGT.add(b);
                    XeMay.listXeMay.add((XeMay) b);

                    System.out.println("Them PT thanh cong");
                    break;
                case 3:
                    PTGT c = new XeTai();
                    c.nhap();
                    PTGT.listPTGT.add(c);
                    XeTai.listXeTai.add((XeTai) c);
                    System.out.println("Them PT thanh cong");
                    break;
            }
        }
        System.out.println("=========Danh sach PTGT da dang ky=============");
        for (PTGT x : PTGT.listPTGT) {
            x.hienThi();
        }

        // Tim kiem 
        int search,result =0;
        System.out.print("Nhap so may muon tim kiem : ");
        search = sc.nextInt();
        for (Oto x : Oto.listOto) {
            if (x.soMay == search) {
                System.out.println("PHuong tien tren la oto");
                x.hienThi();
                result = 1;
            }
        }
        for (XeMay x : XeMay.listXeMay) {
            if (x.soMay == search) {
                System.out.println("Phuong tien tren la xe may ");
                x.hienThi();
                result = 1;
            }
        }
        for (XeTai x : XeTai.listXeTai) {
            if (x.soMay == search) {
                System.out.println("Phuong tien tren la xe tai");
                x.hienThi();
                result = 1;
            }
        }
        if(result == 0){
            System.out.println("Khong co phuong tien nao ");
        }
    }
}
