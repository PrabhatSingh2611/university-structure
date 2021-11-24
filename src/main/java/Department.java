import java.util.List;
import java.util.Objects;

public class Department {
    private String name;
    private List<Group> groups;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    //
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department dept = (Department) o;
        return Objects.equals(name, dept.name) && Objects.equals(groups, dept.groups);
    }

    public int hashCode() {
        return Objects.hash(name, groups);
    }

    public Department(String name, List<Group> groups) {
        this.name = name;
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", groups=" + groups +
                '}';
    }
}
