
package BTH5_Bai2;

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
       hoTen = sc.next();
       System.out.println("Nhap dia chi : ");
       diaChi = sc.next();
       System.out.println("Nhap nam sinh : ");
       namSinh = sc.nextInt();
       
   }
   public void inTT(){
       System.out.println("Ten : "+hoTen+"\tDia chi: "+diaChi+"\tNam sinh: "+namSinh);
   }
}
