
package KiemTra;

public class Student extends Person{
    private String maSV;
    private String email;
    private Float diemTK;

    public Student() {
    }

    public Student(String hoTen, String ngaySinh, String diaChi, String gioiTinh,String maSV, String email, float diemTK) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maSV = maSV;
        this.email = email;
        this.diemTK = diemTK;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getDiemTK() {
        return diemTK;
    }

    public void setDiemTK(Float diemTK) {
        this.diemTK = diemTK;
    }
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("Ma SV : "+this.maSV);
        System.out.println("Email : "+this.email);
        System.out.println("Diem tong ket : "+diemTK);
    }
}
