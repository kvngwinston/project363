import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;

public class Mainframe extends JFrame {

    private  QuestionPanel questionPanel;
    private JTextArea textArea;
    private   DisplayPanel displayPanel ;
    private   JButton back ;
    private  Toolbar toolbar;

    private TableFrame tableFrame;

    private TablePanel tablePanel;

    private static String password;

    private PasswordDialog passwordDialog;
    int  totalPoints=0;
    public Mainframe(){
        super("Jeopardy Game");
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        questionPanel = new QuestionPanel();
        displayPanel = new DisplayPanel();
        textArea = new JTextArea();
        toolbar = new Toolbar();
        passwordDialog = new PasswordDialog(Mainframe.this);
        tableFrame = new TableFrame(Mainframe.this);
        password = "complete";
        tablePanel = new TablePanel();

        back = new JButton("Back");
        String correctAnswer = "";

        setJMenuBar(createMenuBar());

        add(toolbar, BorderLayout.NORTH);


        add(displayPanel, BorderLayout.CENTER);

        displayPanel.setStringListener(new QuestionListener() {
            @Override
            public void display(DisplayEvent event) {
                questionPanel.submit.setVisible(true);
                if(event.getX()==20){


                    try {
                        Random random = new Random();
                        password = String.valueOf(random.nextInt());
                        encryptPassword(password);
                        toolbar.textArea.setEnabled(true);
                        toolbar.textArea.setText(encryptPassword(password));
                        passwordDialog.setVerifyListener(new VerifyListener() {
                            String answer = encryptPassword(password);
                            @Override

                            public void checkPassword(String check) {
                                if(check.equals(answer)){
                                    tableFrame.setVisible(true);
                                }
                                else{
                                    System.out.println("wrong");
                                }

                            }
                        });


                    } catch (NoSuchAlgorithmException e) {
                        throw new RuntimeException(e);
                    } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException(e);
                    }

                }

                if(event.getC1()!=0){
                    questionPanel.setVisible(true);
                    questionPanel.setQuestionText(celebrityHash(event.getC1()));
                    questionPanel.setSubmitListener(new SubmitListener() {
                        @Override
                        public void setControl(SubmitEvent e) {
                            String answer = e.getAnswer();
                            answer = answer.toLowerCase();

                            if(answer.equals(celebrityHashAnswers(event.getC1()))){
                                questionPanel.correct.setVisible(true);
                                LLS.count++;
                                LLS.arr[LLS.count]=100;
                                totalPoints+=100;
                                toolbar.scoreField.setText(totalPoints+"");
                            }
                            else{
                                questionPanel.wrong.setVisible(true);
                            }

                        }

                    });
                }
                else if (event.getC2()!=0){
                    questionPanel.setVisible(true);
                    questionPanel.setQuestionText(celebrityHash(event.getC2()));
                    questionPanel.setSubmitListener(new SubmitListener() {
                        @Override
                        public void setControl(SubmitEvent e) {
                            String answer = e.getAnswer();
                            answer = answer.toLowerCase();


                            if(answer.equals(celebrityHashAnswers(event.getC2()))){
                                questionPanel.correct.setVisible(true);
                                LLS.count++;
                                LLS.arr[LLS.count]=200;
                                totalPoints+=200;
                                toolbar.scoreField.setText(totalPoints+"");
                            }
                            else{
                                questionPanel.wrong.setVisible(true);
                            }
                        }
                    });
                }
                else if (event.getC3()!=0){
                    questionPanel.setVisible(true);
                    questionPanel.setQuestionText(celebrityHash(event.getC3()));
                    questionPanel.setSubmitListener(new SubmitListener() {
                        @Override
                        public void setControl(SubmitEvent e) {
                            String answer = e.getAnswer();
                            answer = answer.toLowerCase();


                            if(answer.equals(celebrityHashAnswers(event.getC3()))){
                                questionPanel.correct.setVisible(true);
                                LLS.count++;
                                LLS.arr[LLS.count]=300;
                                totalPoints+=300;
                                toolbar.scoreField.setText(totalPoints+"");
                            }
                            else{
                                questionPanel.wrong.setVisible(true);
                            }
                        }
                    });
                }
                else if (event.getC4()!=0) {
                    questionPanel.setVisible(true);
                    questionPanel.setQuestionText(celebrityHash(event.getC4()));
                    questionPanel.setSubmitListener(new SubmitListener() {
                        @Override
                        public void setControl(SubmitEvent e) {
                            String answer = e.getAnswer();
                            answer = answer.toLowerCase();


                            if(answer.equals(celebrityHashAnswers(event.getC4()))){
                                questionPanel.correct.setVisible(true);
                                LLS.count++;
                                LLS.arr[LLS.count]=400;
                                totalPoints+=400;
                                toolbar.scoreField.setText(totalPoints+"");
                            }
                            else{
                                questionPanel.wrong.setVisible(true);
                            }
                        }
                    });
                }
                else if (event.getC5()!=0){
                    questionPanel.setVisible(true);
                    questionPanel.setQuestionText(celebrityHash(event.getC5()));
                    questionPanel.setSubmitListener(new SubmitListener() {
                        @Override
                        public void setControl(SubmitEvent e) {
                            String answer = e.getAnswer();
                            answer = answer.toLowerCase();


                            if(answer.equals(celebrityHashAnswers(event.getC5()))){
                                questionPanel.correct.setVisible(true);
                                LLS.count++;
                                LLS.arr[LLS.count]=500;
                                totalPoints+=500;
                                toolbar.scoreField.setText(totalPoints+"");
                            }
                            else{
                                questionPanel.wrong.setVisible(true);
                            }
                        }
                    });
                }else if (event.getD1()!=0){
                    questionPanel.setVisible(true);
                    questionPanel.setQuestionText(disneyHash(event.getD1()));

                    questionPanel.setSubmitListener(new SubmitListener() {
                        @Override
                        public void setControl(SubmitEvent e) {
                            String answer = e.getAnswer();
                            answer = answer.toLowerCase();


                            if(answer.equals(disneyHashAnswers(event.getD1()))){
                                questionPanel.correct.setVisible(true);
                                LLS.count++;
                                LLS.arr[LLS.count]=100;
                                totalPoints+=100;
                                toolbar.scoreField.setText(totalPoints+"");
                            }
                            else{
                                questionPanel.wrong.setVisible(true);
                            }
                        }
                    });
                }
                else if (event.getD2()!=0){
                    questionPanel.setVisible(true);
                    questionPanel.setQuestionText(disneyHash(event.getD2()));
                    questionPanel.setSubmitListener(new SubmitListener() {
                        @Override
                        public void setControl(SubmitEvent e) {
                            String answer = e.getAnswer();
                            answer = answer.toLowerCase();


                            if(answer.equals(disneyHashAnswers(event.getD2()))){
                                questionPanel.correct.setVisible(true);
                                LLS.count++;
                                LLS.arr[LLS.count]=200;
                                totalPoints+=200;
                                toolbar.scoreField.setText(totalPoints+"");
                            }
                            else{
                                questionPanel.wrong.setVisible(true);
                            }
                        }
                    });
                }
                else if (event.getD3()!=0){
                    questionPanel.setVisible(true);
                    questionPanel.setQuestionText(disneyHash(event.getD3()));
                    questionPanel.setSubmitListener(new SubmitListener() {
                        @Override
                        public void setControl(SubmitEvent e) {
                            String answer = e.getAnswer();
                            answer = answer.toLowerCase();


                            if(answer.equals(disneyHashAnswers(event.getD3()))){
                                questionPanel.correct.setVisible(true);
                                LLS.count++;
                                LLS.arr[LLS.count]=300;
                                totalPoints+=300;
                                toolbar.scoreField.setText(totalPoints+"");
                            }
                            else{
                                questionPanel.wrong.setVisible(true);
                            }
                        }
                    });
                }else if (event.getD4()!=0){
                    questionPanel.setVisible(true);
                    questionPanel.setQuestionText(disneyHash(event.getD4()));
                    questionPanel.setSubmitListener(new SubmitListener() {
                        @Override
                        public void setControl(SubmitEvent e) {
                            String answer = e.getAnswer();
                            answer = answer.toLowerCase();


                            if(answer.equals(disneyHashAnswers(event.getD4()))){
                                questionPanel.correct.setVisible(true);
                                LLS.count++;
                                LLS.arr[LLS.count]=400;
                                totalPoints+=400;
                                toolbar.scoreField.setText(totalPoints+"");
                            }
                            else{
                                questionPanel.wrong.setVisible(true);
                            }
                        }
                    });

                }else if (event.getD5()!=0){
                    questionPanel.setVisible(true);
                    questionPanel.setQuestionText(disneyHash(event.getD5()));
                    questionPanel.setSubmitListener(new SubmitListener() {
                        @Override
                        public void setControl(SubmitEvent e) {
                            String answer = e.getAnswer();
                            answer = answer.toLowerCase();


                            if(answer.equals(disneyHashAnswers(event.getD5()))){
                                questionPanel.correct.setVisible(true);
                                LLS.count++;
                                LLS.arr[LLS.count]=500;
                                totalPoints+=500;
                                toolbar.scoreField.setText(totalPoints+"");
                            }
                            else{
                                questionPanel.wrong.setVisible(true);
                            }
                        }
                    });
                }
                else if (event.getS1()!=0){
                    questionPanel.setVisible(true);
                    questionPanel.setQuestionText(sportHash(event.getS1()));
                    questionPanel.setSubmitListener(new SubmitListener() {
                        @Override
                        public void setControl(SubmitEvent e) {
                            String answer = e.getAnswer();
                            answer = answer.toLowerCase();


                            if(answer.equals(sportHashAnswers(event.getS1()))){
                                questionPanel.correct.setVisible(true);
                                LLS.count++;
                                LLS.arr[LLS.count]=100;
                                totalPoints+=100;
                                toolbar.scoreField.setText(totalPoints+"");
                            }
                            else{
                                questionPanel.wrong.setVisible(true);
                            }
                        }
                    });
                }else if (event.getS2()!=0){
                    questionPanel.setVisible(true);
                    questionPanel.setQuestionText(sportHash(event.getS2()));
                    questionPanel.setSubmitListener(new SubmitListener() {
                        @Override
                        public void setControl(SubmitEvent e) {
                            String answer = e.getAnswer();
                            answer = answer.toLowerCase();


                            if(answer.equals(sportHashAnswers(event.getS2()))){
                                questionPanel.correct.setVisible(true);
                                LLS.count++;
                                LLS.arr[LLS.count]=200;
                                totalPoints+=200;
                                toolbar.scoreField.setText(totalPoints+"");
                            }
                            else{
                                questionPanel.wrong.setVisible(true);
                            }
                        }
                    });
                }else if (event.getS3()!=0){
                    questionPanel.setVisible(true);
                    questionPanel.setQuestionText(sportHash(event.getS3()));
                    questionPanel.setSubmitListener(new SubmitListener() {
                        @Override
                        public void setControl(SubmitEvent e) {
                            String answer = e.getAnswer();
                            answer = answer.toLowerCase();


                            if(answer.equals(sportHashAnswers(event.getS3()))){
                                questionPanel.correct.setVisible(true);
                                LLS.count++;
                                LLS.arr[LLS.count]=300;
                                totalPoints+=300;
                                toolbar.scoreField.setText(totalPoints+"");
                            }
                            else{
                                questionPanel.wrong.setVisible(true);
                            }
                        }
                    });
                }
                else if (event.getS4()!=0){
                    questionPanel.setVisible(true);
                    questionPanel.setQuestionText(sportHash(event.getS4()));
                    questionPanel.setSubmitListener(new SubmitListener() {
                        @Override
                        public void setControl(SubmitEvent e) {
                            String answer = e.getAnswer();
                            answer = answer.toLowerCase();


                            if(answer.equals(sportHashAnswers(event.getS4()))){
                                questionPanel.correct.setVisible(true);
                                LLS.count++;
                                LLS.arr[LLS.count]=400;
                                totalPoints+=400;
                                toolbar.scoreField.setText(totalPoints+"");
                            }
                            else{
                                questionPanel.wrong.setVisible(true);
                            }
                        }
                    });
                }
                else if (event.getS5()!=0){
                    questionPanel.setVisible(true);
                    questionPanel.setQuestionText(sportHash(event.getS5()));
                    questionPanel.setSubmitListener(new SubmitListener() {
                        @Override
                        public void setControl(SubmitEvent e) {
                            String answer = e.getAnswer();
                            answer = answer.toLowerCase();


                            if(answer.equals(sportHashAnswers(event.getS5()))){
                                questionPanel.correct.setVisible(true);
                                LLS.count++;
                                LLS.arr[LLS.count]=500;
                                totalPoints+=500;
                                toolbar.scoreField.setText(totalPoints+"");
                            }
                            else{
                                questionPanel.wrong.setVisible(true);
                            }
                        }
                    });
                }
                else if (event.getM1()!=0){
                    questionPanel.setVisible(true);
                    questionPanel.setQuestionText(musicHas(event.getM1()));
                    questionPanel.setSubmitListener(new SubmitListener() {
                        @Override
                        public void setControl(SubmitEvent e) {
                            String answer = e.getAnswer();
                            answer = answer.toLowerCase();


                            if(answer.equals(musicHashAnswers(event.getM1()))){
                                questionPanel.correct.setVisible(true);
                                LLS.count++;
                                LLS.arr[LLS.count]=100;
                                totalPoints+=100;
                                toolbar.scoreField.setText(totalPoints+"");
                            }
                            else{
                                questionPanel.wrong.setVisible(true);
                            }
                        }
                    });
                }
                else if (event.getM2()!=0){
                    questionPanel.setVisible(true);
                    questionPanel.setQuestionText(musicHas(event.getM2()));
                    questionPanel.setSubmitListener(new SubmitListener() {
                        @Override
                        public void setControl(SubmitEvent e) {
                            String answer = e.getAnswer();
                            answer = answer.toLowerCase();

                            if(answer.equals(musicHashAnswers(event.getM2()))){
                                questionPanel.correct.setVisible(true);
                                totalPoints+=200;
                                LLS.count++;
                                LLS.arr[LLS.count]=200;
                                toolbar.scoreField.setText(totalPoints+"");
                            }
                            else{
                                questionPanel.wrong.setVisible(true);
                            }
                        }
                    });

                }
                else if (event.getM3()!=0){
                    questionPanel.setVisible(true);
                    questionPanel.setQuestionText(musicHas(event.getM3()));
                    questionPanel.setSubmitListener(new SubmitListener() {
                        @Override
                        public void setControl(SubmitEvent e) {
                            String answer = e.getAnswer();
                            answer = answer.toLowerCase();


                            if(answer.equals(musicHashAnswers(event.getM3()))){
                                questionPanel.correct.setVisible(true);
                                LLS.count++;
                                LLS.arr[LLS.count]=300;
                                totalPoints+=300;
                                toolbar.scoreField.setText(totalPoints+"");
                            }
                            else{
                                questionPanel.wrong.setVisible(true);
                            }
                        }
                    });
                }
                else if (event.getM4()!=0){
                    questionPanel.setVisible(true);
                    questionPanel.setQuestionText(musicHas(event.getM4()));
                    questionPanel.setSubmitListener(new SubmitListener() {
                        @Override
                        public void setControl(SubmitEvent e) {
                            String answer = e.getAnswer();
                            answer = answer.toLowerCase();


                            if(answer.equals(musicHashAnswers(event.getM4()))){
                                questionPanel.correct.setVisible(true);
                                LLS.count++;
                                LLS.arr[LLS.count]=400;
                                totalPoints+=400;
                                toolbar.scoreField.setText(totalPoints+"");
                            }
                            else{
                                questionPanel.wrong.setVisible(true);
                            }
                        }
                    });
                }
                else if (event.getM5()!=0){
                    questionPanel.setVisible(true);
                    questionPanel.setQuestionText(musicHas(event.getM5()));
                    questionPanel.setSubmitListener(new SubmitListener() {
                        @Override
                        public void setControl(SubmitEvent e) {
                            String answer = e.getAnswer();
                            answer = answer.toLowerCase();


                            if(answer.equals(musicHashAnswers(event.getM5()))){
                                questionPanel.correct.setVisible(true);
                                LLS.count++;
                                LLS.arr[LLS.count]=500;
                                totalPoints+=500;
                                toolbar.scoreField.setText(totalPoints+"");
                            }
                            else{
                                questionPanel.wrong.setVisible(true);
                            }
                        }
                    });
                }
            }
        });
    };
    public static String celebrityHash(int point){
        HashMap<Integer, String> questions = new HashMap<>();
        HashMap<Integer, String> answers = new HashMap<>();

        questions.put(100, "Who got slapped by Will Smith at the 2022 Oscars?");
        questions.put(200, "Who acted the harry potter movie?");
        questions.put(300, "What was the first name of Donald Trump's first wife?");
        questions.put(400, "In the VMA awards show held every fall, what does \"VMA\" stand for?");
        questions.put(500, " In what year was Tom Hanks born?");


        return questions.get(point);
    }
    public static String celebrityHashAnswers(int point){

        HashMap<Integer, String> answers = new HashMap<>();


        answers.put(100, "chris rock");
        answers.put(200, "daniel radcliffe");
        answers.put(300, "ivanna");
        answers.put(400, "video music award");
        answers.put(500, "1956");

        return answers.get(point);
    }
    public static String musicHas(int point){
        HashMap<Integer, String> questions = new HashMap<>();


        questions.put(100, "Who is the singer that is known as the King of Pop");
        questions.put(200, "What is the name of a british girl band whose name is related to a condiment?");
        questions.put(300, "Who is the top selling artist?");
        questions.put(400, "Where is house music originated from?");
        questions.put(500, "In which country did Kanye West live when he was ten years old?");



        return questions.get(point);
    }
    public static String musicHashAnswers(int point){
        HashMap<Integer, String> answers = new HashMap<>();

        answers.put(100, "micheal jackson");
        answers.put(200, "spice girls");
        answers.put(300, "the beatles");
        answers.put(400, "chicago");
        answers.put(500, "china");

        return answers.get(point);
    }
    public static String sportHash(int point){
        HashMap<Integer, String> questions = new HashMap<>();

        questions.put(100,"What company logo has a swoosh?" );
        questions.put(200,"Who has won the most rings in the NFL?");
        questions.put(300,"Which state has the most number of NBA teams?" );
        questions.put(400,"What national team has won the most world cups?");
        questions.put(500,"Who has won the most grand slams?");

        return questions.get(point);
    }
    public static String sportHashAnswers(int point){

        HashMap<Integer, String> answers = new HashMap<>();



        answers.put(100,"nike");
        answers.put(200, "tom brady");
        answers.put(300,"california");
        answers.put(400,"brazil");
        answers.put(500,"nadal");

        return answers.get(point);
    }
    public static String disneyHash(int d1){
        HashMap<Integer, String> questions = new HashMap<>();


        questions.put(100,"What does Hakuna Matata mean" );
        questions.put(200,"What is the name of Andy’s neighbor in Toy Story");
        questions.put(300," How many fingers does Mickey Mouse have?" );
        questions.put(400," What year did Disneyland open?");
        questions.put(500,"How many brothers does Prince Hans of the Southern Isles have in Frozen?");

        return questions.get(d1);
    }
    public static String disneyHashAnswers(int d1){

        HashMap<Integer, String> answers = new HashMap<>();


        answers.put(100,"no worries");
        answers.put(200, "sid");
        answers.put(300,"4" );
        answers.put(400,"1955");
        answers.put(500,"12");

        return answers.get(d1);
    }
    private static String encryptPassword(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        MessageDigest crypt = MessageDigest.getInstance("SHA-1");
        crypt.reset();
        crypt.update(password.getBytes("UTF-8"));

        return new BigInteger(1, crypt.digest()).toString(16);
    }
    private JMenuBar createMenuBar(){
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem showPassword = new JMenuItem("Get Answers");
        fileMenu.add(showPassword);
        menuBar.add(fileMenu);

        showPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passwordDialog.setVisible(true );
            }
        });
        return menuBar;
    }
}