
package baitapcoban;

import java.util.Scanner;

public class SoChanLe {
    public static void main(String[] args) {
    int a;
    Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
    a = sc.nextInt();
    if(a%2==0){
        System.out.println(a+" la so chan");
    }else {
        System.out.println(a+" la so le");
    }
    }
}
