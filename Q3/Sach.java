
package Q3;

public class Sach extends TaiLieu{
    //Tên tác giả, Tên sách, số trang
    private String tgia;
    private String tensach;
    private int sotrang;

    public Sach() {
    }

    public Sach(String ma, String nxb, int soph, String tgia, String tensach, int sotrang) {
        super(ma, nxb, soph);
        this.tgia = tgia;
        this.tensach = tensach;
        this.sotrang = sotrang;
    }

    public String getTgia() {
        return tgia;
    }

    public void setTgia(String tgia) {
        this.tgia = tgia;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }

    @Override
    public String toString() {
        return super.getMa()+"\t"+super.getNxb()+"\t"+super.getSobph()+"\t"+getTgia()+"\t"+getTensach()+"\t"+getSotrang();
    }
    
}
