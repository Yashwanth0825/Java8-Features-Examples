package yashwanth.java8featureexamples.streams;

import org.junit.Test;
import yashwanth.java8featureexamples.common.Student;
import yashwanth.java8featureexamples.common.TestData;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StreamFilteringAndMappingTest {

    private List<Student> students = TestData.listOfStudents();

    @Test
    public void testExtractStudentNames() {
        List<String> actualStudents = StreamFilteringAndMapping.extractStudentNames(students);
        List<String> expectedStudents = Arrays.asList("Sachin Tendulkar", "Rahul Dravid", "Mithali Raj", "Smriti Mandana",
                                                     "Kapil Dev", "Virender Sehwag", "Harmanpreet Kaur", "Julan Goswami");
        assertEquals(expectedStudents.toString(), actualStudents.toString());
    }

    @Test
    public void testExtractStudentNamesSortedByFirstname() {
        List<String> actualStudents = StreamFilteringAndMapping.extractStudentNamesSortedByFirstname(students);
        List<String> expectedStudents = Arrays.asList("Harmanpreet Kaur", "Julan Goswami", "Kapil Dev", "Mithali Raj",
                                                      "Rahul Dravid", "Sachin Tendulkar", "Smriti Mandana", "Virender Sehwag");
        assertEquals(expectedStudents.toString(), actualStudents.toString());
    }

    @Test
    public void testExtractFemaleFirstnames() {
        List<String> actualStudents = StreamFilteringAndMapping.extractFemaleFirstnames(students);
        List<String> expectedStudents = Arrays.asList("Mithali", "Smriti", "Harmanpreet", "Julan");
        assertEquals(expectedStudents.toString(), actualStudents.toString());
    }

    @Test
    public void testExtractFirstTwoMaleNames() {
        List<String> actualStudents = StreamFilteringAndMapping.extractFirstTwoMaleNames(students);
        List<String> expectedStudents = Arrays.asList("Sachin Tendulkar", "Rahul Dravid");
        assertEquals(expectedStudents.toString(), actualStudents.toString());
    }

    @Test
    public void testSkipFirstTwoMaleNames() {
        List<String> actualStudents = StreamFilteringAndMapping.skipFirstTwoFemaleNames(students);
        List<String> expectedStudents = Arrays.asList("Harmanpreet Kaur", "Julan Goswami");
        assertEquals(expectedStudents.toString(), actualStudents.toString());
    }
}
