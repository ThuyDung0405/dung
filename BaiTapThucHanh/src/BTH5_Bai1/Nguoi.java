
package BTH5_Bai1;

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
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        this.hoTen = sc.next();
        System.out.println("Nhap dia chi : ");
        this.diaChi = sc.next();
        System.out.println("Nhap nam sinh : ");
        this.namSinh = sc.nextInt();
        
    }

    @Override
    public String toString() {
        return "Nguoi{" + "hoTen=" + hoTen + ", diaChi=" + diaChi + ", namSinh=" + namSinh + '}';
    }
 
}
