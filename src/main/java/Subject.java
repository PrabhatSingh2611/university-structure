import java.util.Objects;

public class Subject {
    private String subjectTitle;

    public String getSubjectTitle() {
        return subjectTitle;
    }

    public void setSubjectTitle(String subjectTitle) {
        this.subjectTitle = subjectTitle;
    }

    //
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject sub = (Subject) o;
        return Objects.equals(subjectTitle, sub.subjectTitle);
    }

    public int hashCode() {
        return Objects.hash(subjectTitle);
    }

    public Subject(String subjectTitle) {
        this.subjectTitle = subjectTitle;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectTitle='" + subjectTitle + '\'' +
                '}';
    }
}
