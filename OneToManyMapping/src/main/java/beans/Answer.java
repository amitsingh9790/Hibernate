package beans;
import javax.persistence.*;

@Entity
@Table(name = "Answer")
public class Answer {
    @Id
    private int a_id;
    private String answer;
    @ManyToOne
    private Question question;

    public Answer() {
    }

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "a_id=" + a_id +
                ", answer='" + answer + '\'' +
                ", question=" + question +
                '}';
    }
}
