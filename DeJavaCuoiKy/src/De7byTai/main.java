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
public class main {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int n;
        System.out.println("Số thí sinh: ");
        n = nhap.nextInt();

        thisinh ts[] = new thisinh[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Thí sinh thứ: " + (i + 1));

            int select = 0;
            System.out.println("Nhập mã khối:");
            System.out.println("1: Khối A ");
            System.out.println("2: Khối C ");
            select = nhap.nextInt();
            if (select == 1) {
                ts[i] = new khoiA();
                ts[i].Nhap();
            }
            if (select == 2) {
                ts[i] = new khoiC();
                ts[i].Nhap();
            }

        }
        System.out.println("Thí sinh trúng tuyển: ");
        for (int i = 0; i < n; i++) {
            ts[i].kiemtra();
        }
    }
}
