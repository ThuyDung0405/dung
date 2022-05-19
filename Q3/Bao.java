
package Q3;


public class Bao extends TaiLieu{
    // ngày phát hành. (Date)
    private int ngayph;

    public Bao() {
    }

    public Bao(String ma, String nxb, int sobph, int ngayph) {
        super(ma, nxb, sobph);
        this.ngayph = ngayph;
    }

    public int getNgayph() {
        return ngayph;
    }

    public void setNgayph(int ngayph) {
        this.ngayph = ngayph;
    }

    @Override
    public String toString() {
        return super.getMa()+"\t"+super.getNxb()+"\t"+super.getSobph()+"\t"+getNgayph();
    }
    
}
