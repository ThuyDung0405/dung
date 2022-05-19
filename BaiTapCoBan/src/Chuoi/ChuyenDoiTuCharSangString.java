
package Chuoi;

public class ChuyenDoiTuCharSangString {
    public static void main(String[] args) {
        //su dung toString()
        char ch1 = 'a';
        String str1 = Character.toString(ch1);
        System.out.println("Chuoi la : "+str1);
        
        //su dung valueOf() 
        char ch2 = 'a';
        String str2 = String.valueOf(ch2);
        System.out.println("Chuoi la : "+str2);
    }
}
