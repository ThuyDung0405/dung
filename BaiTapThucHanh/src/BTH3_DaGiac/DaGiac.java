
package BTH3_DaGiac;

import java.util.Arrays;
import java.util.Scanner;

public class DaGiac {

    protected int soCanh;
    protected int a[];

    public DaGiac() {

    }

    public DaGiac(int soCanh, int a[]) {
        this.soCanh = soCanh;
        this.a = a;
    }

    public int tinhChuVi() {
        int chuvi = 0;
        for (int i = 0; i < this.soCanh; i++) {
            chuvi = chuvi + a[i];
        }
        return chuvi;
    }
     public void nhapDG(){
         Scanner sc = new Scanner(System.in);
         do{
             System.out.println("Nhap vao so canh: ");
             this.soCanh = sc.nextInt();
         }while(this.soCanh<=2);
         for(int i=0;i<this.soCanh;i++){
             System.out.println("Nhap canh thu "+(i+1)+": ");
             this.a[i] = sc.nextInt();
             
         }
     }
     public int chuVi(){
         int chuvi =0;
         for(int i=0;i<this.soCanh;i++){
             chuvi += this.a[i];
         }return chuvi;
         
     }

    @Override
    public String toString() {
        return "DaGiac{" + "soCanh=" + soCanh + ", a=" + Arrays.toString(a) + '}';
    }
    public void xuatDG(){
        System.out.println("Do dai cac canh: ");
        for(int i=0;i<this.soCanh;i++){
            if(i<(this.soCanh-1)){
                System.out.print(this.a[i]+"   ");
            }else System.out.print(+this.a[i]);
        }
    }

}
