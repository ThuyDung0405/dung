package baitapcoban;

import java.util.Scanner;

public class NguyenAmvaPhuAm {

    public static void main(String[] args) {
        char a;
        boolean nguyenam = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ki tu can kiem tra: ");
        a = sc.next().charAt(0);
        switch (a) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'U': nguyenam = true;
        } 
        if(nguyenam == true){
            System.out.println(a+" la nguyen am ");
        }else System.out.println(a+" la phu am");
    }
}
