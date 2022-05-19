
package l02;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Account {
    protected static ArrayList<Account> acList = new ArrayList<>();
    private long soTK;
    private String tenTK;
    private double soTien;
    private float laiXuat = (float) 0.035;

    public Account() {
        this.soTien = 50.00;
    }

    public Account(long soTK, String tenTK) {
        this.soTK = soTK;
        this.tenTK = tenTK;
    }

    public long getSoTK() {
        return soTK;
    }

    public void setSoTK(long soTK) {
        this.soTK = soTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public float getLaiXuat() {
        return laiXuat;
    }

    public void setLaiXuat(float laiXuat) {
        this.laiXuat = laiXuat;
    }


    @Override
    public String toString() {
        return "Acount{" + "soTK=" + soTK + ", tenTK=" + tenTK + ", soTien=" 
                + Math.round(this.getSoTien()*100)/100 + "VND" + ", laiXuat=" + laiXuat + '}';
    }
    static Account getAccount(long stk)
    {
        for(Account x: acList)
        {
            if(x.getSoTK() == stk)
                return x;
        }
        return null;
    }
    public void nhapTT()
    {
        Scanner sc = new Scanner(System.in);
        long stk;
        do {            
            System.out.print("Nhap so tk: ");
            stk = sc.nextLong();
            if(this.checkSTK(stk))
            {
                System.out.println("So tai khoan da ton tai. Vui long nhap lai");
            }
        } while (this.checkSTK(stk));
        this.soTK = stk;
        sc.nextLine();
        System.out.print("Ten TK: ");
        this.setTenTK(sc.nextLine());
    }
    public void napTien()
    {
        Scanner sc = new Scanner(System.in);
        double tienNap;
        do
        {
            System.out.print("Ban muon nap bao nhieu tien: ");
            tienNap = sc.nextDouble();
            if(tienNap <= 0)
            {
                System.out.println("So tien nap khong hop le. Vui long nhap lai");
            }
        }while(tienNap <= 0);
        this.setSoTien(this.getSoTien() + tienNap);
        System.out.println("==Nap tien thanh cong==");
    }
    
    public void rutTien()
    {
        Scanner sc = new Scanner(System.in);
        double tienRut;
        double phiRut = 2;
        do
        {
            System.out.print("Ban muon nap bao nhieu tien: ");
            tienRut = sc.nextDouble();
            if(tienRut <= 0)
            {
                System.out.println("So tien rut khong hop le. Vui long nhap lai");
            }
            if(tienRut > (this.getSoTien() - phiRut))
            {
                System.out.println("Khong du so du. Vui long nhap lai");
            }
        }while(tienRut <= 0 || tienRut > (this.getSoTien() - phiRut));
        this.setSoTien(this.getSoTien() - tienRut - phiRut);
        System.out.println("==RUT TIEN THANH CONG==");
    }
    
    public void daoHan()
    {
        this.setSoTien(this.getSoTien() + this.getSoTien() * this.laiXuat);
        System.out.println("==DAO HAN THANH CONG==");
    }
    static boolean checkSTK(long n)
    {
        for(Account x: acList)
        {
            if(n == x.getSoTK())
            return true;
        }
        return false;
    }
    static void chuyenKhoan()
    {
        Scanner sc = new Scanner(System.in);
        double tienTKNguon = 0, tienChuyen;
        long tkNguon, tkDich;
        do {            
            System.out.print("Nhap so tk nguon: ");
            tkNguon = sc.nextLong();
            if(!Account.checkSTK(tkNguon))
            {
                System.out.println("So tai khoan khong hop le. Vui long nhap lai");
            }
        } while (!Account.checkSTK(tkNguon));
        do {            
            System.out.print("Nhap so tk dich: ");
            tkDich = sc.nextLong();
            if(!Account.checkSTK(tkNguon))
            {
                System.out.println("So tai khoan khong hop le. Vui long nhap lai");
            }
        } while (!Account.checkSTK(tkDich));
        for(Account x: acList)
        {
            if(x.getSoTK() == tkNguon)
            {
                tienTKNguon = x.getSoTien();
                break;
            }   
        }
        System.out.println("So du cua tai khoan nguon la: " + tienTKNguon);
        do {            
            System.out.print("So tien chuyen la: ");
            tienChuyen = sc.nextDouble();
            if(tienChuyen <= 0)
            {
                System.out.println("So tien khong hop le. Vui long nhap lai");
            }
            if(tienChuyen > tienTKNguon)
            {
                System.out.println("So du khong du. Vui long nhap lai");
            }
        } while (tienChuyen <= 0 || tienChuyen > tienTKNguon);
        for(Account x:acList)
        {
            if(x.getSoTK() == tkNguon)
            {
                x.setSoTien(x.getSoTien() - tienChuyen);
            }
        }
        for(Account x:acList)
        {
            if(x.getSoTK() == tkDich)
            {
                x.setSoTien(x.getSoTien() + tienChuyen);
            }
        }
        System.out.println("==CHUYEN TIEN THANH CONG==");
    }
}
