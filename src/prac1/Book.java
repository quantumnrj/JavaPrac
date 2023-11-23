package prac1;

public class Book {
    int pages;
    String name;
    public Book (String name, int pages){
        this.pages = pages;
        this.name = name;
    }
    public Book (int pages){
        this("Undefined", pages);
    }
    public Book (String name){
        this(name, -1);
    }
    public Book (){
        this("Undefined", -1);
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getPages(){
        return this.pages;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return this.name + " book takes " + 1.5 * this.pages + " minutes to read";
    }
}
