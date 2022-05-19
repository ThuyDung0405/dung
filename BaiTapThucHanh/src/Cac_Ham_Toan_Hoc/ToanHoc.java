
package Cac_Ham_Toan_Hoc;

public class ToanHoc {
    
    // 1. kiem tra so nguyen to 
    public static boolean kiemtraNguyenTo(int k) {
        if (k < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(k); i++) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }
    //2. kiem tra so hoan hao 
     public static boolean kiemtraHoanHao(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++)// uoc so cua n luon nho hon n/2
        {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }

    }
     
     // 3. kiem tra so chinh phuong 
     public static boolean kiemtraSoChinhPhuong(int n) {
        int tmp = (int) Math.sqrt(n);
        if (tmp * tmp == n) {
            return true;
        }
        return false;
    }

     //4. tinh fibonacci
    public static int tinhFibo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n > 1) {
            return tinhFibo(n - 1) + tinhFibo(n - 2);
        }
        return 0;
    }
    
    //5. tinh tong day S1 = 1/2+2/3+...+(n-1)/n
    public static double tinhTong1(int n){
        float sum =0;
        for(int i=2;i<=n;i++){
            sum+=(double)(n-1)/n;
        } return sum;
    }
    
    // 6. tinh tong day S2 = 1!/(x+k)+2!/(x^2+k^2)+...+n!/(x^n+(-1)^(n+1)*k^n)
    public static int GiaiThua(int n){
        if(n==0||n==1) return 1;
        else return n*GiaiThua(n-1);
    }
    public static double soMu(double x,int n){
        if(n==0) return 0;
        else {
            if(n==1) return x;
            else {
                if(n<0){
                    return soMu(x,n+1)/x;
                }else return x*soMu(x,n-1);
            }
        }
    }
   
    public static double tinhTong2(int n,double x,double k){
        
        double sum =0;
        for(int i=1;i<n;i++ ){
            sum = sum +(GiaiThua(i)/(soMu(x,i)+soMu(-1,i+1)*soMu(k,i)));
        }return sum;
    }
   
    // 8. tinh tong day S3 = 1!+2!+3!+....+n!
     
    public static double tinhTong3(int n){
        float sum =0;
        if(n==1) return 1;
        for(int i=2;i<n;i++){
            sum+= (double)GiaiThua(i);
        }return sum;
    }
    
}
