package yashwanth.java8featureexamples.common;

import java.util.Arrays;
import java.util.List;

public class TestData {

    public static List<Mobile> listOfMobiles() {
        return Arrays.asList(
                new Mobile("Apple", "iPhone6", "White", 64, 1000),
                new Mobile("Apple", "iPhone7", "Black", 128, 1500),
                new Mobile("Samsung", "Note11", "White", 64, 900),
                new Mobile("Samsung", "S12", "White", 128, 800),
                new Mobile("OnePlus", "8T", "Black", 128, 700));
    }

    public static List<Student> listOfStudents() {
        return Arrays.asList(
                new Student("Sachin", "Tendulkar", 1, Student.Gender.MALE),
                new Student("Rahul", "Dravid", 2, Student.Gender.MALE),
                new Student("Mithali", "Raj", 3, Student.Gender.FEMALE),
                new Student("Smriti", "Mandana", 4, Student.Gender.FEMALE),
                new Student("Kapil", "Dev", 5, Student.Gender.MALE),
                new Student("Virender", "Sehwag", 6, Student.Gender.MALE),
                new Student("Harmanpreet", "Kaur", 7, Student.Gender.FEMALE),
                new Student("Julan", "Goswami", 8, Student.Gender.FEMALE));
    }
}
