package yashwanth.java8featureexamples.common;

public class Student {

    public enum Gender {
        MALE, FEMALE
    }

    private final String firstName;
    private final String lastName;
    private final Integer rollNo;
    private Gender gender;

    public Student(String firstname, String lastName, Integer rollNo, Gender gender) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.rollNo = rollNo;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (rollNo != null ? !rollNo.equals(student.rollNo) : student.rollNo != null) return false;
        if (gender != student.gender) return false;
        if (lastName != null ? !lastName.equals(student.lastName) : student.lastName != null) return false;
        if (firstName != null ? !firstName.equals(student.firstName) : student.firstName != null) return false;

        return true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNo=" + rollNo +
                ", gender=" + gender +
                '}';
    }
}
