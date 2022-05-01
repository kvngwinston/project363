import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TablePanel extends JPanel {
    private JTable table;
    private AnswerTableModel answerTableModel;

    public TablePanel(){
        answerTableModel = new AnswerTableModel();
        table = new JTable(answerTableModel);


        setLayout(new BorderLayout());
        add(table, BorderLayout.CENTER);

    }




}
