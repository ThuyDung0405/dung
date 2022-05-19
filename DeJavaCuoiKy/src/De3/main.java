/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author arohigh
 */
public class main {

    public static void main(String[] args) {
        ArrayList dsSinhVien = new ArrayList();
        try {
            FileReader fr = new FileReader("nhanvien.dat");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] a = line.split("\\$");
                NhanVien nv = new NhanVien(a[0], a[1], a[2], a[3], a[4], Float.parseFloat(a[5]), Integer.parseInt(a[6]), Float.parseFloat(a[5]));
                dsSinhVien.add(nv);
            }
            br.close();
            fr.close();
            
            for (int i = 0; i < dsSinhVien.size(); i++) {
                NhanVien nv = (NhanVien) dsSinhVien.get(i);
                nv.HienThi();
            }
            
            Table3 tb3 = new Table3();
            tb3.setData(dsSinhVien);
            tb3.setVisible(true);
        } catch (Exception e) {
        }
    }
}
