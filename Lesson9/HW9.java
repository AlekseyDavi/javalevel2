package Lesson9;


import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HW9 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(
                Arrays.asList(
                        new Student("Harry",
                                Arrays.asList(new Course("Maths"), new Course("Chemistry"), new Course("Biology"), new Course("Physics"))),
                        new Student("Oliver",
                                Arrays.asList(new Course("Biology"), new Course("Chemistry"))),
                        new Student("Jack",
                                Arrays.asList(new Course("Literature"))),
                        new Student("Charlie",
                                Arrays.asList(new Course("Maths"), new Course("Physics"))),
                        new Student("Thomas",
                                Arrays.asList(new Course("Chemistry"), new Course("Biology"))),
                        new Student("Thomas",
                                Arrays.asList(new Course("Maths"))),
                        new Student("Alfie",
                                Arrays.asList(new Course("Chemistry"), new Course("Physics"))),
                        new Student("Riley",
                                Arrays.asList(new Course("Literature"), new Course("Maths"), new Course("Physics")))
                )
        );
        System.out.println(students.stream()
                .map(student -> student.getAllCourse())
                .flatMap(courses -> courses.stream())
                .collect(Collectors.toSet())
        );
        System.out.println(students.stream()
                .sorted((s1, s2) -> s2.getAllCourse().size() - s1.getAllCourse().size())
                .limit(3)
                .collect(Collectors.toList()));
        Course course = new Course("Literature");
        System.out.println(students.stream()
                .filter(student -> student.getAllCourse().contains(course))
                .collect(Collectors.toSet()));
    }
}
