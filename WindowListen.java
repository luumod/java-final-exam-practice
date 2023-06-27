import javax.swing.*;
import java.awt.event.*;

public class WindowListen implements ActionListener {
    JTextField field;
    JButton button;
    JTextArea showArea;
    void setJTextField(JTextField field){
        this.field = field;
    }
    void setJButton(JButton button){
        this.button = button;
    }
    void setJTextArea(JTextArea showArea){
        this.showArea = showArea;
    }
    public void actionPerformed(ActionEvent e){
        String info = field.getText();
        showArea.append(info + '\n');
    }
}
