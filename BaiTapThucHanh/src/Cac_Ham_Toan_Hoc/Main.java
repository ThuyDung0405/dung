/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cac_Ham_Toan_Hoc;

import java.util.Scanner;

/**
 *
 * @author Dung
 */
public class Main {

    public static void main(String[] args) {
        int n, x, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so n: ");
        n = sc.nextInt();
        
        System.out.println("Nhap vao so x: ");
        x = sc.nextInt();
        System.out.println("Nhap vao so k: ");
        k = sc.nextInt();
        if (ToanHoc.kiemtraNguyenTo(k)) {
            System.out.println(k + " la so nguyen to");
        } else {
            System.out.println(k + " ko la so nguyen to");
        }
        if (ToanHoc.kiemtraHoanHao(n)) {
            System.out.println(n + " la so hoan hao");
        } else {
            System.out.println(n + " ko la so hoan hao");
        }
        if (ToanHoc.kiemtraSoChinhPhuong(n)) {
            System.out.println(n + " la so chinh phuong");
        } else {
            System.out.println(n + " ko phai so chinh phuong");
        }
        System.out.println("So Fibonacci thu " + n + " cua day la: " + ToanHoc.tinhFibo(n));
        System.out.println("Tong cua day S1 la : " + ToanHoc.tinhTong1(n));
        System.out.println("Tong cua day S2 la : " + ToanHoc.tinhTong2(n, x, k));
        System.out.println("Tong cua day S3 la : " + ToanHoc.tinhTong3(n));
    }
    
}
