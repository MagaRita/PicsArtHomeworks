package homework7;

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

        Student[] student = new Student[row.length];

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

        int updatedLength = index;
        System.out.println("-----------------------");

        //Task 1: Print full names of students

        System.out.println("Task 1");
        System.out.println("Print full names of students");
        for (int i=0;i<updatedLength;i++){
            student[i].printFullName();
        }
        System.out.println("-----------------------");

        //Task 2: Print all male students

        System.out.println("Task 2");
        System.out.println("Print all male students");
        for(int i=0;i<updatedLength;i++){
            if(student[i].getGender() == 'm'){
                student[i].printStudentInfo();
            }
        }
        System.out.println("-----------------------");

        //Task 3: Print all female students who have a mark greater than 50.4

        System.out.println("Task 3");
        System.out.println("Print all female students who have a mark greater than 50.4");
        for(int i=0;i<updatedLength;i++){
            if(student[i].getGender() == 'f' && student[i].getMark() > 50.4){
                student[i].printStudentInfo();
            }
        }
        System.out.println("-----------------------");

        //Task 4: Print student information having the minimal mark

        System.out.println("Task 4");
        System.out.println("Print student information having the minimal mark");
        Student min = student[0];

        for(int i=1;i<updatedLength;i++){
            if(student[i].getMark() < min.getMark()){
                min = student[i];
            }
        }
        min.printStudentInfo();
        System.out.println("-----------------------");

        //Task 5: Print biggest male student information

        System.out.println("Task 5");
        System.out.println("Print biggest male student information");
        Student olderStudent = student[0];

        for(int i=1;i<updatedLength;i++){
            if(student[i].getGender() == 'm' && student[i].getYear() < olderStudent.getYear()){
                olderStudent = student[i];
            }
        }
        olderStudent.printStudentInfo();
        System.out.println("-----------------------");

        //Task 6: Print students sorted by mark

        System.out.println("Task 6");
        System.out.println("Print students sorted by mark");

        //Bubble sort

        Student temp;

        for(int i=0;i<updatedLength;i++) {
            for (int j = 1; j < updatedLength-i; j++) {
                if (student[j-1].getMark() > student[j].getMark()) {
                    temp = student[j-1];
                    student[j-1] = student[j];
                    student[j] = temp;
                }
            }
        }

        for(int i=0;i<updatedLength;i++){
            student[i].printStudentInfo();
            System.out.println("- - - - - - - - ");
        }

        //Task 7: Print female students sorted by year

        System.out.println("Task 7");
        System.out.println("Print female students sorted by year");

        for(int i=0;i<updatedLength;i++) {
            for (int j = 1; j < updatedLength-i; j++) {
                if (student[j-1].getYear() < student[j].getYear()) {
                    temp = student[j-1];
                    student[j-1] = student[j];
                    student[j] = temp;
                }
            }
        }

        for(int i=0;i<updatedLength;i++){
            if(student[i].getGender() == 'f'){
                student[i].printStudentInfo();
                System.out.println("- - - - - - - - ");
            }
        }

    }
}
