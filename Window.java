import javax.swing.*;
import java.awt.*;
public class Window extends JFrame{
    JTextField field;
    JButton button;
    JTextArea showArea;
    WindowListen listener;
    Window(){
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(){
        JPanel jpen1 = new JPanel();
        JLabel lab = new JLabel("please input");
        jpen1.add(lab);
        field = new JTextField(10);
        jpen1.add(field);
        button = new JButton("ok");
        jpen1.add(button);
        add(jpen1,BorderLayout.NORTH);
        showArea = new JTextArea();
        add(showArea,BorderLayout.CENTER);

        listener = new WindowListen();
        listener.setJTextField(field);
        listener.setJButton(button);
        listener.setJTextArea(showArea);
        button.addActionListener(listener);
        field.addActionListener(listener);    
    }
}
