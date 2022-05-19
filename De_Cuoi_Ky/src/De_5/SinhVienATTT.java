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
public class SinhVienATTT extends SinhVien{
    private float hocPhi;

    public SinhVienATTT() {
    }

    public SinhVienATTT( String maSV, String hoTen, String ngaySinh, String gioiTinh,Float diemTB, float hocPhi) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.hocPhi = hocPhi;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }
    
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("Hoc phi : "+ this.getHocPhi());
    }
}
