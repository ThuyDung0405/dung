
package BTH3_DaGiac;

import java.util.Scanner;

public class TamGiac extends DaGiac {
    TamGiac()
    {
        this.a=new int[3];  
        this.soCanh=3;
    }
    public void nhapTG(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap 3 canh tam giac ");
            for(int i=0;i<3;i++){
                System.out.println("Nhap canh thu "+(i+1)+":");
                this.a[i] = sc.nextInt();
            }
        }while(a[0]+a[1]<=a[2]|| a[0]+a[2]<=a[1]||a[1]+a[2]<=a[0]);
    }
    @Override
    public int  tinhChuVi()
    {
        int chuvi=0;
        for(int i=0;i < 3;i++)
             chuvi += this.a[i];
            
        return chuvi;
    }
    public double tinhDienTich(){
        double dientich =0;
        int A = a[0];
        int B = a[1];
        int C = a[2];
        double p = (A+B+C)/2;
        dientich = Math.sqrt(p*(p-A)*(p-B)*(p-C));
        return dientich;
        
    }
    public void xuatTG(){
        super.xuatDG();
    }
    
    
}
