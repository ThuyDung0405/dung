/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De9;

/**
 *
 * @author arohigh
 */
public class Book {

    private String ID;
    private String Authors;
    private String Title;
//    private String[] Category = {"tap chi", "KHXH", "KHTN", "luan van"};
    private String Category;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAuthors() {
        return Authors;
    }

    public void setAuthors(String Authors) {
        this.Authors = Authors;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public Book(String ID, String Authors, String Title, String Category) {
        this.ID = ID;
        this.Authors = Authors;
        this.Title = Title;
        this.Category = Category;
    }

}
