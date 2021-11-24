import java.util.List;
import java.util.Objects;

public class University {
    private List<Department> department;


    public List<Department> getDepartment() {
        return department;
    }

    public void setDepartment(List<Department> department) {
        this.department = department;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University univ = (University) o;
        return Objects.equals(department, univ.department);
    }

    public int hashCode() {
        return Objects.hash(department);
    }

    public University(List<Department> department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "University{" +
                "department=" + department +
                '}';
    }
}

