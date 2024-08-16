package Assignment_15_Packages_2;

import Assignment_15_Packages_2.Courses.Courses;
import Assignment_15_Packages_2.Faculty.Faculty;
import Assignment_15_Packages_2.Students.Students;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        List<Courses> courseList=new ArrayList<>();
        List<Faculty> facultyList=new ArrayList<>();

        Students student1=new Students("Mithra","20CSE39",new ArrayList<>(Arrays.asList("DSA","OOPS")));
        Students student2=new Students("Dhivya","20ECE12",new ArrayList<>(Arrays.asList("MPCP","ES")));

        for(String val : student1.courses)
        {
            System.out.println(val);
        }

        Faculty fac1=new Faculty("Abinaya","fac123","DSA");
        facultyList.add(fac1);
        Faculty fac2=new Faculty("Shamili","fac112","OOPS");
        facultyList.add(fac2);
        Faculty fac3=new Faculty("Kavi","fac132","MPCP");
        facultyList.add(fac3);
        Faculty fac4=new Faculty("Priya","fac156","ES");
        facultyList.add(fac4);

        Courses c1=new Courses("DSA","CS1001");
        courseList.add(c1);
        Courses c2=new Courses("OOPS","CS1002");
        courseList.add(c2);
        Courses c3=new Courses("MPCP","CS1003");
        courseList.add(c3);
        Courses c4=new Courses("ES","CS1004");
        courseList.add(c4);

        Map<String,String> courseMap=new HashMap<>();
        for(Courses c : courseList)
        {
            courseMap.put(c.name,c.code);
        }

        Map<String,String> facultyMap = new HashMap<>();
        for(Faculty faculty : facultyList)
        {
            facultyMap.put(faculty.course,faculty.name);
        }

        display(student1,courseMap,facultyMap);
        System.out.println("-------------------------------------");
        display(student2,courseMap,facultyMap);
        System.out.println("-------------------------------------");

    }
    static void display(Students student,Map<String,String> courseMap,Map<String,String> facultyMap)
    {
        System.out.println("Student Name    : "+student.name);
        System.out.println("Student Id      : "+student.id);
        System.out.println("Course and Faculty Details");
        for(String codes : student.courses)
        {
            System.out.println(codes+"("+courseMap.get(codes)+") :"+facultyMap.get(codes));
        }
    }
}
