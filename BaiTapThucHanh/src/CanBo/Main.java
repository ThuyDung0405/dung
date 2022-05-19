package CanBo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<CanBo> canboList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, chon;
        do {
            System.out.println("==================MENU====================");
            System.out.println("1. Nhap thong tin moi cho can bo");
            System.out.println("2. Hien thi danh sach can bo");
            System.out.println("3. Tim kiem can bo theo ten");
            System.out.println("0. Thoat");
            System.out.print("Ban chon: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    do {
                        System.out.print("Nhap so luong can bo ban muon them: ");
                        n = sc.nextInt();
                        if (n <= 0) {
                            System.out.println("So can bo phai > 0. Vui long nhap lai");
                        }
                    } while (n <= 0);
                    for (int i = 0; i < n; i++) {
                        int choice;
                        do {
                            System.out.println("==========Nhap can bo thu " + (i + 1) + "==========");
                            System.out.println("1.Cong nhan");
                            System.out.println("2.Ky su");
                            System.out.println("3.Nhan vien");
                            System.out.print("Ban chon : ");
                            choice = sc.nextInt();
                            if (choice < 1 || choice > 3) {
                                System.out.println("Vui long nhap lai");
                            }
                        } while (choice < 1 || choice > 3);
                        switch (choice) {
                            case 1:
                                CanBo a = new CongNhan();
                                a.nhap();
                                canboList.add(a);
                                System.out.println("Them can bo thanh cong");
                                break;
                            case 2:
                                CanBo b = new KySu();
                                b.nhap();
                                canboList.add(b);
                                System.out.println("Them can bo thanh cong");
                                break;
                            case 3:
                                CanBo c = new NhanVien();
                                c.nhap();
                                canboList.add(c);
                                System.out.println("Them can bo thanh cong");
                                break;
                        }
                    }
                    break;
                case 2:
                    for (CanBo x : canboList) {
                        System.out.println(x.toString());
                    }
                    break;
                case 3:
                    timKiem();
                    break;
                case 0:
                    System.out.println("Bye!!!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long nhap lai");
                    break;
            }

        } while (chon != 0);
    }

    public static void timKiem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten muon tim kiem: ");
        String key = sc.nextLine();
        ArrayList<CanBo> list = new ArrayList<>();
        for (CanBo x : canboList) {
            if (x.getHoTen().toLowerCase().contains(key.toLowerCase())) {
                list.add(x);
            }
        }
        if (list.size() == 0) {
            System.out.println("Khong tim thay ten can bo");
        } else {
            for (CanBo x : list) {
                System.out.println(x.toString());
            }
        }
    }

}
