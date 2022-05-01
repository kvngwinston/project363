import javax.swing.*;
import java.awt.*;

public class TableFrame extends JDialog {
    private TablePanel tablePanel;
    public TableFrame(JFrame frame ){
        super(frame, "answers", false);
        tablePanel = new TablePanel();
        setLayout(new BorderLayout());
        setSize(400,400);
        add(tablePanel, BorderLayout.CENTER);
    }
}
