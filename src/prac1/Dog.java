package prac1;

public class Dog {
    private String name;
    private int age;
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Dog(String name){
        this(name, 0);
    }
    public Dog(){
        this("Pup",0);
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String toString(){
        return this.name + ", age " + this.age;
    }
    public void intoHumanAge(){
        System.out.println(name + "'s age in human years is " + age * 7 + " years");
    }
}
