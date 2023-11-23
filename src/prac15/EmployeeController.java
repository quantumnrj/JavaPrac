package prac15;

public class EmployeeController<T> {
    private Employee<T> people;
    private EmployeeView<T> view;
    public EmployeeController(Employee<T> people, EmployeeView<T> view) {
        setPeople(people);
        setView(view);
    }
    public void updateView() {
        view.setName(getPeople().getName());
        view.setSalary(getPeople().getSalary());
        view.printEmpDetails();
    }
    private void setPeople(Employee<T> people) {
        this.people = people;
    }
    private void setView(EmployeeView<T> view) {
        this.view = view;
    }
    public String getEmpName() {return people.getName();}
    public T getEmpVal() {return people.getSalary();}
    public void setEmpName(String name) {people.setName(name);}
    public void setEmpVal(T val) {people.setSalary(val);}
    private Employee<T> getPeople() {return people;}
}