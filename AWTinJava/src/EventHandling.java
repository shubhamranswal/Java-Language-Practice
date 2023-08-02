import java.awt.*;
import java.awt.event.*;
class EventHandling extends Frame {
    EventHandling() {
        Label label = new Label("Student Details");
        label.setBounds(150, 50, 400, 25);
        Label fName = new Label("First Name");
        fName.setBounds(20, 80, 80, 20);
        Label lName = new Label("Last Name");
        lName.setBounds(20, 120, 80, 20);
        Label dob = new Label("Date of Birth");
        dob.setBounds(20, 160, 80, 20);
        TextField fNameTF = new TextField();
        fNameTF.setBounds(120, 80, 200, 20);
        TextField lNameTF = new TextField();
        lNameTF.setBounds(120, 120, 200, 20);
        TextField dobTF = new TextField();
        dobTF.setBounds(120, 160, 200, 20);
        Button submit = new Button("Submit");
        submit.setBounds(150, 200, 100, 30);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Label newLabel = new Label("Your data has been recorded.");
                newLabel.setBounds(125, 250, 300, 100);
                add(newLabel);
            }});
        add(label);
        add(fName);
        add(lName);
        add(dob);
        add(fNameTF);
        add(lNameTF);
        add(dobTF);
        add(submit);}
    public static void main(String[] args) {
        EventHandling frame = new EventHandling();
        frame.setTitle("Event Handling");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);}
}