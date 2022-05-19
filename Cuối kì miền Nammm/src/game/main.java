/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Scanner;
import sun.net.www.content.audio.x_aiff;

/**
 *
 * @author hoaianh_Kyros
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selection;
        do {
            System.out.println("\t---DANH SACH CHUC NANG---");
            System.out.println("1. Nhap san pham");
            System.out.println("2. Them khach hang");
            System.out.println("3. Thay doi thong tin san pham");
            System.out.println("4. Hien thi danh sach san pham");
            System.out.println("5. Mua san pham");
            System.out.println("6. Hien thi VIP_Khach hang co tong so tien mua lon nhat");
            System.out.println("0. Thoat");
            System.out.print("Ban chon chua nang: ");
            selection = sc.nextInt();
            switch (selection) {
                case 1:
                    System.out.print("Ban muon nhap bao nhieu san pham: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("\t---Lan nhap thu " + (i + 1));
                        SanPham a = new SanPham();
                        a.nhap();
                    }
                    break;
                case 2:
                    KhachHang kh = new KhachHang();
                    kh.themKh();
                    break;
                case 3:
                    SanPham.suaThongTin();
                    break;
                case 4:
                    SanPham.hienThiDS();
                    break;
                case 5:
                    int luaChon;
                    HoaDon hd = new HoaDon();
                    hd.nhap();
                    do {
                        System.out.println("1. Tiep tuc: ");
                        System.out.println("2. Thoat");
                        System.out.print("Ban chon: ");
                        luaChon = sc.nextInt();
                        switch (luaChon) {
                            case 1:
                                HoaDon hdnew = new HoaDon();
                                hdnew.nhap();
                                break;
                            case 2:
                                System.out.println("---Thank you---");
                                break;
                        }
                    } while (luaChon != 2);
                    break;
                case 6:
                    TongTienKH.hienThiVIP();
                    TongTienKH.khVIP().hienThi();
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("\t---THANK YOU VERY MUCH---");
                    break;

            }
        } while (selection != 0);
    }

}
