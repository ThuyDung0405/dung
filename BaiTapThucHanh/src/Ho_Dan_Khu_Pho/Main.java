
package Ho_Dan_Khu_Pho;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HoDan> listHoDan = new ArrayList<>();
        int soHoDan, thuTuHoDan = 1;
        do{
            System.out.println("Nhap so ho dan : ");
            soHoDan = sc.nextInt();
            if(soHoDan<=0){
                System.out.println("So ho dan khong hop le. Vui long nhap lai");
            }
        }while(soHoDan<=0);
        for(int i=0;i<soHoDan;i++){
            System.out.println("================Nhap thong tin ho dan so "+(i+1)+"================ ");
            HoDan a = new HoDan();
            a.nhap();
            listHoDan.add(a);
        }
        System.out.println("Thong tin cac ho dan ");
        for(HoDan x : listHoDan){
            System.out.println("================Ho dan so "+(thuTuHoDan++)+"===============");
            x.hienThi();
        }
    }
}
