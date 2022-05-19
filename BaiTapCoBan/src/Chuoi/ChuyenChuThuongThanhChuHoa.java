/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuoi;

import java.util.Scanner;


public class ChuyenChuThuongThanhChuHoa {
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        a = sc.next();
        a = a.toUpperCase();
        System.out.println("Chuoi sau khi duoc viet hoa la : "+a);
    }
}
