/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuoi;

import java.util.Scanner;

public class VietHoaKyTuDauTien {

    public static void main(String[] args) {

        String a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        a = sc.nextLine();
        String first = a.substring(0, 1);
        String remaining = a.substring(1, a.length());
        first = first.toUpperCase();
        a = first+remaining;
        System.out.println("Chuoi sau khi in hoa chu cai dau la: "+a);
    }

}
