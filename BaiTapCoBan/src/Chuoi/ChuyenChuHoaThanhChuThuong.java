
package Chuoi;

import java.util.Scanner;

public class ChuyenChuHoaThanhChuThuong {
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi a: ");
        a = sc.next();
        System.out.println("Chuoi sau khi chuyen sang chu thuong la : "+a.toLowerCase() );
    }
}
