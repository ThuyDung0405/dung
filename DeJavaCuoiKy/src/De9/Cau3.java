/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De9;

/**
 *
 * @author arohigh
 */
public class Cau3 {

    public static void main(String[] args) {
        ThiSinh ts = new ThiSinh("daddy");
        ts.in();
        ThiSinhA tsA = new ThiSinhA("kid", 4, 5, 6);
        ts.in();
        System.out.println("------------");
        tsA.display();
    }
}

class ThiSinh {

    protected String name;

    public ThiSinh(String name) {
        this.name = name;
    }

    public void in() {
        System.out.println("ten: " + this.name);
    }
}

class ThiSinhA extends ThiSinh {

    double toan, ly, hoa;

    public ThiSinhA(String name, double toan, double ly, double hoa) {
        super(name);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public void display() {
        System.out.println("ho ten: " + this.name);
        System.out.println("tong diem: " + (this.toan + this.ly + this.hoa));
    }
}
