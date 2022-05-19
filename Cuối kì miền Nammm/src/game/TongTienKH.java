/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import static game.HoaDon.hdList;
import static game.KhachHang.khList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author hoaianh_Kyros
 */
public class TongTienKH {
    static ArrayList<TongTienKH> vipList = new ArrayList<>();
    private String maKH;
    private float tongTien;

    public TongTienKH() {
    }

    public TongTienKH(String maKH, float tongTien) {
        this.maKH = maKH;
        this.tongTien = tongTien;
    }

    public static ArrayList<TongTienKH> getVipList() {
        return vipList;
    }

    public static void setVipList(ArrayList<TongTienKH> vipList) {
        TongTienKH.vipList = vipList;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }
    
    public void hienThi()
    {
        System.out.print("Ma KH: " + this.getMaKH() 
                + "; Tong tien: " + this.getTongTien());
    }
    public static void hienThiVIP()
    {
        System.out.println("\tThong ke khach hang");
        for(TongTienKH x:vipList)
        {
            x.hienThi();
            System.out.println("");
        }
    }

    public static KhachHang khVIP()
    {
        KhachHang a = null;
        Collections.sort(vipList, new Comparator<TongTienKH>(){
            @Override
            public int compare(TongTienKH o1, TongTienKH o2) {
                return o1.tongTien < o2.tongTien ? -1 : 1;
            }
        });
        for(KhachHang x:khList)
        {
            if(x.getMaKH().equalsIgnoreCase(hdList.get(0).getMaKH()))
                return a = x;
        }
        return a;
    }
}
