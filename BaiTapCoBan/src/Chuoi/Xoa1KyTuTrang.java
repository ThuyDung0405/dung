/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuoi;

import java.util.Scanner;

/**
 *
 * @author Dung
 */
public class Xoa1KyTuTrang {
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        a = sc.nextLine();
        //sử dụng phương thức replaceAll() để thay thế " " = ""
        a = a.replaceAll("\\s","");
        System.out.println("Chuoi sau khi da xoa khoang trang la: "+a);
    }
}
