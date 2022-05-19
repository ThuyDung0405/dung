package Phan_So;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<PhanSo> phanSoList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so luong phan so : ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Ban phai nhap so luong > 0. Vui long nhap lai");
            }
        } while (n <= 0);
        for(int i=0;i<n;i++){
            System.out.println("=========== Phan so thu "+(i+1)+" : ==============");
            PhanSo ps = new PhanSo();
            ps.taoPS();
            phanSoList.add(ps);
        }
        for(PhanSo x : phanSoList){
            x.hienThi();
        }
        
    }
}
