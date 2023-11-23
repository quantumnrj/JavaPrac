package prac15;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.Stack;

public class GUI extends JFrame {
    //interface
    private JLabel label = new JLabel("Name agent:");
    private JLabel label1 = new JLabel("Id agent:");
    private JLabel label2 = new JLabel("Rating:");
    private JLabel label3 = new JLabel("Effectiveness:");
    private JLabel label4 = new JLabel("");
    private JButton button = new JButton("Add");
    private JButton button1 = new JButton("Search(name)");
    private JButton button2 = new JButton("Search(id)");
    private JButton button3 = new JButton("Delete(id)");
    private JButton buttonDel = new JButton("Clear");
    private JTextArea area = new JTextArea();
    private JTextArea area1 = new JTextArea();
    private JTextArea area2 = new JTextArea();
    private JTextArea area3 = new JTextArea();
    // data application
    private Stack<AgentController<String>> list = new Stack<>();
    // temp data application
    private Stack<String> list_names = new Stack<>();
    private Stack<String> list_id = new Stack<>();
    private Stack<Double> list_reit = new Stack<>();
    private Stack<Double> list_valute = new Stack<>();
    private Stack<Integer> index_list = new Stack<>();
    public GUI() {
        setTitle("AgentInfo");
        setSize(1000, 600);
        setLayout(new GridLayout(3, 4));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(label);
        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(area);
        add(area1);
        add(area2);
        add(area3);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Add();
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SearchByName();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SearchById();
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeleteByIndex();
            }
        });
        buttonDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ClearFields();
            }
        });
        add(buttonDel);
        add(button);
        add(button1);
        add(button2);
        add(button3);
        setVisible(true);
    }
    private void updateTempData() {
        index_list.clear();
        list_names.clear();
        list_id.clear();
        list_reit.clear();
        list_valute.clear();
        for (int i = 0; i < list.size(); i++) {
            list_names.add(list.get(i).getAgentName());
            list_id.add(list.get(i).getAgentNumber());
            list_reit.add(list.get(i).getAgentReit());
            list_valute.add(list.get(i).getAgentValute());
        }
    }
    private void ClearFields(){
        area.setText("");
        area1.setText("");
        area2.setText("");
        area3.setText("");
    }
    private void SearchByName() {
        updateTempData();
        for (int i = 0; i < list_names.size(); i++) {
            if (Objects.equals(list_names.get(i), area.getText())) {
                index_list.add(i);
            }
        }
        StringBuilder text_name = new StringBuilder();
        StringBuilder text_id = new StringBuilder();
        StringBuilder text_reit = new StringBuilder();
        StringBuilder text_valute = new StringBuilder();
        for (int i = 0; i < index_list.size(); i++) {
            text_name.append(list.get(index_list.get(i)).getAgentName());
            text_name.append("\n");
            text_id.append(list.get(index_list.get(i)).getAgentNumber());
            text_id.append("\n");
            text_reit.append(list.get(index_list.get(i)).getAgentReit());
            text_reit.append("\n");
            text_valute.append(list.get(index_list.get(i)).getAgentValute());
            text_valute.append("\n");
        }
        area.setText(text_name.toString());
        area1.setText(text_id.toString());
        area2.setText(text_reit.toString());
        area3.setText(text_valute.toString());
    }
    private void SearchById() {
        updateTempData();
        for (int i = 0; i < list_id.size(); i++) {
            if (Objects.equals(list_id.get(i), area1.getText())) {
                index_list.add(i);
            }
        }
        StringBuilder text_name = new StringBuilder();
        StringBuilder text_id = new StringBuilder();
        StringBuilder text_reit = new StringBuilder();
        StringBuilder text_valute = new StringBuilder();
        for (int i = 0; i < index_list.size(); i++) {
            text_name.append(list.get(index_list.get(i)).getAgentName());
            text_name.append("\n");
            text_id.append(list.get(index_list.get(i)).getAgentNumber());
            text_id.append("\n");
            text_reit.append(list.get(index_list.get(i)).getAgentReit());
            text_reit.append("\n");
            text_valute.append(list.get(index_list.get(i)).getAgentValute());
            text_valute.append("\n");
        }
        area.setText(text_name.toString());
        area1.setText(text_id.toString());
        area2.setText(text_reit.toString());
        area3.setText(text_valute.toString());
    }
    private void Add() {
        if ((index_list.size() == 0 || index_list.size() == 1) && !Objects.equals(area.getText(), "") &&
                !Objects.equals(area1.getText(), "") && !Objects.equals(area2.getText(), "") &&
                !Objects.equals(area3.getText(), "")) {
            KontrAgent<String> agtemp = new KontrAgent<>();
            AgentView<String> vtemp = new AgentView<>();
            AgentController<String> temp = new AgentController<>(agtemp, vtemp);
            temp.setAgentName(area.getText());
            temp.setAgentNumber(area1.getText());
            temp.setAgentReit(Double.parseDouble(area2.getText()));
            temp.setAgentValute(Double.parseDouble(area3.getText()));
            temp.updateView();
            list.add(temp);
            updateTempData();
        }
    }
    private void DeleteByIndex() {
        if (index_list.size() == 0 || index_list.size() == 1) {
            boolean f = true;
            while (f) {
                if (list.size() == 0) f = false;
                for (int i = 0; i < list.size(); i++) {
                    if (Objects.equals(list.get(i).getAgentNumber(), area1.getText())) {
                        list.remove(i);
                        break;
                    }
                    if (i == list.size() - 1) f = false;
                }
            }
            updateTempData();
        }
    }
}
