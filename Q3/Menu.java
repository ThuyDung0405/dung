/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

import java.util.Scanner;
import kiemtralan2.Q2.QLPTGT;

/**
 *
 * @author PC
 */
public class Menu {
    public static void main(String[] args) {
        QLTL a = new QLTL();
        while(true){
            System.out.println("----------MENU----------");
            System.out.println("0. Thoat!!!");
            System.out.println("1. Nhap Sach");
            System.out.println("2. Nhap tap chi");
            System.out.println("3. Nhap bao");
            System.out.println("4. Hien thi danh sach");
            System.out.println("5. Tim kiem theo ma");
            System.out.println("6. Tim kiem theo ten nha san xuat");
            System.out.println("7. Tim kiem theo ten tac gia");
            System.out.println("8. Tim kiem theo ten sach");
            System.out.println("9. Tim kiem theo ngay phat hanh");
            System.out.println("10. Xoa theo ma");
            System.out.println("11. Sua theo ma");
            System.out.println("12. Sap xep theo ten nha san xuat");
            System.out.println("13. Sap xep theo so phat hanh");
            System.out.println("14. Sap xep theo ten tac gia");
            System.out.println("15. Sap xep theo ten sach");
            System.out.println("16. Sap xep theo so trang");
            System.out.println("17. Sap xep theo ngay phat hanh");
            System.out.println("18. Thong ke");
            //System.out.println("19. Xoa danh sach");
            System.out.println("Lua chon cua ban: ");
            Scanner in = new Scanner(System.in);
            int chon = Integer.parseInt(in.nextLine());
            switch(chon){
                case 0: System.out.println("Bye!!!");
                        System.exit(0);
                case 1: a.nhapSach();
                    break;
                case 2: a.nhapTapChi();
                    break;
                case 3: a.nhapBao();
                    break;
                case 4: a.inDanhSach();
                    break;
                case 5: a.timkiemtheoMa();
                    break;
                case 6: a.timkiemtheoTenNhaSX();
                    break;
                case 7: a.timkiemtheoTenTG();
                    break;
                case 8: a.timkiemtheoTenSach();
                    break;
                case 9: a.timkiemtheoNgayPhatHanh();
                    break;
                case 10: a.xoatheoMa();
                    break;
                case 11: a.suatheoMa();
                    break;
                case 12: a.sapxeptheoTenNhaSX();
                    break;
                case 13: a.sapxeptheoSoPhatHanh();
                    break;
                case 14: a.sapxeptheoTenTG();
                    break;
                case 15: a.sapxeptheoTenSach();
                    break;
                case 16: a.sapxeptheoSoTrang();
                    break;
                case 17: a.sapxeptheoNgayPhatHanh();
                    break;
                case 18: 
                    break;
                case 19: 
                    break;
                default: System.out.println("Chi chon tu 0 -> 16: ");
                    break;
            }
        }
    }
}
