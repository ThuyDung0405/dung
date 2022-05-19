
package Ho_Dan_Khu_Pho;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class CaNhan {
    protected String hoTen;
    protected int namSinh;
    protected String ngheNghiep;
    protected int tuoi;

    public CaNhan() {
    }

    public CaNhan(String hoTen, int namSinh, String ngheNghiep) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.ngheNghiep = ngheNghiep;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public int getTuoi() {
        return LocalDate.now().getYear() - this.namSinh;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten : ");
        this.setHoTen(sc.nextLine());
        int n;
        do{
        System.out.print("Nhap nam sinh : ");
        n = sc.nextInt();
        if(n<=0||n>2021){
            System.out.println("Nam sinh khong hop le. Vui long nhap lai!");
        }
        }while(n<=0||n>2021); 
        this.namSinh = n;
        sc.nextLine();
        System.out.print("Nhap nghe nghiep : ");
        this.setNgheNghiep(sc.nextLine());
        
    }
    public void hienThi(){
        System.out.println("Ho ten : "+this.getHoTen()+"\t"+" Nam sinh : "+this.getNamSinh()+"\t"+" Nghe nghiep : "+this.getNgheNghiep()+"\t"+" Tuoi : "+getTuoi());
    }

}
