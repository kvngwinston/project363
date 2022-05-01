import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;

public class Toolbar extends JPanel {
    private JLabel scores;
    JLabel scoreField;
    JLabel password;
    JTextArea textArea;
    public Toolbar(){
        scores = new JLabel("Scores: ");
        scoreField = new JLabel("0");
        password = new JLabel("Password: ");
        textArea = new JTextArea();
        textArea.setEnabled(false);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(scores);
        add(scoreField);
        add(password);
        add(textArea);
    }

}