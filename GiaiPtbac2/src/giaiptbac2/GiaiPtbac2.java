/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaiptbac2;
import java.util.Scanner;
/**
 *
 * @author SN
 */
public class GiaiPtbac2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c;
        float x1, x2, delta;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so a: ");
        a = scanner.nextInt();
        System.out.print("Nhap vao so b: ");
        b = scanner.nextInt();
        System.out.print("Nhap vao so c: ");
        c = scanner.nextInt();
       
        delta = (b*b - 4*a*c);
        if (delta < 0) {
            System.out.println("PT vo nghiem");
        } else if (delta == 0) {
            x1=x2=(-b/(2*a));
            System.out.println("PT co nghiem kep la x1 = x2 = " + x1);
        } else {
            x1 = (float)((-b + Math.sqrt(delta))/(2*a));
            x2 = (float)((-b - Math.sqrt(delta))/(2*a));
            System.out.println("PT co 2 nghiem la x1 = " + x1 + " và x2 = " + x2);
        }
    }
}
   

