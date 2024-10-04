package beans;

import javax.persistence.*;

@Entity
@Table(name = "Std_table")
public class Student {
    @Id
    private int std_id;
    @Column(name = "std_name")
    private String name;
    @Column(name = "email")
    private String email ;
    @Transient
    private int rollno ;
    @Column(name = "city")
    private String city ;
    @Column(name = "gender")
    private String gender ;

    public Student(){
    }
    public Student(int std_id, String name, String email, int rollno, String city, String gender) {
        this.std_id = std_id;
        this.name = name;
        this.email = email;
        this.rollno = rollno;
        this.city = city;
        this.gender = gender;
    }

    public int getStd_id() {
        return std_id;
    }

    public void setStd_id(int std_id) {
        this.std_id = std_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "std_id=" + std_id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", rollno=" + rollno +
                ", city='" + city + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
