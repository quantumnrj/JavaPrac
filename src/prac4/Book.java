package prac4;

public class Book {
    private int pages;
    private String name;
    private String author;
    public Book(String name, String author, int pages){
        this.pages = pages;
        this.name = name;
        this.author = author;
    }
    public int getPages() {
        return pages;
    }
    public String getAuthor() {
        return author;
    }
    public String getName() {
        return name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public String toString(){
        return "Book: " + this.name + " with " + this.pages + " pages, by author: " + this.author;
    }
}

