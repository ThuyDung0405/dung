
package BTH2;
import java.util.Scanner;
public class BTH2_Bai6_4 {
    public static void main(String[] args) {
        int n; 
        float sum =0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap so n: ");
            n = sc.nextInt();
            
        }while(n<1);
        for(int i=1;i<=n;i++){
            sum+=(float)i/(i+1);
        }
        System.out.println("Tong = "+sum);
    }
}
