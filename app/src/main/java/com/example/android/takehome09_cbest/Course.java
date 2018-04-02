package com.example.android.takehome09_cbest;

public class Course {
    private String courseName;
    private String courseInstructor;
    private String courseDepartment;


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public String getCourseDepartment() {
        return courseDepartment;
    }

    public void setCourseDepartment(String courseDepartment) {
        this.courseDepartment = courseDepartment;
    }


    public Course(String courseName, String courseInstructor, String courseDepartment) {
        this.courseName = courseName;
        this.courseInstructor = courseInstructor;
        this.courseDepartment = courseDepartment;
    }

    @Override
    public String toString() {
        return "Course Name:" + courseName + "\nCourse Instructor:" + courseInstructor + "\nCourse Department: " + courseDepartment;
    }
}
