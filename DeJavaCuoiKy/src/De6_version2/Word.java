/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De6_version2;

/**
 *
 * @author arohigh
 */
public class Word {

    private int ID;
    private String En;
    private String Vn;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEn() {
        return En;
    }

    public void setEn(String En) {
        this.En = En;
    }

    public String getVn() {
        return Vn;
    }

    public void setVn(String Vn) {
        this.Vn = Vn;
    }

    public Word(int ID, String En, String Vn) {
        this.ID = ID;
        this.En = En;
        this.Vn = Vn;
    }

    public void show() {
        System.out.println("ID: " + this.ID + "\t|\tEn: " + this.En + "   \t|\tVn: " + this.Vn);
    }
}
