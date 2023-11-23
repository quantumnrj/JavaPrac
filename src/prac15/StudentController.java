package prac15;

public class StudentController {
    protected Student model;
    protected StudentView view;

    public StudentController(Student model, StudentView view) {this.model = model; this.view = view;}

    public void updateView() {
        view.setName(getStudentName());
        view.setRollNo(getStudentRollNo());
        view.printStudentDetails();
    }

    public String getStudentName() {return this.model.getName();}
    public void setStudentName(String name) {this.model.setName(name);}
    public String getStudentRollNo() {return this.model.getRollNo();}
    public void setStudentRollNo(String rollNo) {this.model.setRollNo(rollNo);}
}