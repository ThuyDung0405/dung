
package BTH2;

import java.util.Scanner;

public class BTH2_Bai1_NangCao {
    public static void main(String[] args) {
        int n, giaithua = 1;
        float x, k, S = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap n: ");
        n = sc.nextInt();
        System.out.printf("Nhap x: ");
        x = sc.nextFloat();
        System.out.printf("Nhap k: ");
        k = sc.nextFloat();
        for(int i = 1; i <= n; i++)
        {
            giaithua *= i;
            if(i % 2 == 0)
            {
                S += giaithua / (Math.pow(x, i) - Math.pow(k, i));
            }
            else
            {
                S += giaithua / (Math.pow(x, i) + Math.pow(k, i)); 
            }
        }
        System.out.println("S = " + S);
    }
}

