
package De_3;

public class Person {
    protected String hoTen;
    protected String ngaySinh;
    protected String gioiTinh;
    protected String diaChi;

    public Person() {
    }

    public Person(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
    public void hienThi(){
        System.out.println("Ho ten : "+hoTen);
        System.out.println("Ngay sinh : "+ngaySinh);
        System.out.println("Gioi tinh : "+gioiTinh);
        System.out.println("Dia chi : "+diaChi);
    }
}
