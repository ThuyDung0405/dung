/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlytk;

/**
 *
 * @author PC
 */
public class ThongtinTK {
    private long stk;
    private String tenTK;
    private Double soTien;

    public ThongtinTK() {
    }

    public ThongtinTK(long stk, String tenTK, Double soTien) {
        this.stk = stk;
        this.tenTK = tenTK;
        this.soTien = soTien;
    }

    public long getStk() {
        return stk;
    }

    public void setStk(long stk) {
        this.stk = stk;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public Double getSoTien() {
        return soTien;
    }

    public void setSoTien(Double soTien) {
        this.soTien = soTien;
    }

    @Override
    public String toString() {
        return stk + "\t" + tenTK + "\t" + soTien;
    }
    
}
