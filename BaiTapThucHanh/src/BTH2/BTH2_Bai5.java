package BTH2;

import java.util.Scanner;

public class BTH2_Bai5 {

    int n;
// ham kiem tra so nguyen to 

    public static boolean laSoNguyenTo(int n) {
        while (n > 0) {
            if (n < 2) {
                return false;
            } else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

// ham kiem tra so hoan hao 
    public static boolean laSoHoanHao(int n) {
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

    // ham kiem tra so chinh phuong 
    public static boolean laSoChinhPhuong(int n) {
        int tmp = (int) Math.sqrt(n);
        if (tmp * tmp == n) {
            return true;
        }
        return false;
    }
    
// ham Fibonacci 
    public static int tinhFibo(int n){
        if(n==0) return 2 ;
        if (n==1) return 1;
        return tinhFibo(n-1)+tinhFibo(n-2);
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can kiem tra: ");
        int n = sc.nextInt();
//kiem tra so nguyen to 
        if (laSoNguyenTo(n)) {
            System.out.println(n + " la so nguyen to ");
        } else {
            System.out.println(n + " khong la so nguyen to");
        }
//kiem tra so hoan hao 
        if (laSoHoanHao(n)) {
            System.out.println(n + " la so hoan hao");
        } else {
            System.out.println(n + " ko phai so hoan hao ");
        }
//in so chinh phuong < n
        System.out.println("Cac so chinh phuong nho hon " +n+ " la: ");
        for (int i = 1; i < n; i++) {
            if (laSoChinhPhuong(i)) {
                System.out.printf("\t%d",i);
            }
        }
// tim phan tu thu n cua day Fibonacci
      
        System.out.println("\nSo Fibonacci thu "+n+" cua day la: "+tinhFibo(n));
    }
}
