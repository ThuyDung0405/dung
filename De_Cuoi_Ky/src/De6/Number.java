/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De6;

import java.util.Scanner;

/**
 *
 * @author Dung
 */
public class Number {

    private int A;
    private int B;

    public Number() {
    }

    public Number(int A, int B) {
        this.A = A;
        this.B = B;
    }

    public double getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap A = ");
        A = sc.nextInt();
        System.out.print("Nhap B = ");
        B = sc.nextInt();

    }

    public int cong() {
        return this.A + this.B;
    }

    public int tru() {
        return this.A - this.B;
    }

    public int nhan() {
        return this.A * this.B;
    }

    public float chia() {
        if (this.B == 0) {
            return 0;
        } else {
            return (float) this.A / this.B;
        }
    }

    public int UCLN() {
        if (this.A <= 0 || this.B <= 0) {
            return -1;
        } else {
            while (this.A != this.B) {
                if (this.A > this.B) {
                    A = A - B;
                } else {
                    B = B - A;
                }
            }
            return A;
        }
    }
}
