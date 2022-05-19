package BTH3_DaGiac;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TamGiac TG = new TamGiac();
        TG.nhapTG();
        TG.xuatTG();
        System.out.println("\nChu vi cua tam giac la: " + TG.tinhChuVi());
        System.out.println("Dien tich cua tam giac la: " + TG.tinhDienTich());
    }

}
