package Ho_Dan_Khu_Pho;

import BTH5_Bai1.NhanSu;
import java.awt.AWTEventMulticaster;
import java.util.ArrayList;
import java.util.Scanner;

public class HoDan {

    private int soNguoi;
    private int soNha;
    ArrayList<CaNhan> listNguoi = new ArrayList<>();

    public HoDan() {
    }

    public HoDan(int soNguoi, int soNha) {
        this.soNguoi = soNguoi;
        this.soNha = soNha;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public ArrayList<CaNhan> getListNguoi() {
        return listNguoi;
    }

    public void setListNguoi(ArrayList<CaNhan> listNguoi) {
        this.listNguoi = listNguoi;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            System.out.print("Nhap so nguoi : ");
            a = sc.nextInt();
            if (a <= 0) {
                System.out.println("So nguoi khong hop le. Vui long nhap lai!");
            }
        } while (a <= 0);
        this.soNguoi = a;
        int b;
        do {
            System.out.print("Nhap so nha : ");
            b = sc.nextInt();
            if (b <= 0) {
                System.out.println("So nha khong hop le. Vui long nhap lai!");
            }
        } while (b <= 0);
        this.soNha = b;
        sc.nextLine();
        for (int i = 0; i < this.getSoNguoi(); i++) {
            System.out.println("=======Nhap nguoi thu " + (i + 1) + "==========");
            CaNhan cn = new CaNhan();
            cn.nhap();
            listNguoi.add(cn);
        
        }
    }
    public void hienThi(){
        System.out.println("So nguoi : "+this.getSoNguoi()+ "\t"+" So nha : "+this.getSoNha());
        System.out.println("=================================================================");
        System.out.println("Thong tin nguoi trong ho ");
        for(CaNhan x: listNguoi){
            x.hienThi();
        }
    }
}
