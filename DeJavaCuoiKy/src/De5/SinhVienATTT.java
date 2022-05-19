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
public class SinhVienATTT extends SinhVien {

    private Float HocPhi;

    public Float getHocPhi() {
        return HocPhi;
    }

    public void setHocPhi(Float HocPhi) {
        this.HocPhi = HocPhi;
    }

    public SinhVienATTT(String masv, String hoten, String ngaysinh, String gioitinh, Float dtb, Float hocphi) {
        super(masv, hoten, ngaysinh, gioitinh, dtb);
        this.setHocPhi(hocphi);
    }

    public void HienThi() {
        super.HienThi();
        System.out.println("Hoc phi: " + this.getHocPhi());
    }

}
