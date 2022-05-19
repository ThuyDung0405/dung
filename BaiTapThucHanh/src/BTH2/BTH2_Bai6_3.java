/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTH2;

import java.util.Scanner;

/**
 *
 * @author Dung
 */
public class BTH2_Bai6_3 {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n: ");
        n = sc.nextInt();
        if(n%2==0){
            i =2;
        }else i =1;
        long sum =0;
        for(;i<=n;i+=2){
            sum+=i;
        }System.out.println("Tong la:" +sum);
    }
}
