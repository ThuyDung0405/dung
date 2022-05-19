/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlytk;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLy ql = new QuanLy();
        while (true) {
            System.out.println("MENU");
            System.out.println("0. Thoat");
            System.out.println("1. Nhap thong tin 2 tk");
            System.out.println("2. Xuat thong tin 2tk");
            System.out.println("3. Nap tien");
            System.out.println("4. Tìm kiếm sách tham khảo");
            System.out.println("5. Sap xep");
            System.out.println("6. CK");
            System.out.print("Nhap lua chon: ");
            int key = Integer.parseInt(sc.nextLine());
            switch (key) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    ql.Nhap2ThongTinTK();
                    break;
                case 2:
                    ql.XuatTT();
                    break;
                case 3: ql.NapTien();
                    
                    break;
                case 4: 
                    
                    break;
                case 5: ql.SX();
                    
                    break;
                case 6:ql.CK();
                    
                    break;
                default: System.out.println("Nhap 0 >> 6");
                    break;
            }
        }
    }
}
