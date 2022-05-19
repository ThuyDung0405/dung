
package Q3;

public class TaiLieu implements Comparable<TaiLieu> {
    // Mã tài liệu (không trùng), Tên nhà xuất bản, Số bản phát hành.
    private String ma;
    private String nxb;
    private int sobph;

    public TaiLieu() {
    }

    public TaiLieu(String ma, String nxb, int sobph) {
        this.ma = ma;
        this.nxb = nxb;
        this.sobph = sobph;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getSobph() {
        return sobph;
    }

    public void setSoph(int sobph) {
        this.sobph = sobph;
    }

    @Override
    public int compareTo(TaiLieu o) {
        //sap xep theo nxb-String
        return nxb.compareToIgnoreCase(o.nxb);
        //sap xep theo so phat hanh - int
        //return sobph - o.sobph;
    }
    
}
