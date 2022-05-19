
package BTH4_Bai2;

public class Diem {
    double x,y,x1,y1;

    public Diem() {
    }

    public Diem(double x1, double y1) {
        x = x1;
        y = y1;
    }

    
    public void inTTDiem(){
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
    public double tinhKhoangCach(Diem d){
        return Math.sqrt((x-d.x)*(x-d.x)+(y-d.y)*(y-d.y));
    }
}
    