import java.awt.*;

class MyFrameTwo extends Frame {
    MyFrameTwo() {
        TextField t = new TextField("JAVA AWT!");
        t.setBounds(150, 150, 150, 150);
        add(t);
    }

    public static void main(String args[]) {
        MyFrameTwo frame = new MyFrameTwo();
        frame.setTitle("Extending Frame");
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
