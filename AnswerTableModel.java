import javax.swing.table.AbstractTableModel;

public class AnswerTableModel extends AbstractTableModel {
    String [] names = {"Celebrities","Disney", "Sport","Music"};
    @Override
    public String getColumnName(int column) {
        return names[column];
    }


    @Override
    public int getRowCount() {
        return 5;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int col) {
        if(row==0 && col==0){
            return "chris rock";
        }
        else if (row==0 && col==1){
            return "no worries";
        }
        else if (row==0 && col==2){
            return "nike";
        }
        else if (row==0 && col==3){
            return "micheal jackson";
        }
        else if (row==0 && col==4){
            return "micheal jackson";
        }


        else if (row==1 && col==0){
            return "daniel radcliffe";
        }
        else if (row==1 && col==1){
            return "sid";
        } else if (row==1 && col==2){
            return "tom brady";
        } else if (row==1 && col==3){
            return "spice girls";
        } else if (row==1 && col==4){
            return "spice girls";
        }


        else if (row==2 && col==0){
            return "ivanna";
        } else if (row==2 && col==1){
            return "4";
        } else if (row==2 && col==2){
            return "california";
        } else if (row==2 && col==3){
            return "the beatles";
        }
        else if (row==2 && col==4) {
            return "the beatles";
        }


        else if (row==3 && col==0){
            return "video music award";
        } else if (row==3 && col==1){
            return "1955";
        } else if (row==3 && col==2){
            return "brazil";
        }
        else if (row==3 && col==3){
            return "chicago";
        } else if (row==3 && col==4){
            return "chicago";
        }


        else if (row==4 && col==0){
            return "1956";
        } else if (row==4 && col==1){
            return "12";
        } else if (row==4 && col==2){
            return "nadal";
        }
        else if (row==4 && col==3){
            return "china";
        } else if (row==4 && col==4){
            return "china";
        }

        return null;
    }
}