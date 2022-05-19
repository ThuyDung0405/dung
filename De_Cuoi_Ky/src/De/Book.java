/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De;

/**
 *
 * @author Dung
 */
public class Book {
    private int id;
    private String author;
    private String title;
    private String Category;
    public Book() {
    }

    public Book(int id, String author, String title, String Category) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.Category = Category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", author=" + author + ", title=" + title + ", Category=" + Category + '}';
    }
   
}
