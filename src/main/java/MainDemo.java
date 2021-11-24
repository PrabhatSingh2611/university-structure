import java.util.stream.Collectors;

public class MainDemo {
    public static void main(String[] args) {
        University record = new University(UniversityRecord.StudentRecords());

        /*1 ---The number of groups in which there is a low-performance student
         *2 ---Average performance by group
         *3 ---List of male-only group names
         *4 ---List of all students of the faculty/department
         *5 ---Average mark in the context of each subject
         *6 ---list of student of army draft age
         *7 ---list of faculty subjects
         *8 ---List of groups in which there are at least 2 excellent students
         *9 ---List of student with surname Singh
         *10 ---print records
         */


        //1 ------The number of groups in which there is a low-performance student
        record.getDepartment()
                .stream()
                .flatMap(department -> department.getGroups()
                        .stream())
                .collect(Collectors.toMap(groups -> groups.getGroupId()
                                , group -> group.getStudents()
                                        .stream()
                                        .filter(student -> student.getMarksPerSubject()
                                                .entrySet()
                                                .stream()
                                                .map(entry -> entry.getValue())
                                                .map(Integer::doubleValue)
                                                .reduce((marks1, marks2) -> (marks1 + marks2) / 2)
                                                .orElse(0.0) <= 60.0)
                                        .map(student -> student.getName())
                                        .collect(Collectors.toList())
                        )
                ).entrySet()
                .stream()
             .forEach(System.out::println);


        //2 ------Average performance by group
        record.getDepartment()
                .stream()
                .flatMap(department -> department.getGroups()
                        .stream())
                .collect(Collectors.toMap(groups -> groups.getGroupId(), group -> group.getStudents()
                        .stream()
                        .flatMap(student -> student.getMarksPerSubject()
                                .entrySet().stream())
                        .map(entry -> entry.getValue())
                        .map(Integer::doubleValue)
                        .reduce((marks1, marks2) -> (marks1 + marks2) / 2)
                        .orElse(0.0))
                ).entrySet()
                .stream();
        //      .forEach((p)-> System.out.println("Group name"+p.getKey()+"average performance: "+p.getValue()));


        //3 List of male-only group names
        record.getDepartment()
                .stream()
                .flatMap(department -> department.getGroups().stream())
                .filter(groups -> groups.getStudents()
                        .stream()
                        .map(student -> student.isGender())
                        .allMatch(p -> p)
                ).collect(Collectors.toList())
                .stream();
        //      .forEach(System.out::println);


        //4 ------List of all students of the faculty/department
        record.getDepartment()
                .stream()
                .collect(Collectors.toMap(
                                department -> department.getName(),
                                department -> department.getGroups()
                                        .stream().flatMap(groups -> groups.getStudents().stream())
                                        .collect(Collectors.toMap(Student::getName,
                                                Student::getSurname))
                        )
                ).entrySet().stream();
        //      .forEach(System.out::println);


        //5 ------Average mark in the context of each subject
        record.getDepartment()
                .stream()
                .flatMap(department -> department.getGroups().stream())
                .flatMap(groups -> groups.getStudents().stream())
                        .collect(Collectors.toMap(student -> student.getMarksPerSubject()
                                        .entrySet()
                                        .stream()
                                        .map(entry -> entry.getKey())
                                        .map(subject -> subject.getSubjectTitle()),
                                groups -> groups.getMarksPerSubject()
                                        .entrySet()
                                        .stream()
                                        .map(entry -> entry.getValue())
                                        .map(Integer::doubleValue)
                                        .reduce((m1,m2) -> (m1+m2) / 2)
                                        .orElse(0.0)
                                ,(p1,p2)-> p1)
                                        ).entrySet().stream();
               // .forEach(p -> System.out.println(p.getKey()+"value is"+p.getValue()));


        //6 ------to find list of student who are ready for army and are male
        record.getDepartment().stream()
                .flatMap(department -> department.getGroups().stream())
                .flatMap(group -> group.getStudents().stream())
                .filter(student -> student.isGender())
                .filter(student -> student.getAge() >= 18)
                .collect(Collectors.toList());
        //      .forEach(System.out::println);


        //7 ------list of faculty subjects
        record.getDepartment()
                .stream()
                .collect(Collectors.toMap(department -> department.getName(),
                                department -> department.getGroups()
                                        .stream()
                                        .flatMap(groups -> groups.getStudents().stream()
                                                .flatMap(student -> student.getMarksPerSubject()
                                                        .entrySet().stream())
                                                .map(entry -> entry.getKey().getSubjectTitle()))
                                        .distinct()
                                        .collect(Collectors.toList())
                        )
                ).entrySet().stream();
        //      .forEach(System.out::println);


        //8 ------List of groups in which there are at least 2 excellent students
        record.getDepartment()
                .stream()
                .flatMap(department -> department.getGroups().stream())
                .filter(groups -> groups.getStudents()
                        .stream()
                        .filter(student -> student.getMarksPerSubject()
                                .entrySet()
                                .stream()
                                .map(entry -> entry.getValue())
                                .map(Integer::doubleValue)
                                .reduce((marks1, marks2) -> (marks1 + marks2) / 2)
                                .orElse(0.0) >= 80.0)
                        .count() >= 2
                );
              //.forEach(System.out::println);


        //9 ------List of groups where students have surname singh
        record.getDepartment()
                .stream()
                .flatMap(department -> department.getGroups().stream())
                .filter(groups -> groups.getStudents()
                        .stream().anyMatch(student -> student.getSurname().equalsIgnoreCase("Singh")));
        //      .forEach(System.out::println);


       //10 ------Print Records
    /*    record.getDepartment()
                .stream()
                .forEach(department -> department.getGroups()
                        .stream()
                        .forEach(groups -> groups.getStudents()
                                .stream();
                                //.forEach((student) -> System.out.println("Department name : "+department.getName()+ "Group name : "+ groups.getGroupId() +student))));

*/
    }
}


