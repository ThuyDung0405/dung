/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De_5;

/**
 *
 * @author Dung
 */
public class SinhVienMM extends SinhVien{
    private String donVi;
    private float luong;

    public SinhVienMM() {
        
    }

    public SinhVienMM(String maSV, String hoTen, String ngaySinh, String gioiTinh, Float diemTB, String donVi, float luong) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.donVi = donVi;
        this.luong = luong;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    
    public void hienThi(){
        super.hienThi();
        System.out.println("Don vi : "+this.getDonVi());
        System.out.println("Luong : "+this.getLuong());
    }
}
