package BTH2;

//Tim so nguyen to nho hon so n 
public class BTH2_Bai4 {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Cac so nguyen to nho hon "+n+" la: ");
        for (int i = 3; i < n; i++) {
            if (checkSoNguyenTo(i)) {
                System.out.println(i);
            }
        }

    }
// dùng for 
    public static boolean checkSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    
//dùng while 
   

}
