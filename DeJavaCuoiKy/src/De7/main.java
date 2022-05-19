/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author arohigh
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n = ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("are u kidding me??");
        } else {
            ThiSinh ts[] = new ThiSinh[n];
            for (int i = 0; i < n; i++) {
                int selection = 0;
                do {
                    System.out.println("Ban muon nhap sinh vien khoi A hay C?");
                    System.out.println("1. Khoi A");
                    System.out.println("2. Khoi C");
                    System.out.print("Ban chon: ");
                    selection = sc.nextInt();
                    switch (selection) {
                        case 1:
                            ts[i] = new ThiSinhKhoiA();
                            System.out.println("nhap vao thi sinh thu " + (i + 1) + " (thi sinh khoi A)");
                            ts[i].Nhap();
                            break;
                        case 2:
                            ts[i] = new ThiSinhKhoiC();
                            System.out.println("nhap vao thi sinh thu " + (i + 1) + " (thi sinh khoi C)");
                            ts[i].Nhap();
                            break;
                        default:
                            System.out.println("ban phai nhap vao 1 hoac 2!!!");
                            System.out.println("de nghi nhap lai");
                            break;
                    }
                } while (selection != 1 && selection != 2);
            }
            System.out.println("---------------------------------------------------");
            System.out.println("---------------------------------------------------");
            System.out.println("---------------------------------------------------");

            System.out.println("Danh sach cac thi sinh trung tuyen");
            for (int i = 0; i < n; i++) {
                ts[i].Check();
            }
        }
    }
}
