package prac8;
import javax.swing.*;

class App1 extends JFrame {
    public App1() {
        setTitle("Number 8_1");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RandomShapes obj = new RandomShapes();
        this.add(obj);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(App1::new);
    }
}
