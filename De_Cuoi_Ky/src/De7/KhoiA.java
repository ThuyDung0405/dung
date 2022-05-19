/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De7;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Dung
 */
public class KhoiA extends ThiSinh{
    private float diemToan;
    private float diemLy;
    private float diemHoa;

    public KhoiA() {
    }

    public KhoiA(float diemToan, float diemLy, float diemHoa, String hoTen, Date ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        do {
            System.out.println("Nhap diem toan: ");
            this.setDiemToan(sc.nextFloat());
            if (diemToan < 0 || diemToan > 10) {
                System.out.println("Diem khong hop le. Vui long nhap lai!");
            }
        } while (diemToan < 0 || diemToan > 10);
        do {
            System.out.println("Nhap diem ly: ");
            this.setDiemLy(sc.nextFloat());
            if (diemLy < 0 || diemLy > 10) {;
                System.out.println("Diem khong hop le. Vui long nhap lai!");
            }
        } while (diemLy < 0 || diemLy > 10);
        do {
            System.out.println("Nhap diem hoa: ");
            this.setDiemHoa(sc.nextFloat());
            if (diemHoa < 0 || diemHoa > 10) {
                System.out.println("Diem khong hop le. Vui long nhap lai!");
            }
        } while (diemHoa < 0 || diemHoa > 10);

    }
    @Override
    public boolean check(){
        if(this.getDiemHoa()+this.getDiemLy()+this.getDiemToan()>20){
            return true;
        }return false;
    }
    @Override
   public void in(){
       super.in();
        System.out.print("\tDiem toan: "+this.getDiemToan()+"\tDiem ly: "+this.getDiemLy()+"\tDiem hoa: "+this.getDiemHoa());
   }
}
