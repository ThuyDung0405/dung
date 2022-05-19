package BTH3_Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Ban muon nhap may ho gia dinh: ");
        n = sc.nextInt();
        //Tao ds cac ho gia dinh
        ArrayList<BienLai> arr = new ArrayList<>();
       BienLai a = new BienLai();
        for(int i = 0;i<n;i++){
         
            System.out.println("============Nhap vao ho gia dinh thu"+(i+1)+"===================");
            a.nhapBL();
            arr.add(a);
        }
        for(BienLai x:arr){
            
            System.out.println(x.toString());
        }
    }
}
