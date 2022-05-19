/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De5;

/**
 *
 * @author arohigh
 */
public class SinhVienMatMa extends SinhVien {

    private String DonVi;
    private Float Luong;
    
    public String getDonVi() {
        return DonVi;
    }
    
    public void setDonVi(String DonVi) {
        this.DonVi = DonVi;
    }
    
    public Float getLuong() {
        return Luong;
    }
    
    public void setLuong(Float Luong) {
        this.Luong = Luong;
    }
    
    public SinhVienMatMa(String masv, String hoten, String ngaysinh, String gioitinh, Float dtb, String donvi, Float luong) {
        super(masv, hoten, ngaysinh, gioitinh, dtb);
        this.setDonVi(donvi);
        this.setLuong(luong);
    }
    
}
