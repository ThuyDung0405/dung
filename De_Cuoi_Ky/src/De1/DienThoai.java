
package De1;

public class DienThoai extends HangHoa{
    private String NhaSX;
    private int dungLuong;
    private String mauSac;

    public DienThoai() {
        super();
    }

    public DienThoai(String NhaSX, int dungLuong, String mauSac, int MaHang, String Ten, double GiaBan) {
        super(MaHang, Ten, GiaBan);
        this.NhaSX = NhaSX;
        this.dungLuong = dungLuong;
        this.mauSac = mauSac;
    }

    public String getNhaSX() {
        return NhaSX;
    }

    public void setNhaSX(String NhaSX) {
        this.NhaSX = NhaSX;
    }

    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

   
    @Override
    public void display(){
        super.display();
        System.out.println(" Nha SX: "+this.NhaSX+ " Dung luong: "+this.dungLuong+ " Mau sac: "+this.mauSac);
    }
    
}
