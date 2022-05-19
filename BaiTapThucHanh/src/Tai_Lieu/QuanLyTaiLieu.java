package Tai_Lieu;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyTaiLieu {

    static ArrayList<TaiLieu> listTL ;
    public QuanLyTaiLieu(){
        listTL = new ArrayList<>();
        listTL.add(new Sach("dung", 10, "s01", "kd", 100));
        listTL.add(new TapChi(10, 1, "tl01", "d", 10));
        listTL.add(new BaoChi("12/1/2021", "bc01", "h", 12));
        
   }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, chon;
        do {
            System.out.println("==================MENU====================");
            System.out.println("1. Nhap thong tin tai lieu");
            System.out.println("2. Hien thi danh sach tai lieu");
            System.out.println("3. Tim kiem tai lieu theo loai");
            System.out.println("4. Tim kiem tai lieu theo ma");
            System.out.println("0. Thoat");
            System.out.print("Ban chon: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    do {
                        System.out.print("Nhap so luong tai lieu ban muon them: ");
                        n = sc.nextInt();
                        if (n <= 0) {
                            System.out.println("So tai lieu phai > 0. Vui long nhap lai");
                        }
                    } while (n <= 0);
                    for (int i = 0; i < n; i++) {
                        int choice;
                        do {
                            System.out.println("==========Nhap tai lieu thu " + (i + 1) + "==========");
                            System.out.println("1. Sach");
                            System.out.println("2. Tap chi");
                            System.out.println("3. Bao chi");
                            System.out.print("Ban chon : ");
                            choice = sc.nextInt();
                            if (choice < 1 || choice > 3) {
                                System.out.println("Lua chon khong dung. Vui long nhap lai");
                            }
                            switch (choice) {
                                case 1:
                                    TaiLieu a = new Sach();
                                    a.nhap();
                                    listTL.add(a);
                                    System.out.println("Them tai lieu thanh cong !!!");
                                    break;
                                case 2:
                                    TaiLieu b = new TapChi();
                                    b.nhap();
                                    listTL.add(b);
                                    System.out.println("Them tai lieu thanh cong !!!");
                                    break;
                                case 3:
                                    TaiLieu c = new BaoChi();
                                    c.nhap();
                                    listTL.add(c);
                                    System.out.println("Them tai lieu thanh cong !!!");
                                    break;
                            }
                        } while (choice < 1 || choice > 3);
                    }
                    break;
                case 2:
                    for (TaiLieu x : listTL) {
                        x.hienThi();
                    }
                    break;
                case 3:
                    System.out.print("Nhap loai tai lieu ban muon tim : ");
                    String loai = sc.nextLine();
                    timLoaiTL(loai);
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }
        } while (chon != 0);

    }

    public static void timLoaiTL(String loai) {
        ArrayList<TaiLieu> list1 = new ArrayList<>();
        for (TaiLieu tl : listTL) {
            if (loai.equalsIgnoreCase("Sach") && (tl instanceof Sach)) {
                list1.add(tl);
            } else if (loai.equalsIgnoreCase("Tap Chi") && (tl instanceof TapChi)) {
                list1.add(tl);
            } else if (loai.equalsIgnoreCase("Bao Chi") && (tl instanceof BaoChi)) {
                list1.add(tl);
            }
        }
    }

    public static void timKiem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten muon tim kiem: ");
        String key = sc.nextLine();
        ArrayList<TaiLieu> list = new ArrayList<>();
        for (TaiLieu x : listTL) {
            if (x.getMaTL().toLowerCase().contains(key.toLowerCase())) {
                list.add(x);
            }
        }
        if (list.size() == 0) {
            System.out.println("Khong tim thay ten can bo");
        } else {
            for (TaiLieu x : list) {
                x.hienThi();
            }
        }
    }
}
