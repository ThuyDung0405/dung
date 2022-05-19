package BTH4_Bai2;

public class Main {

    public static void main(String[] args) {

        Diem D1 = new Diem(3, 7);
        Diem D2 = new Diem(9, 3);
        D1.inTTDiem();
        D2.inTTDiem();
        System.out.println("Khoang cach D1 va D2 la : "+D1.tinhKhoangCach(D2));
    }
}
