
package CanBo;

import java.util.Scanner;

/**
 *
 * @author Dung
 */
public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu() {
    }

    public KySu(String nganhDaoTao, String hoTen, int namSinh, String gioiTinh, String diaChi, float heSoLuong) {
        super(hoTen, namSinh, gioiTinh, diaChi, heSoLuong);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }
    @Override
      public void nhap(){
          Scanner sc = new Scanner(System.in);
          super.nhap();
          System.out.print("Nhap nganh dao tao : ");
          nganhDaoTao = sc.nextLine();
      }  

    @Override
    public String toString() {
        System.out.print(super.toString());
        return ", nganhDaoTao=" + nganhDaoTao + '}';
    }
      
}
