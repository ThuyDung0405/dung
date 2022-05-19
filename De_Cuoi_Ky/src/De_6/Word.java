/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De_6;

/**
 *
 * @author Dung
 */
public class Word {
        protected int id;
        protected String en;
        protected String vn;

    public Word() {
    }

    public Word(int id, String en, String vn) {
        this.id = id;
        this.en = en;
        this.vn = vn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }
        public void hienThi(){
            System.out.println("ID : "+this.getId()+"\t"+" Eng : "+this.getEn()+"\t"+" Vie : "+this.getVn());
        }
}
