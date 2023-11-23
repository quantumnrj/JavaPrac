package prac17;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.Stack;

public class LabClassUI<T> extends JFrame {
    private LabClass<T> clas;
    private JButton button = new JButton("print all");
    private JButton button1 = new JButton("add to end");
    private JButton button2 = new JButton("delete by id");
    private JTextArea area = new JTextArea();
    private JTextArea area1 = new JTextArea();
    private JTextArea area2 = new JTextArea();
    private JLabel label = new JLabel("Name");
    private JLabel label1 = new JLabel("id");
    private JLabel label2 = new JLabel("roll");
    public LabClassUI(T id) {
        setClassId(id);
        setTitle("num17-2");
        setSize(400, 400);
        setLayout(new GridLayout(3, 3));
        add(label);  add(label1);  add(label2);
        add(area);   add(area1);   add(area2);
        add(button); add(button1); add(button2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                print_all();
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add_to_end();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete_by_id();
            }
        });
    }
    private void add_to_end() {
        String check = area.getText();
        boolean f = true;
        if (check.length() > 1) {
            for (int i = 1; i < check.length(); i++) {
                if (check.toCharArray()[i-1] == '/' && check.toCharArray()[i] == 'n') {
                    f = false;
                    JOptionPane.showMessageDialog(this,
                            """
                                    Возникла ошибка при работе с данными.
                                    """,
                            "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (f) {
            try {
                T temp1 = (T) area1.getText();
                double temp2 = Double.parseDouble(area2.getText());
                Student<T> temp = new Student<>(area.getText(), temp1, temp2);
                clas.add(temp);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                        """
                                Возникла ошибка при работе с данными.
                                """,
                        "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
        }
        else throw new EmptyStringException("Error from input data.");
    }
    private void delete_by_id() {
        String check = area1.getText();
        boolean f = true;
        area.setText("");
        area1.setText("");
        area2.setText("");
        if (check.length() > 1) {
            for (int i = 1; i < check.length(); i++) {
                if (check.toCharArray()[i-1] == '/' && check.toCharArray()[i] == 'n') {
                    f = false;
                    JOptionPane.showMessageDialog(this,
                            """
                                    Возникла ошибка при работе с данными.
                                    """,
                            "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (f) {
            try {
                T id = (T) area1.getText();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, """
                        Error from input id
                        """, "Error", JOptionPane.ERROR_MESSAGE);
            }
            T id = (T) area1.getText();
            Stack<Student<T>> temp = clas.getList();
            boolean flag = true;
            for (int i = 0; i < temp.size(); i++) {
                if (temp.get(i).getId() == id) {
                    temp.remove(temp.get(i));
                    flag = false;
                }
            }
            if (f) {
                throw new StudentNotFoundException("Student is not found.");
            }
            else clas = new LabClass<>(temp, clas.getId_class());
        }
        else throw new EmptyStringException("Error from input data.");
    }
    private void print_all() {
        area.setText("");
        area1.setText("");
        area2.setText("");
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        for (Student<T> temp: clas.getList()) {
            builder.append(temp.getName()+"\n");
            builder1.append(temp.getId()+"\n");
            builder2.append(temp.getRoll()+"\n");
        }
        area.setText(builder.toString());
        area1.setText(builder1.toString());
        area2.setText(builder2.toString());
    }
    private void setClassId(T id) {this.clas = new LabClass<>(id);}
}
