/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De_1;

/**
 *
 * @author Dung
 */
public class Student extends Person_De_1{
    private String maSV;
    private String email;
    private float diemTK;

    public Student(){
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

    public float getDiemTK() {
        return diemTK;
    }

    public void setDiemTK(float diemTK) {
        this.diemTK = diemTK;
    }
    public void display(){
        super.display();
        System.out.println("Ma SV : "+this.maSV);
        System.out.println("Email : "+this.email);
        System.out.println("Diem tong ket : "+this.diemTK);
    }
}
