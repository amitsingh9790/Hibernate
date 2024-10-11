package beans;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Question {
    @Id
    int q_id;
    String Quesion;
    @OneToOne
    Answer answer;

    public Question() {
    }

    public int getQ_id() {
        return q_id;
    }

    public void setQ_id(int q_id) {
        this.q_id = q_id;
    }

    public String getQuesion() {
        return Quesion;
    }

    public void setQuesion(String quesion) {
        Quesion = quesion;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "q_id=" + q_id +
                ", Quesion='" + Quesion + '\'' +
                ", answer=" + answer +
                '}';
    }
}
