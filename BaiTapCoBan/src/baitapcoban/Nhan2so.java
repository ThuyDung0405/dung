
package baitapcoban;

import java.util.Scanner;

public class Nhan2so {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        a = sc.nextInt();
        System.out.println("Nhap vao so b: ");
        b = sc.nextInt();
        System.out.println("Tich 2 so "+a+" va "+b+" la: " +(a*b));
    }
}
