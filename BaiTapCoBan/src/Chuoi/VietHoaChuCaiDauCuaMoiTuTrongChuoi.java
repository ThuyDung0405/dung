
package Chuoi;

import java.util.Scanner;

public class VietHoaChuCaiDauCuaMoiTuTrongChuoi {
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        a = sc.nextLine();
        //bien doi chuoi thanh mang chu cai
        char[] charArray = a.toCharArray();
        boolean khoangTrang = true;
        for(int i=0;i<charArray.length;i++){
            if(Character.isLetter(charArray[i])){//neu ki tu dau tien la chu cai
                if(khoangTrang){//neu truoc chu cai la khoang trang 
                   charArray[i] = Character.toUpperCase(charArray[i]);//in hoa chu cai do 
                   khoangTrang = false;
                   
                }
            }else khoangTrang =true;
        } 
        a = String.valueOf(charArray);
        System.out.println("Chuoi sau khi viet hoa chu cai dau la : "+a);
    }
}
