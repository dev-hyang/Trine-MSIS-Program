package com.week3.project2;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class MyWeek3Project {
    public static void main(String[] args){
        Instructor instructor1 = new Instructor("Paul Renko", "Computer Science", LocalDate.parse("2023-01-01"));
        Instructor instructor2 = new Instructor("Abdalla Soliman", "Computer Science", LocalDate.parse("2020-01-01"));
        Course advancedDb = new Course("INF503", "Advanced Database", "MSIS", "2023FallTerm1", instructor1);
        Course oopInJava = new Course("IS5103", "OOP In Java", "MSIS", "2024SpringTerm1", instructor2);
        Course cybersecurity = new Course("IS5403", "Cybersecurity", "MSIS", "2024SpringTerm2");
        Student student1 = new Student("Hang Yang", "1538059", LocalDate.parse("2023-08-26"), "MSIS");
        student1.register(advancedDb);
        student1.register(oopInJava);
        student1.register(cybersecurity);
        student1.complete(advancedDb);
        System.out.println("****************************************");
        System.out.println("    Trine Student Information System    ");
        System.out.println("****************************************");
        System.out.println(student1);
    }
}

class Course {
    public String courseNum;
    public String courseName;
    public String major;
    public String term;
    public Instructor instructor;

    public Course(String courseNum, String name, String major, String term){
        this.courseNum = courseNum;
        this.courseName = name;
        this.major = major;
        this.term = term;
        this.instructor = null;
    }

    public Course(String courseNum, String name, String major, String term, Instructor instructor){
        this.courseNum = courseNum;
        this.courseName = name;
        this.major = major;
        this.term = term;
        this.instructor = instructor;
    }

    @Override
    public String toString(){
        return "Course: " + courseName + ", Major: " + major + ", Term: "
            + term + ", Instructor: " + ((instructor == null) ? "N/A" : instructor.fullname);
    }
}

class Instructor extends Person {
    public LocalDate employedAt;
    public String school;

    public Instructor(String name, String school, LocalDate employedAt){
        this.fullname = name;
        this.school = school;
        this.employedAt = employedAt;
    }
}

abstract class Person {
    public String fullname;
    public String email;
    public LocalDate dateOfBirth;
}

class Student extends Person {
    public String studentNum;
    public LocalDate enrolledDate;
    public String major;
    public Set<Course> completedCourses;
    public Set<Course> inProgressCourses;

    public Student(String name, String studentNum, LocalDate enrolledDate, String major){
        this.fullname = name;
        this.studentNum = studentNum;
        this.enrolledDate = enrolledDate;
        this.major = major;
        this.inProgressCourses = new HashSet<>();
        this.completedCourses = new HashSet<>();
    }

    public void register(Course course){
        if (inProgressCourses.add(course)) {
//            System.out.println("The course %s is registered successfully!".formatted(course.courseName));
        } else {
            System.out.println("The course %s failed to register!".formatted(course.courseName));
        }
    }

    public void complete(Course course){
        if (inProgressCourses.contains(course)) {
            inProgressCourses.remove(course);
            completedCourses.add(course);
        }
        else{
            System.out.println("The student has not registered the course %s yet.".formatted(course.courseName));
        }
    }

    public void withdraw(Course course){
        if (inProgressCourses.remove(course)){
//            System.out.println("The course %s is withdrawn successfully!".formatted(course.courseName));
        } else {
            System.out.println("The course %s failed to withdraw!".formatted(course.courseName));
        }
    }

    @Override
    public String toString(){
        StringBuilder sbCompletedCourses = new StringBuilder();
        completedCourses.forEach(course -> {
            sbCompletedCourses.append(course.toString());
            sbCompletedCourses.append("\n\t");
        });
        StringBuilder sbInProgCourses = new StringBuilder();
        inProgressCourses.forEach(course -> {
            sbInProgCourses.append(course.toString());
            sbInProgCourses.append("\n\t");
        });
        return """
            Student Fullname : %s
            Major            : %s
            Enrolled Date    : %s
            Completed Courses:
                %s
            InProgress Courses: 
                %s
            """.formatted(fullname, major, enrolledDate, sbCompletedCourses, sbInProgCourses);
    }
}