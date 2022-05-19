
package De1;
public class Person {

    protected String HoTen;
    protected String DiaChi;
    protected String GioiTinh;
    protected String NgaySinh;

    public Person(String HoTen, String Ngaysinh, String DiaChi, String Gioitinh) {  //phương thức khởi tạo
        this.HoTen = HoTen;
        this.NgaySinh = Ngaysinh;
        this.DiaChi = DiaChi;
        this.GioiTinh = Gioitinh;
    }
    
    public void In(){   //hiển thị thông tin
        System.out.println("-------------------------------");
        System.out.println("Ho ten: "+this.HoTen);
        System.out.println("Ngay sinh: "+this.NgaySinh);
        System.out.println("Dia chi: "+this.DiaChi);
        System.out.println("Gioi tinh: "+this.GioiTinh);
    }
}
