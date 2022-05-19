package Account_NganHang;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import jdk.nashorn.internal.codegen.CompilerConstants;

public class Account {

    static ArrayList<Account> listAC = new ArrayList<>();
    private long stk;
    private String tenTK;
    private double soTien;
    private double laiSuat = 0.035;

    public Account() {
    }

    public Account(long stk, String tenTK, double soTien) {
        this.stk = stk;
        this.tenTK = tenTK;
        this.soTien = soTien;

    }

    public long getStk() {
        return stk;
    }

    public void setStk(long stk) {
        this.stk = stk;
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
    public String dinhDangTienTe(double vnd){
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String str1 = currencyVN.format(vnd);
        return str1;
    }
    public void napTien() {
        Scanner sc = new Scanner(System.in);
        float tienNap;
        do {
            System.out.print("Nhap so tien can nap : ");
            tienNap = sc.nextFloat();
            if (tienNap <= 0) {
                System.out.println("So tien nap ko hop le. Vui long nhap lai");
            }
        } while (tienNap <= 0);
        this.setSoTien(this.getSoTien() + tienNap);
        System.out.println("===================Nap tien thanh cong=================");
    }

    public void rutTien() {
        Scanner sc = new Scanner(System.in);
        float tienRut, phiRut = 2;
        do {
            System.out.print("Nhap so tien can rut : ");
            tienRut = sc.nextFloat();
            if (tienRut <= 0) {
                System.out.println("So tien rut ko hop le. Vui long nhap lai");
            }
            if (tienRut > (this.soTien + phiRut)) {
                System.out.println("So du khong du. Vui long nhap lai");
            }
        } while (tienRut <= 0 || tienRut > (this.soTien + phiRut));
        this.setSoTien(this.getSoTien() - tienRut - phiRut);
        System.out.println("================Rut tien thanh cong==============");
    }

    public void daoHan() {
        this.setSoTien(this.getSoTien() + this.getSoTien() * laiSuat);
        System.out.println("======Dao han thanh cong=====");
    }

    static boolean checkSTK(long s) {
        for (Account x : listAC) {
            if (s == x.getStk()) {
                return true;
            }
        }
        return false;
    }

     static void chuyenKhoan() {
        Scanner sc = new Scanner(System.in);
        long tkNguon, tkDich;
        double tienCK, tienTKNguon = 0;
        do {
            System.out.print("Nhap so tai khoan nguon : ");
            tkNguon = sc.nextLong();
            if (!Account.checkSTK(tkNguon)) {
                System.out.println("So tai khoan khong hop le. Vui long nhap lai");
            }
        } while (!Account.checkSTK(tkNguon));
        do {
            System.out.print("Nhap so tai khoan dich : ");
            tkDich = sc.nextLong();
            if (!Account.checkSTK(tkNguon)) {
                System.out.println("So tai khoan khong hop le. Vui long nhap lai");
            }
        } while (!Account.checkSTK(tkDich));
        for (Account x : listAC) {
            if (x.stk == tkNguon) {
                tienTKNguon = x.getSoTien();
                break;
            }
        }
        System.out.println("So du tai khoan la : " + (tienTKNguon));
        do {
            System.out.print("Nhap so tien can chuyen : ");
            tienCK = sc.nextDouble();
            if (tienCK <= 0) {
                System.out.println("So tien khong hop le. Vui long nhap lai");
            }
            if (tienCK > tienTKNguon) {
                System.out.println("So du khong du. Vui long nhap lai");
            }
        } while (tienCK <= 0 || tienCK > tienTKNguon);
        for (Account x : listAC) {
            if (x.getStk() == tkNguon) {
                x.setSoTien(x.getSoTien() - tienCK);
            }
        }
        for (Account x : listAC) {
            if (x.getStk() == tkDich) {
                x.setSoTien(x.getSoTien() + tienCK);
            }
        }
    }

    static Account getAccount(long s) {
        for (Account x : listAC) {
            if (x.getStk() == s) {
                return x;
            }
        }
        return null;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        long n;
        do {
            System.out.print("Nhap so tai khoan : ");
            n = sc.nextLong();
            if (this.checkSTK(n)) {
                System.out.println("So tai khoan da ton tai. Vui long nhap lai");
            } else if (n < 0) {
                System.out.println("So tai khoan khong dung. Vui long nhap lai");
            }
        } while (n < 0||this.checkSTK(n));
        this.stk = n;
        sc.nextLine();
        System.out.print("Nhap ten tai khoan : ");
        this.setTenTK(sc.nextLine());
        this.setSoTien(50);
    }

    @Override
    public String toString() {
        return "Account{" + "stk=" + stk + ", tenTK=" + tenTK + ", soTien=" + dinhDangTienTe(soTien) + '}';
    }

}
