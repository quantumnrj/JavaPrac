package prac15;

public class Employee<T> {
    private String name;
    private T salary;
    public Employee() {}
    public String getName() {return name;}
    public T getSalary() {return salary;}
    public void setName(String name) {this.name = name;}
    public void setSalary(T salary) {this.salary = salary;}
}
