import javax.swing.*;
import java.awt.*;

public class myResults {

    public void myResults() {
        JFrame f = new JFrame("Question");
        f.setBounds(100, 100, 467, 315);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setLayout(null);
        f.setVisible(true);


        JLabel showScore = new JLabel(LLS.sortAP());
        showScore.setFont(new Font("Ariel", Font.PLAIN, 10));
        showScore.setBounds(10,20,181,74);
        showScore.setVisible(true);
        f.getContentPane().add(showScore);



    }
}