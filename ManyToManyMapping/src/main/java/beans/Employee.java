package beans;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Emp_table")
public class Employee {
    @Id
    private int emp_id;
    private String emp_name;
    @ManyToMany(mappedBy = "employeeList") //Giving responsibility of mapping to project
    private List<Project> projectList;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", projectList=" + projectList +
                '}';
    }
}

