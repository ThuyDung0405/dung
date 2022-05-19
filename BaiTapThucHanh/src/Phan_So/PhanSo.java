
package Phan_So;

import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    public void taoPS(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu so : ");
        this.setTuSo(sc.nextInt());
        do{
        System.out.print("Nhap mau so : ");
        this.setMauSo(sc.nextInt());
        if(this.getMauSo()==0){
            System.out.println("Mau so khong hop le. Ban vui long thu lai!");
        }
        }while(this.getMauSo()==0);
    }
    public int UCLN(int a, int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }else b = b-a;
        }return a; 
    }
    public void rutGonPS(){
        int a = this.tuSo;
        int b = this.mauSo;
        this.setTuSo(a/this.UCLN(Math.abs(a),Math.abs(b)));
        this.setMauSo(b/this.UCLN(Math.abs(a),Math.abs(b)));
        System.out.println(this.getTuSo()+"/"+this.getMauSo());
    }
    public void rutGonPS(PhanSo ps){
        int a = ps.tuSo;
        int b = ps.mauSo;
        ps.setTuSo(a/this.UCLN(Math.abs(a), Math.abs(b)));
        ps.setMauSo(b/this.UCLN(Math.abs(a), Math.abs(b)));
    }
    public void congPS(PhanSo ps){
        PhanSo kq = new PhanSo();
        kq.setTuSo(this.tuSo*ps.mauSo+this.mauSo*ps.tuSo);
        kq.setMauSo(this.mauSo*ps.mauSo);
        this.rutGonPS(kq);
        kq.hienThi();
    }
    public void truPS(PhanSo ps){
        PhanSo kq = new PhanSo();
        kq.setTuSo(this.tuSo*ps.mauSo - this.mauSo*ps.tuSo);
        kq.setMauSo(this.mauSo*ps.mauSo);
        this.rutGonPS(ps);
        kq.hienThi();
    }
    
    public void nhan(PhanSo ps){
       PhanSo kq = new PhanSo();
       kq.setTuSo(this.tuSo*ps.tuSo);
       kq.setTuSo(this.mauSo*ps.mauSo);
       this.rutGonPS(kq);
       kq.hienThi();
    }
    public void chia(PhanSo ps){
        PhanSo kq = new PhanSo();
        kq.setTuSo(this.tuSo*ps.mauSo);
        kq.setMauSo(this.mauSo*ps.tuSo);
        this.rutGonPS(ps);
        kq.hienThi();
    }
    public boolean checkToiGian(){
        if(this.UCLN(Math.abs(this.tuSo), Math.abs(this.mauSo))==1 || this.tuSo==0){
            return true;
        }return false;
    }
    
    public void hienThi(){
        if(this.tuSo==0){
            System.out.println("0");
        }else {
            this.rutGonPS();
        }
    }
}
