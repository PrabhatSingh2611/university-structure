import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;


public class UniversityRecord {
    public static List StudentRecords() {

        //department one
        //list one
        List<Student> studentList1 = new ArrayList<>();
        Map<Subject, Integer> map1 = new HashMap<>();
        map1.put(new Subject("C++"), 88);
        map1.put(new Subject("Data Structure"), 84);
        map1.put(new Subject("Python"), 86);
        map1.put(new Subject("Java"), 82);
        studentList1.add(new Student(101, 26, "Rupam", "Singh", false, map1));
        Map<Subject, Integer> map2 = new HashMap<>();
        map2.put(new Subject("C++"), 64);
        map2.put(new Subject("Data Structure"), 55);
        map2.put(new Subject("Python"), 58);
        map2.put(new Subject("Java"), 65);
        studentList1.add(new Student(102, 24, "Prabhat", "Singh", true, map2));
        Map<Subject, Integer> map3 = new HashMap<>();
        map3.put(new Subject("C++"), 80);
        map3.put(new Subject("Data Structure"), 88);
        map3.put(new Subject("Python"), 89);
        map3.put(new Subject("Java"), 83);
        studentList1.add(new Student(103, 26, "Rupali", "Singh", false, map3));
        Map<Subject, Integer> map4 = new HashMap<>();
        map4.put(new Subject("C++"), 74);
        map4.put(new Subject("Data Structure"), 52);
        map4.put(new Subject("Python"), 57);
        map4.put(new Subject("Java"), 68);
        studentList1.add(new Student(104, 23, "Saifali", "Maurya", false, map4));

        List<Group> groupList1 = new ArrayList<>();
        groupList1.add(new Group("grp1 = 1.1", studentList1));

        //list two
        List<Student> studentList2 = new ArrayList<>();
        Map<Subject, Integer> map5 = new HashMap<>();
        map5.put(new Subject("C++"), 82);
        map5.put(new Subject("Data Structure"), 94);
        map5.put(new Subject("Python"), 88);
        map5.put(new Subject("Java"), 79);
        studentList2.add(new Student(101, 24, "Namrata", "Raut", false, map5));
        Map<Subject, Integer> map6 = new HashMap<>();
        map6.put(new Subject("C++"), 65);
        map6.put(new Subject("Data Structure"), 63);
        map6.put(new Subject("Python"), 61);
        map6.put(new Subject("Java"), 70);
        studentList2.add(new Student(102, 25, "Ravi", "Raj", true, map6));
        Map<Subject, Integer> map7 = new HashMap<>();
        map7.put(new Subject("C++"), 78);
        map7.put(new Subject("Data Structure"), 86);
        map7.put(new Subject("Python"), 81);
        map7.put(new Subject("Java"), 87);
        studentList2.add(new Student(103, 26, "Abhishek", "Kumar", true, map7));
        Map<Subject, Integer> map8 = new HashMap<>();
        map8.put(new Subject("C++"), 63);
        map8.put(new Subject("Data Structure"), 71);
        map8.put(new Subject("Python"), 72);
        map8.put(new Subject("Java"), 66);
        studentList2.add(new Student(104, 24, "Revati", "Navgire", false, map8));

        groupList1.add(new Group("grp1 = 1.2", studentList2));

        //list three
        List<Student> studentList3 = new ArrayList<>();
        Map<Subject, Integer> map9 = new HashMap<>();
        map9.put(new Subject("C++"), 44);
        map9.put(new Subject("Data Structure"), 55);
        map9.put(new Subject("Python"), 56);
        map9.put(new Subject("Java"), 57);
        studentList3.add(new Student(101, 25, "Vishal", "Yadav", true, map9));
        Map<Subject, Integer> map10 = new HashMap<>();
        map10.put(new Subject("C++"), 64);
        map10.put(new Subject("Data Structure"), 72);
        map10.put(new Subject("Python"), 84);
        map10.put(new Subject("Java"), 82);
        studentList3.add(new Student(102, 23, "Jignesh", "Wadhel", true, map10));
        Map<Subject, Integer> map11 = new HashMap<>();
        map11.put(new Subject("C++"), 82);
        map11.put(new Subject("Data Structure"), 88);
        map11.put(new Subject("Python"), 85);
        map11.put(new Subject("Java"), 84);
        studentList3.add(new Student(103, 24, "Rikita", "Shetty", false, map11));
        Map<Subject, Integer> map12 = new HashMap<>();
        map12.put(new Subject("C++"), 65);
        map12.put(new Subject("Data Structure"), 69);
        map12.put(new Subject("Python"), 57);
        map12.put(new Subject("Java"), 48);
        studentList3.add(new Student(104, 25, "Jyoti", "Singh", false, map12));

        groupList1.add(new Group("grp1 = 1.3", studentList3));

        List<Department> deptList = new ArrayList<>();
        deptList.add(new Department("Dept1 = Information Technology ", groupList1));

//department two
        List<Student> studentList4 = new ArrayList<>();
        Map<Subject, Integer> map13 = new HashMap<>();
        map13.put(new Subject("Law"), 44);
        map13.put(new Subject("Accounts"), 48);
        map13.put(new Subject("Business Management"), 52);
        map13.put(new Subject("Economics"), 50);
        studentList4.add(new Student(101, 22, "Bhoomi", "Thakur", false, map13));
        Map<Subject, Integer> map14 = new HashMap<>();
        map14.put(new Subject("Law"), 67);
        map14.put(new Subject("Accounts"), 65);
        map14.put(new Subject("Business Management"), 48);
        map14.put(new Subject("Economics"), 72);
        studentList4.add(new Student(102, 22, "Shamta", "Sharma", false, map14));
        Map<Subject, Integer> map15 = new HashMap<>();
        map15.put(new Subject("Law"), 42);
        map15.put(new Subject("Accounts"), 58);
        map15.put(new Subject("Business Management"), 54);
        map15.put(new Subject("Economics"), 51);
        studentList4.add(new Student(103, 26, "Rohit", "Tiwari", true, map15));
        Map<Subject, Integer> map16 = new HashMap<>();
        map16.put(new Subject("Law"), 49);
        map16.put(new Subject("Accounts"), 58);
        map16.put(new Subject("Business Management"), 54);
        map16.put(new Subject("Economics"), 45);
        studentList4.add(new Student(104, 24, "Rajesh", "Verma", true, map16));

        List<Group> groupList2 = new ArrayList<>();
        groupList2.add(new Group("grp2 = 2.1", studentList4));

        //list two
        List<Student> studentList5 = new ArrayList<>();
        Map<Subject, Integer> map17 = new HashMap<>();
        map17.put(new Subject("Law"), 42);
        map17.put(new Subject("Accounts"), 44);
        map17.put(new Subject("Business Management"), 48);
        map17.put(new Subject("Economics"), 41);
        studentList5.add(new Student(101, 23, "Umesh", "Rathod", true, map17));
        Map<Subject, Integer> map18 = new HashMap<>();
        map18.put(new Subject("Law"), 82);
        map18.put(new Subject("Accounts"), 81);
        map18.put(new Subject("Business Management"), 84);
        map18.put(new Subject("Economics"), 87);
        studentList5.add(new Student(102, 23, "Priya", "Panwar", false, map18));
        Map<Subject, Integer> map19 = new HashMap<>();
        map19.put(new Subject("Law"), 45);
        map19.put(new Subject("Accounts"), 51);
        map19.put(new Subject("Business Management"), 52);
        map19.put(new Subject("Economics"), 48);
        studentList5.add(new Student(103, 22, "Harshada", "Sawant", false, map19));
        Map<Subject, Integer> map20 = new HashMap<>();
        map20.put(new Subject("Law"), 48);
        map20.put(new Subject("Accounts"), 44);
        map20.put(new Subject("Business Management"), 48);
        map20.put(new Subject("Economics"), 54);
        studentList5.add(new Student(104, 23, "Jaya", "Panwar", true, map20));

        groupList2.add(new Group("grp2 = 2.2", studentList5));

        //list three
        List<Student> studentList6 = new ArrayList<>();
        Map<Subject, Integer> map21 = new HashMap<>();
        map21.put(new Subject("Law"), 68);
        map21.put(new Subject("Accounts"), 75);
        map21.put(new Subject("Business Management"), 72);
        map21.put(new Subject("Economics"), 69);
        studentList6.add(new Student(101, 26, "Rahul", "Tiwari", true, map21));
        Map<Subject, Integer> map22 = new HashMap<>();
        map22.put(new Subject("Law"), 51);
        map22.put(new Subject("Accounts"), 54);
        map22.put(new Subject("Business Management"), 60);
        map22.put(new Subject("Economics"), 48);
        studentList6.add(new Student(102, 25, "Ajeet", "Chavan", true, map22));
        Map<Subject, Integer> map23 = new HashMap<>();
        map23.put(new Subject("Law"), 48);
        map23.put(new Subject("Accounts"), 42);
        map23.put(new Subject("Business Management"), 44);
        map23.put(new Subject("Economics"), 51);
        studentList6.add(new Student(103, 26, "Amit", "Singh", true, map23));
        Map<Subject, Integer> map24 = new HashMap<>();
        map24.put(new Subject("Law"), 55);
        map24.put(new Subject("Accounts"), 47);
        map24.put(new Subject("Business Management"), 62);
        map24.put(new Subject("Economics"), 72);
        studentList6.add(new Student(104, 26, "Chandan", "Singh", true, map24));

        groupList2.add(new Group("grp2 = 2.3", studentList6));

        deptList.add(new Department("Dept2 = Commerce", groupList2));

//department three
        List<Student> studentList7 = new ArrayList<>();
        Map<Subject, Integer> map25 = new HashMap<>();
        map25.put(new Subject("Neurology"), 65);
        map25.put(new Subject("Cardiology"), 64);
        map25.put(new Subject("General surgery"), 71);
        map25.put(new Subject("Health Dynamics"), 58);
        studentList7.add(new Student(101, 24, "Mahima", "Parmar", false, map25));
        Map<Subject, Integer> map26 = new HashMap<>();
        map26.put(new Subject("Neurology"), 48);
        map26.put(new Subject("Cardiology"), 58);
        map26.put(new Subject("General surgery"), 62);
        map26.put(new Subject("Health Dynamics"), 57);
        studentList7.add(new Student(102, 23, "Aamina", "Khan", false, map26));
        Map<Subject, Integer> map27 = new HashMap<>();
        map27.put(new Subject("Neurology"), 82);
        map27.put(new Subject("Cardiology"), 88);
        map27.put(new Subject("General surgery"), 85);
        map27.put(new Subject("Health Dynamics"), 86);
        studentList7.add(new Student(103, 24, "Humaira", "Shaikh", false, map27));
        Map<Subject, Integer> map28 = new HashMap<>();
        map28.put(new Subject("Neurology"), 48);
        map28.put(new Subject("Cardiology"), 45);
        map28.put(new Subject("General surgery"), 61);
        map28.put(new Subject("Health Dynamics"), 71);
        studentList7.add(new Student(104, 24, "Vinit", "Kanojia", true, map28));

        List<Group> groupList3 = new ArrayList<>();
        groupList3.add(new Group("grp3 = 3.1", studentList7));

        //list two
        List<Student> studentList8 = new ArrayList<>();
        Map<Subject, Integer> map29 = new HashMap<>();
        map29.put(new Subject("Neurology"), 57);
        map29.put(new Subject("Cardiology"), 55);
        map29.put(new Subject("General surgery"), 56);
        map29.put(new Subject("Health Dynamics"), 59);
        studentList8.add(new Student(101, 26, "Abhishek", "Pawar", true, map29));
        Map<Subject, Integer> map30 = new HashMap<>();
        map30.put(new Subject("Neurology"), 66);
        map30.put(new Subject("Cardiology"), 65);
        map30.put(new Subject("General surgery"), 61);
        map30.put(new Subject("Health Dynamics"), 69);
        studentList8.add(new Student(102, 23, "Harsh", "Satla", true, map30));
        Map<Subject, Integer> map31 = new HashMap<>();
        map31.put(new Subject("Neurology"), 72);
        map31.put(new Subject("Cardiology"), 78);
        map31.put(new Subject("General surgery"), 84);
        map31.put(new Subject("Health Dynamics"), 78);
        studentList8.add(new Student(103, 25, "Sunny ", "Vishwakarma", true, map31));
        Map<Subject, Integer> map32 = new HashMap<>();
        map32.put(new Subject("Neurology"), 55);
        map32.put(new Subject("Cardiology"), 56);
        map32.put(new Subject("General surgery"), 48);
        map32.put(new Subject("Health Dynamics"), 55);
        studentList8.add(new Student(104, 24, "Krishna", "Jha", true, map32));

        groupList3.add(new Group("grp3 = 3.2", studentList8));

        //list three
        List<Student> studentList9 = new ArrayList<>();
        Map<Subject, Integer> map33 = new HashMap<>();
        map33.put(new Subject("Neurology"), 84);
        map33.put(new Subject("Cardiology"), 86);
        map33.put(new Subject("General surgery"), 81);
        map33.put(new Subject("Health Dynamics"), 82);
        studentList9.add(new Student(101, 22, "Milee", "Gupta", false, map33));
        Map<Subject, Integer> map34 = new HashMap<>();
        map34.put(new Subject("Neurology"), 65);
        map34.put(new Subject("Cardiology"), 67);
        map34.put(new Subject("General surgery"), 61);
        map34.put(new Subject("Health Dynamics"), 69);
        studentList9.add(new Student(102, 23, "Muskan", "Shaikh", false, map34));
        Map<Subject, Integer> map35 = new HashMap<>();
        map35.put(new Subject("Neurology"), 71);
        map35.put(new Subject("Cardiology"), 75);
        map35.put(new Subject("General surgery"), 85);
        map35.put(new Subject("Health Dynamics"), 72);
        studentList9.add(new Student(103, 24, "Gauri", "Sharma", false, map35));
        Map<Subject, Integer> map36 = new HashMap<>();
        map36.put(new Subject("Neurology"), 69);
        map36.put(new Subject("Cardiology"), 78);
        map36.put(new Subject("General surgery"), 55);
        map36.put(new Subject("Health Dynamics"), 65);
        studentList9.add(new Student(101, 23, "Neha", "Singh", false, map36));

        groupList3.add(new Group("grp3 = 3.3", studentList9));

        deptList.add(new Department("Dept3 = Medical", groupList3));
        return deptList;


    }
}
