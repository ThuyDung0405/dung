
package Q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QLTL implements ChucNang{
    private List<TaiLieu> list;
    Scanner in = new Scanner(System.in);
    public QLTL() {
        list = new ArrayList<>();
        list.add(new Sach("HN123", "Kim Dong", 20, "Nguyen Nhat Anh", "Nu Sinh", 65));
        list.add(new TapChi("HN345", "Me va be", 30, 4, 6));
        list.add(new Bao("HN365", "Nhan Dan", 15, 23));
    }
    
    private int tontai(String ma){
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getMa().equalsIgnoreCase(ma))
                return i;
        }
        return -1;
    }
    private TaiLieu nhap(){
//        private String ma;
//    private String nxb;
//    private int sobph;
    TaiLieu t = null;
    String ma;
    String reg = "HN\\d{3}";
    while(true){
        System.out.print("Nhap ma: ");
        ma = in.nextLine().toUpperCase();
        if(tontai(ma) == -1 && ma.matches(reg))
            break;
        else
            System.out.println("Nhap lai!!!");
    }
        System.out.print("Nhap ten nha xuat ban: ");
        String nxb = in.nextLine();
        System.out.print("Nhap so ban phat hanh: ");
        int sobph = Integer.parseInt(in.nextLine());
        t = new TaiLieu(ma, nxb, sobph);
        return t;
    }

    @Override
    public void nhapSach() {
        TaiLieu t = nhap();
        System.out.print("Nhap ten tac gia: ");
        String tgia = in.nextLine();
        System.out.print("Nhap ten sach: ");
        String tensach = in.nextLine();
        System.out.print("Nhap so trang sach: ");
        int sotrang = Integer.parseInt(in.nextLine());
        list.add(new Sach(t.getMa(), t.getNxb(), t.getSobph(), tgia, tensach, sotrang));
    }

    @Override
    public void nhapTapChi() {
        TaiLieu t = nhap();
        System.out.print("Nhap so phat hanh: ");
        int soph = Integer.parseInt(in.nextLine());
        System.out.print("Nhap thang phat hanh: ");
        int thangph = Integer.parseInt(in.nextLine());
        list.add(new TapChi(t.getMa(), t.getNxb(), t.getSobph(), soph, thangph));
    }

    @Override
    public void nhapBao() {
        TaiLieu t = nhap();
        System.out.print("Nhap ngay phat hanh: ");
        int ngayph = Integer.parseInt(in.nextLine());
        list.add(new Bao(t.getMa(), t.getNxb(), t.getSobph(), ngayph));
    }

    @Override
    public void inDanhSach() {
        System.out.println("--------------------DANH SACH--------------------");
        System.out.println("SACH");
        for(TaiLieu i:list){
            if(i instanceof Sach)
                System.out.println(i);
        }
        System.out.println("TAP CHI");
        for(TaiLieu i:list){
            if(i instanceof TapChi)
                System.out.println(i);
        }
        System.out.println("BAO");
        for(TaiLieu i:list){
            if(i instanceof Bao)
                System.out.println(i);
        }
        
        System.out.println("Tong so tai lieu: " + list.size());
    }

    @Override
    public void timkiemtheoMa() {
        System.out.print("Nhap ma can tim: ");
        String ma = in.nextLine();
        if(tontai(ma) == -1)
            System.out.println("Khong tim thay!!!");
        else
        {
            for(TaiLieu i:list)
            {
                if(i.getMa().equalsIgnoreCase(ma))
                    System.out.println(i);
            }
        }
    }

    @Override
    public void timkiemtheoTenNhaSX() {
        System.out.print("Nhap ten nha san xuat ban muon tim: ");
        String nsx = in.nextLine().trim();
        boolean check = true;
        for(TaiLieu i:list){
            if(i.getNxb().equalsIgnoreCase(nsx))
            {
                System.out.println(i);
                check = false;
            }
        }
        if(check == true)
            System.out.println("Khong tim thay!!!");
    }

    @Override
    public void timkiemtheoTenTG() {
        List<Sach> l = new ArrayList<>();
        for(TaiLieu i:list){
            if(i instanceof Sach)
                l.add((Sach)i);
        }
        System.out.print("Nhap ten tac gia ma ban muon tim: ");
        String tgia = in.nextLine().trim();
        boolean check = true;
        for(Sach i:l)
        {
            if(i.getTgia().equalsIgnoreCase(tgia))
            {
                System.out.println(i);
                check = false;
            }
        }
        if(check == true)
            System.out.println("Khong tim thay!!!");
    }

    @Override
    public void timkiemtheoTenSach() {
        List<Sach> l = new ArrayList<>();
        for(TaiLieu i:list){
            if(i instanceof Sach)
                l.add((Sach)i);
        }
        System.out.print("Nhap ten sach ma ban muon tim: ");
        String tensach = in.nextLine().trim();
        boolean check = true;
        for(Sach i:l)
        {
            if(i.getTensach().equalsIgnoreCase(tensach))
            {
                System.out.println(i);
                check = false;
            }
        }
        if(check == true)
            System.out.println("Khong tim thay!!!");
    }

    @Override
    public void timkiemtheoNgayPhatHanh() {
        List<Bao> l = new ArrayList<>();
        for(TaiLieu i:list){
            if(i instanceof Bao)
                l.add((Bao)i);
        }
        System.out.print("Nhap ngay phat hanh cuon sach ma ban muon tim: ");
        int ngayph = Integer.parseInt(in.nextLine());
        boolean check = true;
        for(Bao i:l){
            if(i.getNgayph() == ngayph)
            {
                System.out.println(i);
                check = false;
            }
        }
        if(check == true)
            System.out.println("Khong tim thay!!!");
    }

    @Override
    public void timkiemtheoKhoangtgian() {
        List<Bao> l = new ArrayList<>();
        for(TaiLieu i:list){
            if(i instanceof Bao)
                l.add((Bao)i);
        }
        System.out.print("Nhap khoang thoi gian phat hanh cuon sach ma ban muon tim(nhap cac so tu 1 -> 31): ");
        int t1 = Integer.parseInt(in.nextLine());
        int t2 = Integer.parseInt(in.nextLine());
        boolean check = true;
        for(Bao i:l){
            if(i.getNgayph() >= t1 && i.getNgayph() <= t2)
            {
                System.out.println(i);
                check = false;
            }
        }
        if(check == true)
            System.out.println("Khong tim thay!!!");
    }

    @Override
    public void timkiemtheoKhoangTrang() {
        List<Sach> l = new ArrayList<>();
        for(TaiLieu i:list){
            if(i instanceof Sach)
                l.add((Sach)i);
        }
        System.out.print("Nhap kich thuoc gan dung cua so trang cuon sach ban muon tim: ");
        int t1 = Integer.parseInt(in.nextLine());
        int t2 = Integer.parseInt(in.nextLine());
        boolean check = true;
        for(Sach i:l){
            if(i.getSotrang() >= t1 && i.getSotrang() <= t2)
            {
                System.out.println(i);
                check = false;
            }
        }
        if(check == true)
            System.out.println("Khong tim thay!!!");
    }

    @Override
    public void timkiemtheoKhoangSoPhatHanh() {
        List<TapChi> l = new ArrayList<>();
        for(TaiLieu i:list){
            if(i instanceof Sach)
                l.add((TapChi)i);
        }
        System.out.print("Nhap khoang so phat hanh cua tap chi ma ban muon tim: ");
        int t1 = Integer.parseInt(in.nextLine());
        int t2 = Integer.parseInt(in.nextLine());
        boolean check = true;
        for(TapChi i:l){
            if(i.getSoph() >= t1 && i.getSoph() <= t2)
            {
                System.out.println(i);
                check = false;
            }
        }
        if(check == true)
            System.out.println("Khong tim thay!!!");
    }

    @Override
    public void xoatheoMa() {
        System.out.print("Nhap ma muon xoa: ");
        String ma = in.nextLine();
        if(tontai(ma) == -1)
            System.out.println("Khong co de xoa.");
        else
        {
            list.remove(tontai(ma));
            System.out.println("Xoa thanh cong!!!");
        }
    }

    @Override
    public void suatheoMa() {
        System.out.print("Nhap ma muon sua: ");
        String ma = in.nextLine();
        if(tontai(ma) == -1)
            System.out.println("Khong co ma sua");
        else{
            TaiLieu p = list.get(tontai(ma));
            System.out.print("Nhap ten nha san xuat can sua: ");
            String nsx = in.nextLine();
            System.out.print("Nhap so ban phat hanh can sua: ");
            int sobph = Integer.parseInt(in.nextLine());
            p.setNxb(nsx);
            p.setSoph(sobph);
            System.out.println("Sua thanh cong!!!");
        }
    }

    @Override
    public void sapxeptheoTenNhaSX() {
        //Collections.sort(list);
        list.sort(new Comparator<TaiLieu>() {
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                String[] ten1 = o1.getNxb().toLowerCase().split("\\s+");
                String[] ten2 = o2.getNxb().toLowerCase().split("\\s+");
                String t1 = ten1[ten1.length-1], t2= ten2[ten2.length-1];
                if(t1.equalsIgnoreCase(t2)){
                    return o1.getNxb().compareToIgnoreCase(o2.getNxb());
                }
                else
                    return t1.compareToIgnoreCase(t2);
            }
        });
        System.out.println("Sap xep thanh cong");
    }

    @Override
    public void sapxeptheoSoPhatHanh() {
        list.sort(new Comparator<TaiLieu>() {
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                return Integer.compare(o1.getSobph(), o2.getSobph());
            }
        });
    }

    @Override
    public void sapxeptheoTenTG() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sapxeptheoTenSach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sapxeptheoSoTrang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sapxeptheoNgayPhatHanh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ThongKe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
