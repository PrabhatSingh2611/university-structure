import java.util.List;
import java.util.Objects;

public class Group {
    private String groupId;
    private List<Student> students;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    //
    public boolean equals(Object o) {
       return Objects.equals(groupId,((Group)o).groupId);
    }

    public int hashCode() {
        return Objects.hash(groupId, students);
    }

    public Group(String groupId, List<Student> groups) {
        this.groupId = groupId;
        this.students=groups;

    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId='" + groupId + '\'' ;
    }
}

