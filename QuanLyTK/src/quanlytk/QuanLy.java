/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlytk;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class QuanLy implements IChucNang {

    private List<ThongtinTK> list;
    Scanner sc = new Scanner(System.in);

    public QuanLy() {
        list = new ArrayList<>();
        list.add(new ThongtinTK(123, "Nguyen Thi Hanh", 50.0));
        list.add(new ThongtinTK(124, "Nguyen Thi Thuy Dung", 50.0));
        list.add(new ThongtinTK(125, "Nguyen Duy Thanh", 50.0));
        
    }

    public int check(long s) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStk() == s) {
                return i;
            }
        }
        return -1;

    }

    public void nhap(ThongtinTK a) {
        long s;
        while (true) {
            System.out.print("Nhap stk:");
            s = sc.nextLong();
            if (check(s) == -1) {
                break;
            } else {
                System.out.println("Nhap lai!!!");
            }
        }

        sc.nextLine();
        System.out.print("Nhap ten tk: ");
        String ten = sc.nextLine();
        a = new ThongtinTK(s, ten, 50.0);
        list.add(a);
    }

    @Override
    public void Nhap2ThongTinTK() {
        ThongtinTK a = new ThongtinTK();
        ThongtinTK b = new ThongtinTK();
        nhap(a);
        nhap(b);
    }

    @Override
    public void XuatTT() {
        for (ThongtinTK i : list) {
            System.out.println(i.toString());
        }
    }

    public ThongtinTK getTKbySTK(long stk) {
        for (ThongtinTK i : list) {
            if (i.getStk() == stk) {
                return i;
            }
        }
        return null;
    }

    @Override
    public void NapTien() {
        ThongtinTK tk = null;
        System.out.print("Nhap stk ma ban muon nap:");
        long s = sc.nextLong();
        Double sotiennap = 0.0;
            if (check(s) != -1) {
                System.out.print("Nhap so tien ma ban muon nap: ");
                sotiennap = sc.nextDouble();
                Double sotienbandau = getTKbySTK(s).getSoTien();
                getTKbySTK(s).setSoTien(sotienbandau + sotiennap);
                tk = new ThongtinTK(s, getTKbySTK(s).getTenTK(), getTKbySTK(s).getSoTien());
                list.set(check(s), tk);
                System.out.println("Nap tien thanh cong!!!");
            } else {
                System.out.println("Khong ton tai stk ma ban can tim");
            }
    }

    @Override
    public void RutTien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DaoHan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CK() {
        System.out.print("Nhap ten muon tim kiem: ");
        String key = sc.nextLine();
        List<ThongtinTK> list1 = new ArrayList<>();
        for(ThongtinTK i:list){
            if(i.getTenTK().toLowerCase().contains(key.toLowerCase()))
                list1.add(i);
        }
        if(list1.size() == 0)
            System.out.println("Khong tim thay ten khach hang");
        else{
            for(ThongtinTK i:list1)
            {
                System.out.println(i.toString());
            }
        }
    }

    @Override
    public void SX() {
        list.sort(new Comparator<ThongtinTK>() {
            @Override
            public int compare(ThongtinTK o1, ThongtinTK o2) {
                String[] ten1 = o1.getTenTK().toLowerCase().split("\\s+");
                String[] ten2 = o2.getTenTK().toLowerCase().split("\\s+");
                String t1 = ten1[ten1.length-1];
                String t2 = ten2[ten2.length-1];
                if(t1.equalsIgnoreCase(t2))
                    return o1.getTenTK().compareToIgnoreCase(o2.getTenTK());
                else
                    return t1.compareToIgnoreCase(t2);
                                                   
            }
        });
        list.sort(new Comparator<ThongtinTK>() {
            @Override
            public int compare(ThongtinTK o1, ThongtinTK o2) {
                return Double.compare(o1.getSoTien(), o2.getSoTien());
                
            }
        });
    }

}
