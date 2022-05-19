/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTH2;

import java.util.Scanner;

public class BTH2_Bai6_2 {
    // ham tinh giai thua 
    public static int fact(int n){
        int gt = 1;
        int sum =0;
        for(int i=1;i<=n;i++){
            gt = gt*i;
            sum += gt;
        }return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Tong cac giai thua la : "+fact(n));
    }
}
