//1.	Nhập 2 thông tin tài khoản từ bàn phím
//2.	Xuất thông tin tài khoản đã nhập bao gồm: Số TK, Tên chủ TK, số tiền có trong TK
//3.	Phương thức nạp tiền vào tài khoản
//4.	Phương thức rút tiền
//5.	Phương thức đáo hạn
//6.	Phương thức chuyển khoản
package Account_NganHang;

import java.util.ArrayList;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("==================Menu===============");
            System.out.println("1.Nhap thong tin tai khoan");
            System.out.println("2.Xuat thong tin tai khoan");
            System.out.println("3.Nap tien");
            System.out.println("4.Rut tien");
            System.out.println("5.Dao han");
            System.out.println("6.Chuyen khoan");
            System.out.println("0.Thoat");
            System.out.print("Ban chon: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("===========Nhap tai khoan thu 1 ============");
                    Account a = new Account();
                    a.nhap();
                    Account.listAC.add(a);
                    System.out.println("===========Nhap tai khoan thu 2 ============");
                    Account b = new Account();
                    b.nhap();
                    Account.listAC.add(b);
                    break;
                case 2:
                    for (Account x : Account.listAC) {
                        System.out.println(x.toString());
                    }
                    break;
                case 3:
                    long s;
                    do {                        
                        System.out.print("Nhap so tai khoan muon nap tien: ");
                        s = sc.nextLong();
                        if(!Account.checkSTK(s)){
                            System.out.println("So tai khoan khong ton tai. Vui long nhap lai");
                        }
                    } while (!Account.checkSTK(s));
                    Account.getAccount(s).napTien();
                    break;
                case 4:
                    long t;
                    do {                        
                        System.out.print("Nhap so tai khoan muon rut tien: ");
                        t = sc.nextLong();
                        if(!Account.checkSTK(t)){
                            System.out.println("So tai khoan khong ton tai. Vui long nhap lai");
                        }
                    } while (!Account.checkSTK(t));
                    Account.getAccount(t).rutTien();
                    break;

                case 5:
                    long p;
                    do {                        
                        System.out.print("Nhap so tai khoan muon dao han: ");
                        p = sc.nextLong();
                        if(!Account.checkSTK(p)){
                            System.out.println("So tai khoan khong ton tai. Vui long nhap lai");
                        }
                    } while (!Account.checkSTK(p));
                    Account.getAccount(p).daoHan();
                    break;

                case 6:
                    Account.chuyenKhoan();
                    break;

                case 0:
                    System.out.println("----------------------------------------------------");
                    break;
                default:
                    System.out.println("Cu phap ko dung. Vui long nhap lai");
                    break;
            }
        } while (chon != 0);
    }
}
