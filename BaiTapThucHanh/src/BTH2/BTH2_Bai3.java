/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTH2;

import java.util.Scanner;

public class BTH2_Bai3 {

    public static boolean KiemTraNamNhuan(int nam) {
        return (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
    }

    public static int TimSoNgayTrongThang(int Thang, int Nam) {
        int ngayTrongThang = 0;
        switch (Thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                ngayTrongThang = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                ngayTrongThang = 30;
                break;
            case 2:
                boolean Check = KiemTraNamNhuan(Nam);
                if (Check == true) {
                    ngayTrongThang = 29;
                } else {
                    ngayTrongThang = 28;
                }
        }
        return ngayTrongThang;
    }

    public static int TimNgayTrongNam(int Ngay, int Thang, int Nam) {
        int ngayTrongThang = TimSoNgayTrongThang(Thang, Nam);
        int S = Ngay;
        for (int i = 1; i < Thang; i++) {
            S = S + ngayTrongThang;
        }
        return S;
    }

    public static void main(String[] args) {
        int Ngay, Thang, Nam;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao nam: ");
            Nam = sc.nextInt();
            if (Nam < 0) {
                System.out.println("Du lieu nam khong hop le. Xin kiem tra lai!");
            }
        } while (Nam < 0);

        do {
            System.out.println("Nhap vao thang: ");
            Thang = sc.nextInt();
            if (Thang < 1 || Thang > 12) {
                System.out.println("Du lieu thang khong hop le. Xin kiem tra lai!");
            }
        } while (Thang < 1 || Thang > 12);

        int ngayTrongThang = TimSoNgayTrongThang(Thang, Nam);
        do {
            System.out.println("Nhap vao ngay: ");
            Ngay = sc.nextInt();
            if (Ngay < 1 || Ngay > ngayTrongThang) {
                System.out.println("\nDu lieu ngay khong hop le. Xin kiem tra lai!");
            }
        } while (Ngay < 1 || Ngay > ngayTrongThang);

        int S = TimNgayTrongNam(Ngay, Thang, Nam);
        System.out.println("Ngay thu " + S + " trong nam");
    }
}


