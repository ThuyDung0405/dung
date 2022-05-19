/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De8;

/**
 *
 * @author Dung
 */
public class CauThu {
    protected int id;
    protected String ten;
    protected int namSinh;
    protected String viTri;

    public CauThu() {
    }

    public CauThu(int id, String ten, int namSinh, String viTri) {
        this.id = id;
        this.ten = ten;
        this.namSinh = namSinh;
        this.viTri = viTri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }
    
}
