import java.util.EventObject;

public class SubmitEvent extends EventObject {
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    private String answer ;
    public SubmitEvent(Object source, String answer) {
        super(source);
        this.answer =answer;

    }
}
