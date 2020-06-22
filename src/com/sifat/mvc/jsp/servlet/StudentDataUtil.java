package com.sifat.mvc.jsp.servlet;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
    public static   List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mary","Public","mary@sifat.com"));
        students.add(new Student("John","Doe","John@sifat.com"));
        students.add(new Student("Sifat","Khan","sifat@sifat.com"));

       return students;
    }
}
