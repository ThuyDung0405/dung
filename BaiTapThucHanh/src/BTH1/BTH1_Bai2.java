/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTH1;

import java.util.Scanner;

/**
 *
 * @author Dung
 */
public class BTH1_Bai2 {

    public static void main(String[] args) {
        float a;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        a = sc.nextFloat();
        System.out.println("Nhap vao so b: ");
        b = sc.nextDouble();
        System.out.println("Nhap vao phep tinh: ");
        String pheptinh = sc.next();
        switch (pheptinh) {
            case "+":
                System.out.println(a + "+" + b + "=" + (a + b));
                break;
            case "-":
                System.out.println(a + "-" + b + "=" + (a - b));
                break;
            case "x":
                System.out.println(a + "x" + b + "=" + (a * b));
                break;
            case "/":
                if (b == 0) {
                    System.out.println(a + "/" + b + "=" + a + "/" + b);
                } else {
                    System.out.println(a + "/" + b + "=" + (float)(a / b));
                }break;
            case "%":
                if (b == 0) {
                    System.out.println(a + "%" + b + "=" + a + "%" + b);

                } else {
                    System.out.println(a + "%" + b + "=" + (a % b));
                }break;
            default:
                break;
        }

    }
}
