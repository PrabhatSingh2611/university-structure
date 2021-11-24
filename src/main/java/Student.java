import java.util.Map;
import java.util.Objects;

public class Student {
    private Integer id;
    private Integer age;
    private String name;
    private String surname;
    private boolean gender;

    private Map<Subject, Integer> marksPerSubject;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Map<Subject, Integer> getMarksPerSubject() {
        return marksPerSubject;
    }

    public void setMarksPerSubject(Map<Subject, Integer> marksPerSubject) {
        this.marksPerSubject = marksPerSubject;
    }

    //
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student std = (Student) o;
        return gender ==std.gender && Objects.equals(id, std.id) && Objects.equals(age, std.age) && Objects.equals(name, std.name) && Objects.equals(surname, std.surname) && Objects.equals(marksPerSubject, std.marksPerSubject);
    }

    public int hashCode() {
        return Objects.hash(id, age, name, surname, gender, marksPerSubject);
    }

    public Student(int id, int age, String name, String surname, boolean gender, Map<Subject, Integer> marksPerSubject) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.marksPerSubject = marksPerSubject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", marksPerSubject=" + marksPerSubject +
                '}';
    }
}
