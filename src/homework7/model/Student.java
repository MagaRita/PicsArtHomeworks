package homework7.model;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private char gender;
    private double mark;

    public Student(String firstName, String lastName, int year, char gender, double mark) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.gender = gender;
        this.mark = mark;
    }

    public void printStudentInfo(){
        System.out.println("The full name is: " + firstName + " " + lastName);
        System.out.println("The student was born in " + year);
        System.out.println("The student is " + (gender=='m'?"male":"female"));
        System.out.println("The student mark is " + mark);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYear() {
        return year;
    }

    public char getGender() {
        return gender;
    }

    public double getMark() {
        return mark;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
