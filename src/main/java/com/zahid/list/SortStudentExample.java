package com.zahid.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.zahid.human.Student;

public class SortStudentExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Alex"));
        studentList.add(new Student("Lee"));
        studentList.add(new Student("Cooper"));
        studentList.add(new Student("John"));
        studentList.add(new Student("Jane"));
        studentList.add(new Student("David"));

        System.out.println(studentList);

        // Collections.sort(studentList);

        // using anynmous inner class
        Collections.sort(studentList, new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
            
        });

        // using lambda function
        Collections.sort(studentList, (s1, s2) -> s1.getName().compareTo(s2.getName()));

        System.out.println(studentList);
        
    }
}
