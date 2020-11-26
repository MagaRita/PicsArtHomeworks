package homework7.main;

import homework7.model.Student;
import homework7.service.FileService;
import homework7.service.StudentService;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) throws Exception {

        String[] read = FileService.read("C:\\Users\\ACER\\IdeaProjects\\PicsArtHomeworks\\src\\homework7\\students.txt");
        System.out.println(Arrays.toString(read));

        System.out.println("------------------------------");
        String str = Arrays.toString(read).substring(1, Arrays.toString(read).length()-1);
        System.out.println(str);
        System.out.println("------------------------------");

        String[] row = str.split(" ");
        StudentService sc = new StudentService();
        Student[] student = new Student[row.length];

        int updatedLength = sc.fillStudent(student,row);

        System.out.println("-----------------------");

        //Task 1: Print full names of students

        System.out.println("Task 1");
        System.out.println("Print full names of students");

        StudentService.printFullNamesOfStudents(student,updatedLength);

        System.out.println("-----------------------");

        //Task 2: Print all male students

        System.out.println("Task 2");
        System.out.println("Print all male students");

        StudentService.printMaleStudents(student,updatedLength);

        System.out.println("-----------------------");

        //Task 3: Print all female students who have a mark greater than 50.4

        System.out.println("Task 3");
        System.out.println("Print all female students who have a mark greater than 50.4");

        StudentService.printFemaleStudentsBasedOnMark(student,updatedLength);

        System.out.println("-----------------------");

        //Task 4: Print student information having the minimal mark

        System.out.println("Task 4");
        System.out.println("Print student information having the minimal mark");

        StudentService.printStudentWithMinimalMark(student,updatedLength);

        System.out.println("-----------------------");

        //Task 5: Print biggest male student information

        System.out.println("Task 5");
        System.out.println("Print biggest male student information");

        StudentService.printBiggestMaleStudentInfo(student,updatedLength);

        System.out.println("-----------------------");

        //Task 6: Print students sorted by mark

        System.out.println("Task 6");
        System.out.println("Print students sorted by mark");

        StudentService.printStudentsSortedByMark(student,updatedLength);

        //Task 7: Print female students sorted by year

        System.out.println("Task 7");
        System.out.println("Print female students sorted by year");

        StudentService.printFemaleStudentsSortedByYear(student,updatedLength);
    }
}
