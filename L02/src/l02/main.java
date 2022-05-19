
package l02;

import java.util.Scanner;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {            
            System.out.println("\t==MENU CAC CHUC NANG==");
            System.out.println("1. Nhap thong tin tai khoan");
            System.out.println("2. Xuat thong tin danh dach tai khoan");
            System.out.println("3. Nap tien");
            System.out.println("4. Rut tien");
            System.out.println("5. Dao han");
            System.out.println("6. Chuyen khoan");
            System.out.println("0. Thoat");
            System.out.print("Ban chon: ");
            chon = sc.nextInt();
            switch(chon)
            {
                case 1: 
                        System.out.println("==Thong tin tai khoan==");
                        Account a = new Account();
                        a.nhapTT();
                        Account.acList.add(a);
                        break;
                case 2: 
                        for(Account x: Account.acList)
                        {
                            System.out.println(x.toString());
                        }
                        break;
                case 3: 
                        long stk;
                        do {            
                            System.out.print("Nhap so tk muon nap tien: ");
                            stk = sc.nextLong();
                            if(!Account.checkSTK(stk))
                            {
                                System.out.println("So tai khoan khong ton tai. Vui long nhap lai");
                            }
                        } while (!Account.checkSTK(stk));
                        Account.getAccount(stk).napTien();
                        break;
                case 4: 
                        long stk1;
                        do {            
                            System.out.print("Nhap so tk muon rut tien: ");
                            stk1 = sc.nextLong();
                            if(!Account.checkSTK(stk1))
                            {
                                System.out.println("So tai khoan khong ton tai. Vui long nhap lai");
                            }
                        } while (!Account.checkSTK(stk1));
                        Account.getAccount(stk1).rutTien();
                        break;
                        
                case 5:
                        long stk2;
                        do {            
                            System.out.print("Nhap so tk muon dao han: ");
                            stk2 = sc.nextLong();
                            if(!Account.checkSTK(stk2))
                            {
                                System.out.println("So tai khoan khong ton tai. Vui long nhap lai");
                            }
                        } while (!Account.checkSTK(stk2));
                        Account.getAccount(stk2).daoHan();
                        break;
                case 6:
                        Account.chuyenKhoan();
                        break;
                case 0:
                    System.out.println("==Thanh you very much==");
                    break;
                default:
                    System.out.println("Cu phap khong hop le. Vui long nhap lai");
                    break;
                    
            }
            
        } while (chon != 0);
    }
    
}
