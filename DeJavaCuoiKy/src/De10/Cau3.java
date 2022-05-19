/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De10;

/**
 *
 * @author arohigh
 */
public class Cau3 {

    public static void main(String args[]) {
        int value;  //mac dinh =0
//        args[0] = "10";
        try {

            value = Integer.parseInt("A10");
            System.out.println("value = " + value);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("loi cmnr");
        }
    }
}
