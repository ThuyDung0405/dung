/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTH1;

import java.util.Scanner;

/**
 *
 * @author Dung
 */
public class BTH1_Bai1 {

   
    public static void main(String[] args) {
        int a[];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so canh cua da giac : ");
        n = sc.nextInt();
        a = new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("a[%d] = ",i);
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("Canh cua da giac la : ");
            System.out.println(a[i]);
        }
        int sum =0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        System.out.println(" Chu vi da giac la : "+sum);
    }
    
}
