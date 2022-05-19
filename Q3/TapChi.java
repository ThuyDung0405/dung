
package Q3;


public class TapChi extends TaiLieu{
    //Số phát hành, tháng phát hành
    private int soph;
    private int thangph;

    public TapChi() {
    }

    public TapChi(String ma, String nxb, int sobph, int soph, int thangph) {
        super(ma, nxb, sobph);
        this.soph = soph;
        this.thangph = thangph;
    }

    public int getSoph() {
        return soph;
    }

    public void setSoph(int soph) {
        this.soph = soph;
    }

    public int getThangph() {
        return thangph;
    }

    public void setThangph(int thangph) {
        this.thangph = thangph;
    }

    @Override
    public String toString() {
        return super.getMa()+"\t"+super.getNxb()+"\t"+super.getSobph()+"\t"+getSoph()+"\t"+getThangph();
    }
    
}
