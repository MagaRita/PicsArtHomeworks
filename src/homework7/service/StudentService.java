package homework7.service;

import homework7.model.Student;

public class StudentService {

    public int fillStudent(Student[] student, String[] row){

        int defaultStudentMembers = 5;
        int index = 0;
        for(int i=0;i<row.length;i++){
            String[] member = row[i].split(",");
            if(member.length == defaultStudentMembers){
                student[index++] = new Student(member[0],member[1], Integer.parseInt(member[2]),
                        member[3].charAt(0), Double.parseDouble(member[4]));
            } else {
                System.out.println("Row " + i + " does not have all the student information.");
            }
        }

        return index;
    }

    //Task 1: Print full names of students

    public static void printFullNamesOfStudents(Student[] student, int leng){
        for (int i=0;i<leng;i++){
                System.out.println("The full name is: " + student[i].getFirstName() + " " +
                        student[i].getLastName());
        }
    }

    //Task 2: Print all male students

    public static void printMaleStudents(Student[] student, int leng){
        for(int i=0;i<leng;i++){
            if(student[i].getGender() == 'm'){
                student[i].printStudentInfo();
            }
        }
    }

    //Task 3: Print all female students who have a mark greater than 50.4

    public static void printFemaleStudentsBasedOnMark(Student[] student, int leng) {
        for(int i=0;i<leng;i++){
            if(student[i].getGender() == 'f' && student[i].getMark() > 50.4){
                student[i].printStudentInfo();
            }
        }
    }

    //Task 4: Print student information having the minimal mark

    public static void printStudentWithMinimalMark(Student[] student, int leng) {
        Student min = student[0];

        for(int i=1;i<leng;i++){
            if(student[i].getMark() < min.getMark()){
                min = student[i];
            }
        }
        min.printStudentInfo();
    }

    //Task 5: Print biggest male student information

    public static void printBiggestMaleStudentInfo(Student[] student, int leng) {
        Student olderStudent = student[0];

        for(int i=1;i<leng;i++){
            if(student[i].getGender() == 'm' && student[i].getYear() < olderStudent.getYear()){
                olderStudent = student[i];
            }
        }
        olderStudent.printStudentInfo();
    }

    //Task 6: Print students sorted by mark

    public static void printStudentsSortedByMark(Student[] student, int leng) {

        //Bubble sort

        Student temp;

        for(int i=0;i<leng;i++) {
            for (int j = 1; j < leng-i; j++) {
                if (student[j-1].getMark() > student[j].getMark()) {
                    temp = student[j-1];
                    student[j-1] = student[j];
                    student[j] = temp;
                }
            }
        }

        for(int i=0;i<leng;i++){
            student[i].printStudentInfo();
            System.out.println("- - - - - - - - ");
        }
    }

    //Task 7: Print female students sorted by year

    public static void printFemaleStudentsSortedByYear(Student[] student, int leng) {
        Student temp;

        for(int i=0;i<leng;i++) {
            for (int j = 1; j < leng-i; j++) {
                if (student[j-1].getYear() < student[j].getYear()) {
                    temp = student[j-1];
                    student[j-1] = student[j];
                    student[j] = temp;
                }
            }
        }

        for(int i=0;i<leng;i++){
            if(student[i].getGender() == 'f'){
                student[i].printStudentInfo();
                System.out.println("- - - - - - - - ");
            }
        }
    }
}
