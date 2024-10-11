package beans;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Question")
public class Question {
    @Id
    private int q_id;
    private String Question;
    @OneToMany(mappedBy = "question")
    private List<Answer> answerList;

    public Question() {
    }

    public int getQ_id() {
        return q_id;
    }

    public void setQ_id(int q_id) {
        this.q_id = q_id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }

    @Override
    public String toString() {
        return "Question{" +
                "q_id=" + q_id +
                ", Question='" + Question + '\'' +
                ", answerList=" + answerList +
                '}';
    }
}
