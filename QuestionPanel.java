import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuestionPanel extends JFrame {
    SubmitListener submitListener;
    public JLabel correct;
    private TextPanel textPanel;
    public JButton submit;
    public JLabel wrong;
    JLabel question;
    private JTextField answer;

    public JButton back;

    public QuestionPanel() {
        super("Questions");
        setSize(500, 500);
        getContentPane().setLayout(null);

        setBounds(100, 100, 467, 315);

        correct = new JLabel("Correct");
        wrong = new JLabel("wrong");
        question = new JLabel("Question: ");
        submit = new JButton("submit");
        back = new JButton("Back");

        wrong.setVisible(false);
        correct.setVisible(false);

        question.setFont(new Font("Ariel", Font.PLAIN, 10));
        question.setBounds(60, 50, 400, 74);
        add(question);


        correct.setFont(new Font("Ariel", Font.PLAIN, 20));
        correct.setBounds(140, 20, 181, 74);
        add(correct);

        wrong.setFont(new Font("Ariel", Font.PLAIN, 20));
        wrong.setBounds(140, 20, 181, 74);
        wrong.setVisible(false);
        add(wrong);

        answer = new JTextField(15);
        answer.setBounds(140, 110, 165, 25);
        add(answer);

        submit.setBounds(140,160,165,25);
        add(submit);

        back.setBounds(140,140,165,25);
        back.setVisible(false);
        add(back);

        // add(correct);
        // add(wrong);
        // add(question);
        //  add(answer);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText("");
                dispose();
                correct.setVisible(false);
                wrong.setVisible(false);
                back.setVisible(false);
            }
        });
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = answer.getText();
                System.out.println(text);
                SubmitEvent event = new SubmitEvent(this,text);
                submitListener.setControl(event);
                back.setVisible(true);
                submit.setVisible(false);
            }
        });
    }

    public void setQuestionText(String s){
        question.setText(s);
    }
    public void setSubmitListener(SubmitListener submitListener){
        this.submitListener=submitListener;
    }

}