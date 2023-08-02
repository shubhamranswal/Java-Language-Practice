import java.awt.*;

public class FrameComponents extends Frame {
    FrameComponents() {
        Label fName = new Label("First Name");
        fName.setBounds(20, 50, 80, 20);

        Label lName = new Label("Last Name");
        lName.setBounds(20, 80, 80, 20);

        TextField fNameTF = new TextField();
        fNameTF.setBounds(120, 50, 100, 20);

        TextField lNameTF = new TextField();
        lNameTF.setBounds(120, 80, 100, 20);

        Button submit = new Button("Submit");
        submit.setBounds(20, 160, 100, 30);

        add(fName);
        add(lName);
        add(fNameTF);
        add(lNameTF);
        add(submit);
    }

    public static void main(String[] args) {
        FrameComponents frame = new FrameComponents();
        frame.setTitle("Components in AWT Frame!");
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}