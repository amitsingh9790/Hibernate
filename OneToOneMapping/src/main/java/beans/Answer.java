package beans;
import javax.persistence.Entity; 
import javax.persistence.Id;

@Entity
public class Answer { 
    @Id
    private int a_id;
    private String answer;

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

    @Override
    public String toString() {
        return "Answer{" +
                "a_id=" + a_id +
                ", answer='" + answer + '\'' +
                '}';
    }
}
