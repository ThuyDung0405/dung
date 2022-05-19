/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapcoban;

import java.util.Scanner;


public class PhanNguyenvaDu {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        a = sc.nextInt();
        System.out.println("Nhap vao so b: ");
        b = sc.nextInt();
        System.out.println(a+" / "+b+" = "+(a/b));
        System.out.println(a+" % "+b+" = "+(a%b));
    }
}
