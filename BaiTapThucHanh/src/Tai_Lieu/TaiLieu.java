//  Một thư viện cần quản lý các tài liệu bao gồm: Sách, Tạp chí, Báo
//
//-Mỗi tài liệu có các thuộc tính: Mã tài liệu, Tên nhà xuất bản, Số bản phát hành.
//-Các loại sách cần quản lý: Tên tác giả, số trang
//-Các tạp chí cần quản lý: Số phát hành, tháng phát hành
//-Các báo cần quản lý: ngày phát hành.
//1. Xây dựng các lớp để quản lý các loại tài liệu trên sao cho việc sử dụng lại được nhiều nhất
//2. Xây dựng lớp QuanLySach cài đặt các phương thức thực hiện các công việc sau:
//3. Nhập thông tin về các tài liệu
//4. Tìm kiếm tài liệu theo loại (sách, báo, tạp chí) hoặc theo mã tài liệu
//5. Hiển thị thông tin tài liệu tìm kiếm được

package Tai_Lieu;

import java.util.Scanner;

public class TaiLieu {
    protected String maTL;
    protected String tenNXB;
    protected int soBanPH;

    public TaiLieu() {
    }

    public TaiLieu(String maTL, String tenNXB, int soBanPH) {
        this.maTL = maTL;
        this.tenNXB = tenNXB;
        this.soBanPH = soBanPH;
    }

    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBanPH() {
        return soBanPH;
    }

    public void setSoBanPH(int soBanPH) {
        this.soBanPH = soBanPH;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma tai lieu : ");
        maTL = sc.nextLine();
        System.out.print("Nhap ten nha xuat ban : ");
        tenNXB = sc.nextLine();
        int n;
       do{
        System.out.print("Nhap so ban phat hanh : ");
        n = sc.nextInt();
        if(n<=0){
            System.out.println("So ban phat hanh phai > 0. Vui long nhap lai");
        }
       }while(n<=0);
       this.setSoBanPH(n);
    }
    public void hienThi(){
        System.out.print("Ma tai lieu : "+this.getMaTL()+"\t"+" Ten nha xuat ban : "+this.getTenNXB()+"\t"+" So ban phat hanh : "+this.getSoBanPH());
    }
}
