package prac15;
import javax.swing.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int choice = 0;
        System.out.println("0-exit 1-student 2-employee 3-GUI");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        switch (choice) {
            case 0:
                return;
            case 1:
                app_student();
                break;
            case 2:
                app_employee();
                break;
            case 3:
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        GUI window = new GUI();
                    }
                });
                break;
        }
    }
    public static void app_student() {
        Student model = retriveStudentFromDB();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Grigory");
        controller.setStudentRollNo("02");
        controller.updateView();
    }
    public static void app_employee(){
        Employee<Integer> obj = getEmp();
        EmployeeView<Integer> view = new EmployeeView<>();
        EmployeeController<Integer> contr = new EmployeeController<>(obj, view);
        contr.updateView();
        obj.setName("Viktor x2");
        obj.setSalary(200);
        contr.updateView();
    }
    private static Employee<Integer> getEmp() {
        Employee<Integer> obj = new Employee<>();
        obj.setName("Viktor");
        obj.setSalary(100);
        return obj;
    }
    private static Student retriveStudentFromDB(){
        Student student = new Student();
        student.setName("Pavel");
        student.setRollNo("01");
        return student;
    }
}
