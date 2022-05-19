
package De1;

import java.util.Scanner;

/**
 *
 * @author Dung
 */
public class HangHoa {
    public int MaHang;
    public String Ten;
    public double GiaBan;

    public HangHoa() {
    }

    public HangHoa(int MaHang, String Ten, double GiaBan) {
        this.MaHang = MaHang;
        this.Ten = Ten;
        this.GiaBan = GiaBan;
    }

    public int getMaHang() {
        return MaHang;
    }

    public void setMaHang(int MaHang) {
        this.MaHang = MaHang;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(double GiaBan) {
        this.GiaBan = GiaBan;
    }

    public void display(){
        System.out.print(" Ma hang: "+this.MaHang+ " Ten: "+this.Ten+ " Gia ban: "+this.GiaBan);
    }
}
