/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dung
 */
public class main {

    public static void main(String[] args) {
        ArrayList<ThiSinh> tsList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so luong sinh vien: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int choose;
            System.out.println("Nhap thi sinh thu : " + (i + 1));
            System.out.println("Thi sinh tren thuoc khoi nao? ");
            System.out.println("1. Thi sinh khoi A ");
            System.out.println("2. Thi sinh khoi C ");
            do {
                System.out.print("Your choose : ");
                choose = sc.nextInt();
                if (choose != 1 && choose != 2) {
                    System.out.println("Vui long nhap lai! ");
                }
            } while (choose != 1 && choose != 2);
            if(choose==1){
                ThiSinh a = new KhoiA();
                a.nhap();
                tsList.add(a);
            }else if(choose ==2){
                ThiSinh c = new KhoiC();
                c.nhap();
                tsList.add(c);
            }
        } System.out.println("Danh sach thi sinh co tong diem > 20 ");
        for(ThiSinh x : tsList){
            if(x.check()){
                x.in();
                System.out.println("");
            }
        }
    }
}
