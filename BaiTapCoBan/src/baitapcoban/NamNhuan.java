package baitapcoban;

import java.util.Scanner;

public class NamNhuan {

    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao nam can kiem tra: ");
        year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + " la nam nhuan");
        }
        else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " la nam nhuan");
        } else {
            System.out.println(year + " khong la nam nhuan ");
        }
    }
}
