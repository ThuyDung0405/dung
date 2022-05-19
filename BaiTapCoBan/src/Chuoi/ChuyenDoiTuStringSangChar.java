
package Chuoi;

import java.util.Scanner;

public class ChuyenDoiTuStringSangChar {
    public static void main(String[] args) {
        //su dung CharAt()
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi : ");
        String str = sc.next();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            System.out.println("Ki tu thu "+i+" la: "+ch);
        }
    }
}
