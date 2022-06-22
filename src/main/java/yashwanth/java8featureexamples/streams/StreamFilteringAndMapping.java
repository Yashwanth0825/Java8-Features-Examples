package yashwanth.java8featureexamples.streams;

import yashwanth.java8featureexamples.common.Student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilteringAndMapping {

    public static List<String> extractStudentNames(List<Student> students) {
        return students.stream()
                .map(student -> student.getFirstName() + " " + student.getLastName())
                .collect(Collectors.toList());
    }

    public static List<String> extractStudentNamesSortedByFirstname(List<Student> students) {
        return students.stream()
                .sorted(Comparator.comparing(Student::getFirstName))
                .map(student -> student.getFirstName() + " " + student.getLastName())
                .collect(Collectors.toList());
    }

    public static List<String> extractFemaleFirstnames(List<Student> students) {
        return students.stream()
                .filter(student -> student.getGender().equals(Student.Gender.FEMALE))
                .map(student -> student.getFirstName())
                .collect(Collectors.toList());
    }

    public static List<String> extractFirstTwoMaleNames(List<Student> students) {
        return students.stream()
                .filter(student -> student.getGender().equals(Student.Gender.MALE))
                .limit(2)
                .map(student -> student.getFirstName() + " " + student.getLastName())
                .collect(Collectors.toList());
    }

    public static List<String> skipFirstTwoFemaleNames(List<Student> students) {
        return students.stream()
                .filter(student -> student.getGender().equals(Student.Gender.FEMALE))
                .skip(2)
                .map(student -> student.getFirstName() + " " + student.getLastName())
                .collect(Collectors.toList());
    }
}
