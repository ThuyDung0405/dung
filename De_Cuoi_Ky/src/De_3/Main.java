
package De_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dung
 */
public class Main {

    public static void main(String[] args) {
//        List <NhanVien> listnv = new ArrayList<>();
        ArrayList listnv = new ArrayList();
        String filename = "nhanvien.dat"; //hoac "src/De_3/nhanvien.dat"
        BufferedReader br = null;
        try {
            
            br = new BufferedReader(new FileReader(filename));
            //doc file o day
            String s = null;
            while ((s = br.readLine()) != null) { //doc lan luot tung dong, het dong nay xuong dong duoi, s = dong buffedreader vua doc
                String[] array = s.split("\\$");
                NhanVien nv = new NhanVien(array[0], array[1], array[2], array[3], array[4], Float.parseFloat(array[5]), Integer.parseInt(array[6]), Float.parseFloat(array[7]));
                listnv.add(nv);
            }
            br.close();
            
        } catch (IOException e) {
            System.out.println(e);
        }catch(NumberFormatException e){
            System.out.println(e);
        }
//        //hien thi danh sach nhan vien len man hinh console 
//        for (int i = 0; i < listnv.size(); i++) {
//            NhanVien nv = (NhanVien)listnv.get(i);
//            nv.hienThi();
//        }
         Table tb = new Table();
         tb.setVisible(true);
         tb.setData(listnv); 
    }
}
