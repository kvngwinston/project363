import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    JTextArea textArea;
    public TextPanel(){
        textArea = new JTextArea();
        setLayout(new BorderLayout());
        add(textArea, BorderLayout.CENTER);
    }
    public void appendText(String s){
        textArea.append(s);
    }
}
