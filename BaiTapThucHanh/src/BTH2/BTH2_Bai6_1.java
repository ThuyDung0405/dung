
package BTH2;

import java.util.Scanner;

public class BTH2_Bai6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; 
        System.out.println("Nhap n : ");
        n = sc .nextInt();
        int sum =1;
        for(int i=2;i<=n;i++){
            sum+= (int) Math.pow(-1,i)*i;
        }System.out.println(sum);
    }
}
