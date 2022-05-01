import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayPanel extends JPanel implements ActionListener {

    QuestionListener questionListener ;
    StringListener stringListener ;
    // celebrity buttons
    private JButton c1;
    private    JButton c2;
    private     JButton c3;
    private   JButton c4;
    private   JButton c5;
    //  disney buttons
    private   JButton d1;
    private   JButton d2;
    private   JButton d3;
    private   JButton d4;
    private   JButton d5;
    //  sports buttons
    private   JButton s1;
    private   JButton s2;
    private   JButton s3;
    private   JButton s4;
    private  JButton s5;
    //   music buttons
    private JButton m1;
    private  JButton m2;
    private   JButton m3;
    private  JButton m4;
    private  JButton m5;


    // Labels for buttons
    private  JLabel music ;
    private  JLabel sports;
    private  JLabel celebs;
    private  JLabel disney;



    public DisplayPanel(){












        //  Dimension d = getPreferredSize();
        //  d.width=250;
        //  setPreferredSize(d);
        //   setBorder(BorderFactory.createTitledBorder("Panel"));
        // Instantiating buttons
        //celebrity
        c1 = new JButton("100");
        c2 = new JButton("200");
        c3 = new JButton("300");
        c4 = new JButton("400");
        c5 = new JButton("500");
        // disney
        d1 = new JButton("100");
        d2 = new JButton("200");
        d3 = new JButton("300");
        d4 = new JButton("400");
        d5 = new JButton("500");
        //sports
        s1 = new JButton("100");
        s2 = new JButton("200");
        s3 = new JButton("300");
        s4 = new JButton("400");
        s5 = new JButton("500");
        // music
        m1 = new JButton("100");
        m2 = new JButton("200");
        m3 = new JButton("300");
        m4 = new JButton("400");
        m5 = new JButton("500");

        // instantiating labels
        music = new JLabel("Music");
        sports = new JLabel("Sports");
        disney = new JLabel("Disney");
        celebs = new JLabel("Celebs");


        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);
        c4.addActionListener(this);
        c5.addActionListener(this);

        s1.addActionListener(this);
        s2.addActionListener(this);
        s3.addActionListener(this);
        s4.addActionListener(this);
        s5.addActionListener(this);

        d1.addActionListener(this);
        d2.addActionListener(this);
        d3.addActionListener(this);
        d4.addActionListener(this);
        d5.addActionListener(this);

        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);
        m5.addActionListener(this);


        // setting text;
        s1.setText("100");
        s2.setText("200");
        s3.setText("300");
        s4.setText("400");
        s5.setText("500");

        m1.setText("100");
        m2.setText("200");
        m3.setText("300");
        m4.setText("400");
        m5.setText("500");

        c1.setText("100");
        c2.setText("200");
        c3.setText("300");
        c4.setText("400");
        c5.setText("500");

        d1.setText("100");
        d2.setText("200");
        d3.setText("300");
        d4.setText("400");
        d5.setText("500");
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();


        gc.fill= GridBagConstraints.NONE;
        gc.gridx=0;
        gc.gridy=0;
        gc.weightx=1;
        gc.weighty=0.1;
        add(celebs, gc);

        gc.gridx=0;
        gc.gridy=1;
        add(c1, gc);

        gc.gridx=0;
        gc.gridy=2;
        add(c2,gc);

        gc.gridx=0;
        gc.gridy=3;
        add(c3,gc);

        gc.gridx=0;
        gc.gridy=4;
        add(c4,gc);

        gc.gridx=0;
        gc.gridy=5;
        add(c5,gc);

        gc.gridx=1;
        gc.gridy=0;
        add(disney, gc);

        gc.gridx=1;
        gc.gridy=1;
        add(d1, gc);

        gc.gridx=1;
        gc.gridy=2;
        add(d2,gc);

        gc.gridx=1;
        gc.gridy=3;
        add(d3,gc);

        gc.gridx=1;
        gc.gridy=4;
        add(d4,gc);

        gc.gridx=1;
        gc.gridy=5;
        add(d5,gc);

        gc.gridx=2;
        gc.gridy=0;
        add(sports, gc);

        gc.gridx=2;
        gc.gridy=1;
        add(s1, gc);

        gc.gridx=2;
        gc.gridy=2;
        add(s2,gc);

        gc.gridx=2;
        gc.gridy=3;
        add(s3,gc);

        gc.gridx=2;
        gc.gridy=4;
        add(s4,gc);

        gc.gridx=2;
        gc.gridy=5;
        add(s5,gc);

        gc.gridx=3;
        gc.gridy=0;
        add(music, gc);

        gc.gridx=3;
        gc.gridy=1;
        add(m1, gc);

        gc.gridx=3;
        gc.gridy=2;
        add(m2,gc);

        gc.gridx=3;
        gc.gridy=3;
        add(m3,gc);

        gc.gridx=3;
        gc.gridy=4;
        add(m4,gc);

        gc.gridx=3;
        gc.gridy=5;
        add(m5,gc);
//add(disney,gc);
//add(sports,gc);
//add(music,gc);


    }
    int x;
    @Override
    public void actionPerformed(ActionEvent e) {


        int s11 = 0;
        int s22 = 0;
        int s33 = 0;
        int s44 = 0;
        int s55 = 0;

        int m11 = 0;
        int m22 =0;
        int m33 = 0;
        int m44 = 0;
        int m55 = 0;

        int d11 = 0;
        int d22 = 0;
        int d33 = 0;
        int d44 = 0;
        int d55 = 0;

        int c11 = 0;
        int c22 = 0;
        int c33 = 0;
        int c44 = 0;
        int c55 = 0;




        if(e.getSource()!=null){


            if(e.getSource()==s1){
                s11 = Integer.parseInt(s1.getText());
                s1.setVisible(false);
                x+=1;
            }
            else if (e.getSource()==s2){
                s22 = Integer.parseInt(s2.getText());
                s2.setVisible(false);
                x+=1;
            }
            else if(e.getSource()==s3){
                s33 = Integer.parseInt(s3.getText());
                s3.setVisible(false);
                x+=1;
            }
            else if (e.getSource()==s4){
                s44 = Integer.parseInt(s4.getText());
                s4.setVisible(false);
                x+=1;
            }
            else if (e.getSource()==s5){
                s55 = Integer.parseInt(s5.getText());
                s5.setVisible(false);
                x+=1;
            }
            else if (e.getSource()==m1){
                m11 = Integer.parseInt(m1.getText());
                m1.setVisible(false);
                x+=1;
            } else if (e.getSource()==m2){
                m22 = Integer.parseInt(m2.getText());
                m2.setVisible(false);
                x+=1;
            } else if (e.getSource()==m3){
                m33 = Integer.parseInt(m3.getText());
                m3.setVisible(false);
                x+=1;
            } else if (e.getSource()==m4){
                m44 = Integer.parseInt(m4.getText());
                m4.setVisible(false);
                x+=1;
            } else if (e.getSource()==m5){
                m55 = Integer.parseInt(m5.getText());
                m5.setVisible(false);
                x+=1;
            } else if (e.getSource()==d1){
                d11 = Integer.parseInt(d1.getText());
                d1.setVisible(false);
                x+=1;
            } else if (e.getSource()==d2){
                d22 = Integer.parseInt(d2.getText());
                d2.setVisible(false);
                x+=1;
            } else if (e.getSource()==d3){
                d33 = Integer.parseInt(d3.getText());
                d3.setVisible(false);
                x+=1;
            }
            else if (e.getSource()==d4){
                d44 = Integer.parseInt(d4.getText());
                d4.setVisible(false);
                x+=1;
            }
            else if (e.getSource()==d5){
                d55 = Integer.parseInt(d5.getText());
                d5.setVisible(false);
                x+=1;
            }
            else if (e.getSource()==c1){
                c11 = Integer.parseInt(c1.getText());
                c1.setVisible(false);
                x+=1;
            }
            else if (e.getSource()==c2){
                c22 = Integer.parseInt(c2.getText());
                c2.setVisible(false);
                x+=1;
            }
            else if (e.getSource()==c3){
                c33 = Integer.parseInt(c3.getText());
                c3.setVisible(false);
                x+=1;
            }
            else if (e.getSource()==c4){
                c44 = Integer.parseInt(c4.getText());
                c4.setVisible(false);
                x+=1;
            } else if (e.getSource()==c5){
                c55 = Integer.parseInt(c5.getText());
                c5.setVisible(false);
                x+=1;
            }


            DisplayEvent dispatchEvent = new DisplayEvent(this, s11,s22,s33,s44,s55,m11,m22,m33,m44,m55,d11,d22,d33,d44,d55,c11,c22,c33,c44,c55,x);
            questionListener.display(dispatchEvent);
        }

    }
    public void setStringListener(QuestionListener questionListener){
        this.questionListener= questionListener;
    }
}
