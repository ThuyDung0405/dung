package BTH3.Bai1;

import java.util.Scanner;

public class Nguoi {

    public String hoTen;
    public String diaChi;
    public int namSinh;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String diaChi, int namSinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        namSinh = sc.nextInt();
    }

    public void inTT() {
        System.out.println("Ho ten : " + this.getHoTen());
        System.out.println("Dia chi : " + this.getDiaChi());
        System.out.println("Nam sinh : " + this.getNamSinh());
    }

}

