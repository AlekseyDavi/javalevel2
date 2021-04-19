package Lesson9;

import java.util.List;

public class Student {
    private String name;
    private List<Course> allCourse;

    public Student(String name, List<Course> allCourse) {
        this.name = name;
        this.allCourse = allCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getAllCourse() {
        return allCourse;
    }

    public void setAllCourse(List<Course> allCourse) {
        this.allCourse = allCourse;
    }

    @Override
    public String toString() {
        return name;
    }
}
