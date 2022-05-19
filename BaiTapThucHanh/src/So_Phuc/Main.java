/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package So_Phuc;

public class Main {
    public static void main(String[] args) {
        SoPhuc A = new SoPhuc();
        A.nhapSoPhuc();
        SoPhuc B = new SoPhuc();
        B.nhapSoPhuc();
        SoPhuc C1 = A.congSoPhuc(B);
        System.out.println("Tong la : ");
        C1.inSoPhuc();
        SoPhuc C =  A.nhanSoPhuc(B);
        System.out.println("Tich la: ");
        C.inSoPhuc();
    }
}
