import javax.swing.*;

public class SwingComponents extends JFrame{
    SwingComponents(){
        JLabel label = new JLabel("Student Details");
        label.setBounds(75,25,300,20);
        
        JLabel fName = new JLabel("First Name");
        fName.setBounds(20, 50, 80, 20);

        JLabel lName = new JLabel("Last Name");
        lName.setBounds(20, 80, 80, 20);

        JTextField fNameTF = new JTextField();
        fNameTF.setBounds(120, 50, 100, 20);

        JTextField lNameTF = new JTextField();
        lNameTF.setBounds(120, 80, 100, 20);

        JButton submit = new JButton("Submit");
        submit.setBounds(80, 120, 100, 30);

        add(label);
        add(fName);
        add(lName);
        add(fNameTF);
        add(lNameTF);
        add(submit);
    }
    public static void main(String[] args) {
        SwingComponents frame = new SwingComponents();
        frame.setTitle("Components in Java Swing!");
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
