package baitapcoban;

import java.util.Scanner;

public class Cong2sophuc {

    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        a = sc.nextDouble();
        System.out.println("Nhap vao so b: ");
        b = sc.nextDouble();
        System.out.println("Tong cua 2 so "+a+" va "+b+" la: "+(a+b));
    }
}
