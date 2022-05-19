/*
 So nhi phan
 */
package BTH2;

import java.util.Scanner;


public class BTH2_Bai2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        String nhiPhan = "";
        while(n>0){
            nhiPhan = (n%2)+nhiPhan;
            n = n/2;
        }System.out.println(nhiPhan);
    }
    
}
